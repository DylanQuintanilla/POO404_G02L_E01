
package ejercicio2;
import java.util.Scanner;

public class CapturaDatos {
    public static void main(String[]argumentos){
        Scanner reader = new Scanner(System.in);
        String nombre = "";
        int edad;
        //System.out.println("Practica 1 de POO404");
        System.out.println("Bienvenidos a IntellJ IDEA IDE");
        System.out.println("Ingrese su nombre");
        nombre = reader.nextLine();
        System.out.println("Ingrese su edad ");
        edad = reader.nextInt();
        System.out.println("Ustede se llama "+ nombre+" y tiene "+edad+" años");
        System.out.println("linea de texto a imprimir");
        System.out.print("texto a imprimir");
        System.out.print(" junto con este");


    }
}
