package Complementarios.ejercicio01;

import javax.swing.*;
import java.util.Scanner;

public class MainEstudiantes {
    public static void main(String[] args) {
        String nombre,apellido1, apellido2;
        nombre= JOptionPane.showInputDialog("Ingrese el Nombre");
        apellido1=JOptionPane.showInputDialog("Ingrese el primer apellido");
        apellido2=JOptionPane.showInputDialog("Ingrese su segundo apellido");
        Estudiante estudiante1 = new Estudiante(nombre,apellido1,apellido2);

        estudiante1.setMateria1(JOptionPane.showInputDialog("Ingrese la primera materia"));
        estudiante1.setMateria2(JOptionPane.showInputDialog("Ingrese la segunda materia"));
        estudiante1.setMateria3(JOptionPane.showInputDialog("Ingrese la tercera materia"));
        estudiante1.setMateria4(JOptionPane.showInputDialog("Ingrese la cuarta materia"));
        estudiante1.setMateria5(JOptionPane.showInputDialog("Ingrese la quinta materia"));

        estudiante1.getDatos();


    }
}
