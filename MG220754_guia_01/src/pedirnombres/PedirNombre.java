package pedirnombres;
import javax.swing.*;

public class PedirNombre {
    public class pedirnombres {
        public static void main(String[] args) {

            String nombres, apellido, carrera, edadd;
            int edad;

            nombres = JOptionPane.showInputDialog("Ingrese su nombre: ");
            apellido = JOptionPane.showInputDialog("Ingrese su apellido: ");
            edadd = JOptionPane.showInputDialog("Ingrese su edad: ");
            edad = Integer.parseInt(edadd);
            carrera = JOptionPane.showInputDialog("Ingrese su carrera: ");

            JOptionPane.showMessageDialog(null, "su nombre es " + nombres + "\nY su apellido es " + apellido
                    + "\nY su edad es de " + edad + " años \nY su carrera es " + carrera);
            System.exit(0);
        }
    }
    }
