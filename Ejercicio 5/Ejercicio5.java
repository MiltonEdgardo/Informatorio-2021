import java.io.*;
import java.util.*;


public class Ejercicio5 {
    public static List<Empleado> empleados = new ArrayList<>();
    public static void main(String args[]) throws IOException{
        Scanner lector = new Scanner(System.in);
        CrearEmpleados();

        System.out.println("Ingrese la letra que comienza el apellido del Empleado a buscar: ");
        char letter = lector.next().charAt(0);
        Empleado[] letraEnApellido = BuscarApellido(letter, empleados);
        System.out.println("Los emplados cuyo apellido comienzan con la letra " + letter + " son: ");        
        for (int x = 0; x < letraEnApellido.length; x++) {
            if (letraEnApellido[x] != null) {
                System.out.println("- " + letraEnApellido[x]);
            }
        }
   
        Empleado[] empleadosSegunAntiguedad = antiguedadDeEmpleados(empleados);
        System.out.println("El empleado más joven es: " );
        System.out.println("- " + empleadosSegunAntiguedad[0]);
        System.out.println("El empleado más antiguo es: ");
        System.out.println("- " + empleadosSegunAntiguedad[1]);

        
        Empleado[] empleadoSegunRemuneracion = RemuneracionDeEmpleados(empleados);
        System.out.println("El empleado de menor remuneracion es :");
        System.out.println("- " + empleadoSegunRemuneracion[0]);
        System.out.println("El empleado de mayor remuneracion es :");
        System.out.println("- " + empleadoSegunRemuneracion[1]);

        lector.close();
    }

    public static void CrearEmpleados() {
        String filePath ="Ejercicio 5\\Empleados.txt";
        File file = new File(filePath);
        String path = file.getAbsolutePath();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String linea =  br.readLine();
            while (linea != null) {
                AsignarEmpleado(linea);
                linea = br.readLine();
            }
        }catch(IOException ioe) {
            System.out.println(ioe);
        }
    }

    public static void AsignarEmpleado(String linea) {
        if (linea != null) {
            linea = linea.toUpperCase();
            String[] caracteristicas = linea.split(",");
            Empleado emp = new Empleado(caracteristicas[0], caracteristicas[1], caracteristicas[2], caracteristicas[3]);
            empleados.add(emp); 
        }  
    }

    public static Empleado[] BuscarApellido(char letra, List<Empleado> empleados) {
        Empleado[] coincidenciasDeLetras = new Empleado[empleados.size()];
        int y = 0;
        for (int x = 0; x < empleados.size(); x++) {
            if(empleados.get(x).getApellido().charAt(0) == Character.toUpperCase(letra)) {
                coincidenciasDeLetras[y] = empleados.get(x);
                y++;
            }
        }
        
        return coincidenciasDeLetras;
    }    

    public static Empleado[] RemuneracionDeEmpleados(List<Empleado> empleados) {
        Empleado[] empleadoSegunRemuneracion = new Empleado[2];
        Empleado empleadoMenorRemunerado = empleados.get(0);
        Empleado empleadoMayorRemunerado = empleados.get(0);
        for (int x = 0; x < empleados.size(); x++) {
            if (empleados.get(x).getSueldo() < empleados.get(0).getSueldo()) {
                empleadoMenorRemunerado = empleados.get(x); 
            }
            if (empleados.get(x).getSueldo() > empleados.get(0).getSueldo()) {
                empleadoMayorRemunerado = empleados.get(x);
            }
        }
        empleadoSegunRemuneracion[0] = empleadoMenorRemunerado;
        empleadoSegunRemuneracion[1] = empleadoMayorRemunerado;

        return empleadoSegunRemuneracion;
    }

       
  public static Empleado[] antiguedadDeEmpleados(List<Empleado> empleados) {
      Empleado[] empleadosSegunAntiguedad = new Empleado[2];
      Empleado menorAntiguedad = empleados.get(0);
      Empleado mayorAntiguedad = empleados.get(0);
      for (int x = 0; x < empleados.size(); x++) {
        if (empleados.get(x).getEdad() < menorAntiguedad.getEdad()) {
            menorAntiguedad = empleados.get(x);
          }
          if (empleados.get(x).getEdad() > mayorAntiguedad.getEdad()) {
            mayorAntiguedad = empleados.get(x);
          }
      }
      empleadosSegunAntiguedad[0] = menorAntiguedad;
      empleadosSegunAntiguedad[1] = mayorAntiguedad;
      
      return empleadosSegunAntiguedad;
    }

}

