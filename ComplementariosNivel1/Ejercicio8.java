import java.util.*;

public class Ejercicio8 {

    public static void main(String[] args){
        Scanner lector = new Scanner(System.in);
        String nom;
        String edad;
        String dir;
        String ciudad;
        System.out.println("Por favor, ingrese su Nombre y Apellido: ");
        nom= lector.nextLine();
        System.out.println("Por favor, ingrese su Edad: ");
        edad= lector.nextLine();
        System.out.println("Por favor, ingrese su Direccion: ");
        dir= lector.nextLine();
        System.out.println("Por favor, ingrese su Ciudad: ");
        ciudad= lector.nextLine();
        System.out.println(" ");
        System.out.println("Sus datos son: ");
        System.out.println(ciudad+" - "+dir+" - "+edad+" - "+nom);
    }
    
}
