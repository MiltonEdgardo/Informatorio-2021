import java.util.*;

public class Complementario1 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Por favor, ingrese su nombre de usuario: ");
        String nom= scan.nextLine();
        System.out.println("Hola " + nom + ".Bienvenido"); 
        scan.close();
    }
}
