import java.util.*;

public class Ejercicio7 {

    public static void main(String[] args) {
        String palabra;
        char c;
        Scanner lector = new Scanner(System.in);
        System.out.printf("Ingrese una palabra: ");
        palabra = lector.nextLine();
        for (int i=0; i<palabra.length(); i++){
            c=palabra.charAt(i);
            if(c>='a' && c<= 'z'){
                c=(char)(c-'a' + 'A');
                System.out.print(c);
            }
        }
    }
}