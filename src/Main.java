import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        User usuario = new User();
        // dados usado para teste
        User usuario1 = new User("lg@", "123", "LG", "Pai de familia", 76);
        User usuario2 = new User("igor@", "456", "Igor", "namorando", 24);
        User usuario3 = new User("zad@", "787", "Zadoque", "casado", 21);
        User usuario4 = new User("mb@", "345", "Marcos Bruno", "namorando", 23);
        User usuario5 = new User("lucas@", "234000", "Lucas", "solteiro", 24);
        //que senha feia

        ArrayList<User> users = new ArrayList<>();
        users.add(usuario1);
        users.add(usuario2);
        users.add(usuario3);
        users.add(usuario4);
        users.add(usuario5);

        // programa
        usuario = usuario.Cadastro_Login(users);
        usuario.Status();
        Scanner scanner = new Scanner(System.in);
        int escolha, escolha2;
        do {
            System.out.println("1 Status");
            System.out.println("2 Change Status");
            System.out.println("3 Show posts");
            System.out.println("4 See my posts");
            System.out.println("5 Make a post");
            System.out.println("0 Logout");
            escolha = scanner.nextInt();
            switch (escolha) {
                case 1:
                    usuario.Status();
                    break;
                case 2:
                    usuario.Status();
                    do {
                        usuario.Interface_Changes();
                        escolha2 = scanner.nextInt();
                        switch (escolha2) {


                            case 1:
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
                                }while(escolha3!=23); //aft


                            case 2:
                                int escolha4 = 0;
                                do {

                                    System.out.println("Write your password");
                                    String teste_senha = scanner.next();
                                    System.out.println(teste_senha + "    " + usuario.getSenha());
                                    if(teste_senha.equals(usuario.getSenha())){
                                        System.out.println("Write your new relationship");
                                        String novo_relacionamento = scanner.next();
                                        usuario.setRelacionamento(novo_relacionamento);
                                        escolha4 = 57; // btt
                                    }
                                    else{
                                        System.out.println("Incorrect password, try again");
                                    }
                                }while(escolha4!=57); // btt


                            case 3:
                                int escolha5 = 0;
                                do {

                                    System.out.println("Write your password");
                                    String teste_senha = scanner.next();
                                    System.out.println(teste_senha + "    " + usuario.getSenha());
                                    if(teste_senha.equals(usuario.getSenha())){
                                        System.out.println("Write your new name");
                                        String novo_nome = scanner.next();
                                        usuario.setNome(novo_nome);
                                        escolha5 = 93; // bww
                                    }
                                    else{
                                        System.out.println("Incorrect password, try again");
                                    }
                                }while(escolha5!=93); // bww

                        }
                    }while(escolha2!=0);
                    break;
            }
        }while(escolha!=0);
    }
}