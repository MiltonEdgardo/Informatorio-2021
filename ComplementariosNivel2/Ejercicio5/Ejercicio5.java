import java.util.*;

public class Ejercicio5 {

    public static void main(String[] args) {
        List<Integer> horasTrabajadas = new ArrayList<>(Arrays.asList(6, 7, 8, 4, 5));
        List<Integer> valorPorHora = new ArrayList<>(Arrays.asList(350, 345, 550, 600, 320));
        List<Integer> valorPorTrabajo = new ArrayList<Integer>();
        int total = 0;

        for (int x = 0; x<horasTrabajadas.size(); x++) {
            valorPorTrabajo.add(horasTrabajadas.get(x) * valorPorHora.get(x));//Multiplica valor de hs por hs trabajadas, segun indice y agrega nueva lista
            total = valorPorTrabajo.get(x) + total;  //obtiene la suma sucesiva de los valores de la nueva lista                    
        }
        System.out.print("En base a los valores por hs y las hs trabajadas, los totales de Horas Trabajadas son: ");
        System.out.println(valorPorTrabajo);

        System.out.print("El Total a percibir será: ");
        System.out.println(total);
        



         


    }   
    
}
