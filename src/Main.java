import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        User usuario = new User();
        ArrayList<User> users = new ArrayList<>();
        usuario = usuario.Cadastro_Login(users) ;
        usuario.Status();
    }
}