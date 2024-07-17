package complementarios;

import javax.swing.JOptionPane;
import java.io.Console;

public class Ejercicio01 {
    public static void main(String[] args) {
        double nota = 0;
        //nota = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota del estudiante"));
        try {
            nota = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota del estudiante"));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error, digite valores numericos","Mensaje de Error",JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        if (nota < 0){
            JOptionPane.showMessageDialog(null,"Error, digite valores positivos","Mensaje de Error",JOptionPane.ERROR_MESSAGE);
        }
        else if (nota < 6.5){
            JOptionPane.showMessageDialog(null,"El alumno esta reprobado, debe mejorar");
        } else if (nota < 7) {
            JOptionPane.showMessageDialog(null,"El alumno se encuentra reprobado sin embargo es capaz e optar por participar en un examen de suficiencia");
        } else if (nota <= 10) {
            JOptionPane.showMessageDialog(null,"Felicidades, el alumno aprobo");
        }
        else {
            JOptionPane.showMessageDialog(null,"Error, digite valores numericos","Mensaje de Error",JOptionPane.ERROR_MESSAGE);
        }
    }
}


