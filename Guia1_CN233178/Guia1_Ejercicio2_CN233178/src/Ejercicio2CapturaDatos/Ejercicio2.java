package Ejercicio2CapturaDatos;

public class Ejercicio2 {
    public static void main(String []argumentos)
    {
        Scanner reader = new Scanner(System.in);
        String nombre= "";
        int edad;
        //System.out.print("Practica 1 de POO404");
        System.out.println("Bienvenido a Intelijj IDEA IDE");
        System.out.print("Ingrese su nombre: ");
        nombre=reader.nextLine();
        System.out.print("Ingrese su edad: ");
        edad=reader.nextInt();
        System.out.println("Usted se llamav"+nombre+" y tiene "+edad+"años");;
    }
}

