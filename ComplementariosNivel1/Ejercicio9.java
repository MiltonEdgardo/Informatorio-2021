import java.util.*;

public class Ejercicio9 {

    public static void main(String[] args){
        Scanner lector= new Scanner(System.in);
        String text;
        char c;
        char b;
        int n=0;
        System.out.println("Ingrese el texto que desea: ");
        text = lector.nextLine();
        text=text.toLowerCase();
        System.out.println("Ingrese la letra que desea que se cuente: ");
        c= lector.next().charAt(0);
        b=Character.toLowerCase(c);
                
        for(int x=0; x<text.length(); x++){
            if(b==text.charAt(x)){
                n=n+1;
            }
            
        }
        System.out.println("la cantidad de veces que aparece la letra "+"'"+c+"'"+" es: "+n);

    }
    
}

