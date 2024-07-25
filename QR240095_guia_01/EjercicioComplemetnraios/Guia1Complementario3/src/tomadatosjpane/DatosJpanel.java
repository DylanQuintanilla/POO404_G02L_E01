package tomadatosjpane;

import javax.swing.*;
import java.util.Scanner;

public class DatosJpanel {
    public static void main(String[] args) {
        int edad;
        String nombre, apellido,carrea;
        nombre = JOptionPane.showInputDialog("Digite su nombre");
        apellido = JOptionPane.showInputDialog("Digite su apellido");
        edad = Integer.parseInt(JOptionPane.showInputDialog("Digite su edad"));
        carrea = JOptionPane.showInputDialog("Digite su carrera");
        JOptionPane.showMessageDialog(null,"Usted se llama "+nombre+" "+apellido+"\nTiene una edad de "+edad+"\nY estudia la carrera de "+carrea);
    }
}
