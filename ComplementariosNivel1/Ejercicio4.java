import java.util.*;

public class Ejercicio4 {

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingre un numero del que desea conocer su factorial:");
        int a= sc.nextInt();
        int b= a;
        int c=1;
        while(a!=0){
            c=c*a;
            a--;
        }
        System.out.println("El factorial de "+b+" es: "+c);
     
    }
    
}
