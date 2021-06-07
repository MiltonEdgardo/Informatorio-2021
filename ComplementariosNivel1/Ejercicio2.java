import java.util.*;
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese 2 numeros para realizar las operaciones matematicas basicas entre si: ");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int suma = a+b;
        int resta = a-b;
        int producto = a*b;
        int div = a/b;
        int resto = a%b;
        System.out.println(a+" + "+b+" = "+ suma);
        System.out.println(a+" - "+b+" = "+ resta);
        System.out.println(a+" * "+b+" = "+ producto);
        System.out.println(a+" / "+b+" = "+ div);
        System.out.println(a+" % "+b+" = "+ resto);
    }
    
}
