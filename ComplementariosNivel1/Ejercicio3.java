import java.util.*;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero para ver su secuencia incremental: ");
        int a = sc.nextInt();
        
        for(int i=1; i<=a; i++) {
            System.out.println("");
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
                    
        }
    
    }
    
}
