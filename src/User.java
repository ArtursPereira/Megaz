import java.util.ArrayList;
import java.util.Scanner;


public class User {
    private String email;
    private String senha;
    private String nome;
    private String relacionamento;
    private int idade;
    private int id;

    private ArrayList<Post> posts;
    private ArrayList<Follow> followers;

    public User() {
    }

    public User(String email, String senha, String nome, String relacionamento, int idade) {
        this.email = email;
        this.senha = senha;
        this.nome = nome;
        this.relacionamento = relacionamento;
        this.idade = idade;
    }

    public User(String email, String senha, String nome, String relacionamento, int idade, int id, ArrayList<Post> posts, ArrayList<Follow> followers) {
        this.email = email;
        this.senha = senha;
        this.nome = nome;
        this.relacionamento = relacionamento;
        this.idade = idade;
        this.id = id;
        this.posts = posts;
        this.followers = followers;
    }

    public User(ArrayList<Post> posts, ArrayList<Follow> followers, String nome) {
        this.posts = posts;
        this.followers = followers;
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRelacionamento() {
        return relacionamento;
    }

    public void setRelacionamento(String relacionamento) {
        this.relacionamento = relacionamento;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Post> getPosts() {
        return posts;
    }

    public void setPosts(ArrayList<Post> posts) {
        this.posts = posts;
    }

    public ArrayList<Follow> getFollowers() {
        return followers;
    }

    public void setFollowers(ArrayList<Follow> followers) {
        this.followers = followers;
    }

    public void Fazer_Cadastro() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escreva seu nome");
        this.nome = scanner.nextLine();
        System.out.println("Escreva seu relacionamento");
        this.relacionamento = scanner.nextLine();
        System.out.println("Escreva seu email");
        this.email = scanner.nextLine();
        System.out.println("Escreva sua senha");
        this.senha = scanner.nextLine();
        System.out.println("Escreva sua idade");
        this.idade = scanner.nextInt();
    }

    public void Status() {
        System.out.println("Informações da Sua conta: ");
        System.out.println("Email: " + this.email);
        System.out.println("Nome: " + this.nome);
        System.out.println("Relacionamento: " + this.relacionamento);
        System.out.println("Idade: " + this.idade);
        System.out.println("ID: " + this.id);
    }

    public User Cadastro_Login(ArrayList<User> users) {
        int escolha;
        int constante = 5;
        Scanner scanner = new Scanner(System.in);
        User logado = new User();

        do {
            logado.Interface_Login_Cadastro();
            escolha = scanner.nextInt();
            switch (escolha) {
                case 1:
                    User usuario = new User();
                    usuario.Fazer_Cadastro();
                    users.add(usuario);
                    constante++;
                    usuario.setId(constante);
                    usuario.Status();
                    break;
                case 2:
                    System.out.println("Escreva seu email");
                    String teste_email = scanner.next();
                    System.out.println("Escreva seu senha");
                    String teste_senha = scanner.next();
                    for (User user : users){
                        if(user.getEmail().contentEquals(teste_email) && user.getSenha().contentEquals(teste_senha)){
                            System.out.println("Voce foi logado");
                            logado = user;
                            escolha = 0;
                            break;
                        }
                    }
            }
        }while(escolha!=0);
        return logado;
    }

    public void Interface_Login_Cadastro() {
        System.out.println("Bem vindo ao Megaz");
        System.out.println("1 Cadastro ");
        System.out.println("2 Login ");
    }

    public void Interface_Changes() {
        System.out.println("what do you want to change?");
        System.out.println("1 Change password");
        System.out.println("2 Change relationship");
        System.out.println("3 Change Name");
        System.out.println("0 Back");
    }

    public User Change_Password(User usuario) {
        Scanner scanner = new Scanner(System.in);
        int escolha3 = 0;
        do {

            System.out.println("Write your password");
            String teste_senha = scanner.next();
            System.out.println(teste_senha + "    " + usuario.getSenha());
            if(teste_senha.equals(usuario.getSenha())){
                System.out.println("Write your new password");
                String nova_senha = scanner.next();
                usuario.setSenha(nova_senha);
                escolha3 = 23; // aft
            }
            else{
                System.out.println("Incorrect password, try again");
            }
        }while(escolha3!=23);
        return usuario;
    }

}
