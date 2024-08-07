package guia3;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class Estudiante {

    private String nombre;
    private String apellido;
    private int edad;
    private String carnet;

    private String[] materias;

    public Estudiante(String nombre, String apellido, int edad, String carnet){
        this.nombre = nombre;
        this.apellido=apellido;
        this.edad=edad;
        this.carnet=carnet;
        this.materias = new String[5];
    }

    public void ingresarMaterisas(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese 5 materias a cursar: ");
        for(int i = 0; i < materias.length; i++){
            System.out.println("Materia "+(i+1)+": ");
            materias[i] = scanner.nextLine();
        }
    }
    public void mostrarInfo(){
        System.out.println("Datos personales: ");
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellido: "+apellido);
        System.out.println("Edad: "+edad);
        System.out.println("Carnet: "+carnet);

        System.out.println("\nSus materias seran: ");
        for (int i = 0; i <materias.length;i++){
            System.out.println("Materias "+(i+1)+": "+materias[i]);
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese nombre de estudiante: ");
        String nombre = scanner.nextLine();
        System.out.println("Apellido de estudiante: ");
        String apellido = scanner.nextLine();
        System.out.println("Edad del estudiante: ");
        int edad = scanner.nextInt();
        System.out.println("Carnet del estudiante: ");
        String carnet = scanner.nextLine();

        Estudiante estudiante = new Estudiante(nombre,apellido,edad,carnet);

        estudiante.ingresarMaterisas();
        estudiante.mostrarInfo();
    }
}
