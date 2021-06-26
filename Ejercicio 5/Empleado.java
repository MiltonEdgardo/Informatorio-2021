import java.time.*;
import java.time.format.DateTimeFormatter;

public class Empleado {
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;
    private double sueldo ;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = LocalDate.parse(fechaNacimiento, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    }
    
    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(String sueldo) {
        this.sueldo = Double.parseDouble(sueldo);
    }

    public Empleado(String nombre, String apellido, String fechaNacimiento, String sueldo){
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setSueldo(sueldo);
        this.setFechaNacimiento(fechaNacimiento);   
    }

    @Override
    public String toString() {
        return "Nombre y Apellido: " + this.getNombre() + " " + this.getApellido() + " - " 
                + "Salario: " + this.getSueldo() + " - "
                + "Fecha de Nacimiento: " + this.getFechaNacimiento();
    }

    public int getEdad() {
        LocalDate dia = LocalDate.now();
        int edad = dia.getYear() - getFechaNacimiento().getYear();
        
        if(dia.getMonthValue() < getFechaNacimiento().getMonthValue()) {
            edad = edad - 1;    
        } else if((dia.getMonthValue() == getFechaNacimiento().getMonth().getValue()) && (dia.getDayOfMonth() > getFechaNacimiento().getDayOfMonth())) {
            edad = edad - 1;    
        }
    
        return edad;
      }

}