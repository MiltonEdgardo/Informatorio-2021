import java.util.*; 

public class Ejercicio7 {
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int num1, num2;
        System.out.println("Ingrese el 1er numero: ");
        num1 = lector.nextInt();
        System.out.println("Por favor, Ingrese el 2do numero, mayor al 1ro: ");
        while(true) {
            num2 = lector.nextInt();
            if (num1 < num2){
                break;
            }            
        }

        String[] lista = fizzBuzzFuncion(num1, num2);
        
        System.out.println(Arrays.toString(lista));
                
        lector.close();
    }
    
    public static String[] fizzBuzzFuncion(int num1, int num2) {
        String[] fizzBuzz = new String[num2-num1];
        int a = 0;
        for (int x = num1; x < num2; x++) {
            if ((x % 2 == 0) && (x % 3 == 0)){
                fizzBuzz[a] = "Fizz Buzz";
            }
            else if(x % 2 == 0) {
                fizzBuzz[a] = "Fizz";
            }
            else if(x % 3 == 0) {
                fizzBuzz[a] = "Buzz";
            }
            else {
                fizzBuzz[a] = String.valueOf(x);
            }
            a = a + 1;
        }
        return fizzBuzz;
    }
        
         
}
