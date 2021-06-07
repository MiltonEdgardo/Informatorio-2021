import java.util.*;

public class Ejercicio2 {
    
    public static void main(String[] args){
        Scanner lector = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<Integer>();
        System.out.println("Ingrese 5 numeros aleatorios: ");
        int c=5;
        while(c!=0){//Utilizo este bucle para cargar la lista con los valores que se ingresan
            c=c-1;
            numeros.add(lector.nextInt());
        }
        System.out.println("El tamaño de la lista es de "+"'"+numeros.size()+"'"+" elementos");//Imprime el tamaño de la lista 

        System.out.print("Los elementos de la misma son: ");
        for (int x=0; x<5; x++){
            System.out.print(numeros.get(x)+" ");//Mediante iteracion imprimo los elementos de la lista
        }
        int a;
        int b;
        System.out.println("");
        System.out.println("Ahora ingrese 2 numeros para agregar a la lista. El 1ro se agregara al inicio y el 2do al final de la lista: ");
        numeros.add(0,lector.nextInt());
        numeros.add(lector.nextInt());
        System.out.println("El nuevo tamaño de la lista es de "+"'"+numeros.size()+"'"+" elementos");//Imprime el tamaño de la lista modificada

        System.out.print("Los elementos de la nueva listason: ");
        for (int x=0; x<7; x++){
            System.out.print(numeros.get(x)+" ");//Mediante iteracion imprimo los elementos de la nueva lista
        }
        lector.close();
    }
    
}
