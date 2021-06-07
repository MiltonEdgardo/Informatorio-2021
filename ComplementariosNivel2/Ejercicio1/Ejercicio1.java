import java.util.*;

public class Ejercicio1 {
    
    static public void main(String[] args){
        Scanner lector = new Scanner(System.in);
        String a;
        String b;
        String c;
        String [] ciudades = new String[3];
        System.out.println("Por favor, ingrese sus 3 ciudades favoritas: ");
        ciudades[0]= lector.nextLine();
        ciudades[1]= lector.nextLine();
        ciudades[2]= lector.nextLine();

        for (int x=0; x<ciudades.length; x++){
            int n=0;
            n=x+1;
            System.out.println("#"+n+" - "+ciudades[x]);    
        }
        

    }
}
