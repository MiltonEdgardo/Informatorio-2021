import java.util.*;

public class Ejercicio6 {

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int a=0;
        int b=0;
        int c=1;
        System.out.println("Ingrese la base:  ");
        a=sc.nextInt();
        System.out.println("Ingrese el exponente:  ");
        b=sc.nextInt();
        for(int i=1; i<=b; i++){
            c=c*a;
        }
        System.out.println("El resultado de "+a+" elevado a "+b+" es: "+c);


    }
    
}