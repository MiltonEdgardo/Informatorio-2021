import java.util.*;

public class Ejercicio4 {

    public static void main(String[] args) {
        List<String> estudiantes = new ArrayList<>(Arrays.asList("Roger Federer", "Serena Williams", "Manuel Ginobili",
                                                                      "Amaia Montero", "Alex Ubago", "Ronaldo 'El original'",
                                                                      "Ronaldinho", "Novak Djokovic", "Freddie Mercury",
                                                                      "Madonna", "Marco Antonio Solis", "Adele"));
        
        List<String> curso_1 = estudiantes.subList(0, 4);
        System.out.print("Los alumno del curso uno serán: ");

        for (int x = 0; x < 4; x++ ) {
            System.out.print(curso_1.get(x)+" - ");
        }

        List<String> curso_2 = estudiantes.subList(4, 8);
        System.out.println();
        System.out.print("Los alumno del curso dos serán: ");

        for (int x = 0; x < 4; x++ ) {
            System.out.print(curso_2.get(x)+" - ");
        }

        List<String> curso_3 = estudiantes.subList(8, 12);
        System.out.println();
        System.out.print("Los alumno del curso tres serán: ");

        for (int x = 0; x < 4; x++ ) {
            System.out.print(curso_3.get(x)+" - ");
        }

    }
    
}
