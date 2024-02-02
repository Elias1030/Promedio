//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class evidencia1 {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        String nombreAlumno = "Juan";
        System.out.println("Nombre del estudiante: " + nombreAlumno);
        int[] calificaciones = {80, 90, 60, 70, 95};
        System.out.println("Calificaciones: ");
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.println("Calificacion: " + calificaciones[i] + " ");
        }

        int suma = 0;
        for (int elemento : calificaciones) {
            suma += elemento;
        }
        int promedio = suma / calificaciones.length;
        System.out.println("Promedio: " + promedio);
        char calificacionFinal = obtenerCalificacion(promedio);
        System.out.println("Calificacion Final: " + calificacionFinal);
    }
    public static char obtenerCalificacion(int promedio){
        char calificacionFinal;
            if (promedio <= 50){
                calificacionFinal = 'F';
            } else if (promedio <= 60){
                calificacionFinal = 'E';
            } else if (promedio <= 70){
                calificacionFinal = 'D';
            } else if (promedio <= 80){
                calificacionFinal = 'C';
            } else if (promedio <= 90){
                calificacionFinal = 'B';
            } else {
                calificacionFinal = 'A';
            }
            return calificacionFinal;
        }
    }
