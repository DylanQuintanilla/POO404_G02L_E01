package pedirinfobasica;

import java.util.Scanner;

public class InformacionDePersona {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String nombre,apellido,carrea;
        int edad;

        System.out.println("Digite su nombre");
        nombre = reader.nextLine();
        System.out.println("Digite su Apellido");
        apellido = reader.nextLine();
        System.out.println("Digite su edad");
        edad = Integer.parseInt(reader.nextLine());
        System.out.println("Digite su Carrera");
        carrea = reader.nextLine();

        System.out.println("Su nombre es "+nombre+" "+apellido+"\n con una edad de "+edad+"\n Estudaindo la carrera de "+carrea);
    }
}
