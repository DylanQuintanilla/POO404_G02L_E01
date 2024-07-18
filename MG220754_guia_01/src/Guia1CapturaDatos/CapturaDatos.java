package Guia1CapturaDatos;
import java.util.*;

public class CapturaDatos {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        String nombre="";
        int edad;

        System.out.println("Bienvenido a Intellij IDEA IDE");
        System.out.println("Ingrese su nombre: ");
        nombre=reader.nextLine();
        System.out.println("Ingrese su edad: ");
        edad=reader.nextInt();
        System.out.println("Usted se llama "+nombre+" y tiene "+edad+" años");
    }
}
