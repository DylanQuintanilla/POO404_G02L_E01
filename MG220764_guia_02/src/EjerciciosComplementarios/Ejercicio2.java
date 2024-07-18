package EjerciciosComplementarios;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args){
        int Opcion;
        Scanner in = new Scanner(System.in);


        System.out.println("seleccione una opcion");
        System.out.println("1. Opcion 1");
        System.out.println("2. Opcion 2");
        System.out.println("3. Opcion 3");
        System.out.println("4. Salir");
        Opcion = in.nextInt();

        switch (Opcion) {
            case 1:
                System.out.println("La bolita es roja, se le aplica descuento de un 10%");
                break;
            case 2:
                System.out.println("La bolita es verde, se le aplica un descuento de 5%");
                break;
            case 3:
                System.out.println("La bolita es blanca, no tiene descuento. Gracias por participar!");
                break;
            case 4:
                System.out.println("Saliendo");
                break;
            default:
                System.out.println("esa no es una opcion");
        }
        in.close();
    }
}
