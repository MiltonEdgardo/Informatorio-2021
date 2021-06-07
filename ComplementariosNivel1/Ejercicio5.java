import java.util.*;

public class Ejercicio5 {

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int a=0;
        int b=0;
        int c=0;
        int d=0;    
        System.out.println("Ingrese el 1er numero para realizar el producto:  ");
        a=sc.nextInt();
        System.out.println("Ingrese el 2do numero para realizar el producto:  ");
        b=sc.nextInt();
        d=b;
        while(b!=0){
            c=c+a;
            b=b-1;
        }
        System.out.println("El resultado de "+a+" x "+d+" es: "+c);


    }
    
}
