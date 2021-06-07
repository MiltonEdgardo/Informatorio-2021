import java.util.*;

public class Ejercicio3 {

    
    public static void main(String[] args ) {
        List<Integer> cartas = Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("El listado de cartas originales: " + cartas);
        
        Collections.reverse(cartas);
        System.out.println("El listado de cartas invertidas es: " + cartas);
       
        Collections.shuffle(cartas);
        System.out.println("El listado de cartas mezclas aleatoriamente es: " + cartas);

    }

}