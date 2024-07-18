import java.util.Scanner;

public class AprobacionAlumno {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double nota;

        System.out.print("Ingrese la nota del alumno: ");
        nota = reader.nextDouble();

        if (nota >= 7.0) {
            System.out.println("El alumno ha aprobado.");
        } else if (nota >= 6.50 && nota <= 6.99) {
            System.out.println("El alumno puede realizar un examen de suficiencia.");
        } else {
            System.out.println("El alumno no ha aprobado.");
        }
    }
}
