import java.util.*;


public class Ejercicio6 {

    public static void main(String[] args) {
        Set<Empleado> empleados = new HashSet<Empleado>();
        Map<Integer, Integer> dic = new HashMap<Integer, Integer>();

        Empleado emp1 = new Empleado();
            emp1.nombre = "Albert";
            emp1.apellido = "Einstein";
            emp1.dni = 5105203;
            emp1.horasTrabajadas = 160;
            emp1.valorHora = 850;

        empleados.add(emp1);
        
        Empleado emp2 = new Empleado();
            emp2.nombre = "Nikola";
            emp2.apellido = "Tesla";
            emp2.dni = 2350678;
            emp2.horasTrabajadas = 170;
            emp2.valorHora = 950;    

        empleados.add(emp2);
        
        for (Empleado elemento : empleados) {
            dic.put(elemento.dni, (elemento.horasTrabajadas*elemento.valorHora));
        }

        System.out.println("Los Sueldos de los Empleados con los que contamos serán: ");
        System.out.println(emp1.nombre + " " + emp1.apellido + " = " + dic.get(emp1.dni));
        System.out.println(emp2.nombre + " " + emp2.apellido + " = " + dic.get(emp2.dni));

    }
    
}
