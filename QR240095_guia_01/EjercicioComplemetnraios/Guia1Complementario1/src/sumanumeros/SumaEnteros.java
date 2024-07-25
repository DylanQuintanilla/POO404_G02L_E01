package sumanumeros;

import javax.swing.*;
import java.awt.*;

public class SumaEnteros {
    public static void main(String[] args) {
        System.out.println("Aplicacion para sumar dos numeros enteros\n");
        String primernumero = JOptionPane.showInputDialog("Digite el primer numero");
        int numero1 = Integer.parseInt(primernumero);
        if (numero1<0){
            JOptionPane.showMessageDialog(null,"No se pueden ingresar valores negativos");
            System.exit(0);
        }
        String segundonumero = JOptionPane.showInputDialog("Digite el segundo numero");
        int numero2 = Integer.parseInt(segundonumero);
        if (numero2<0){
            JOptionPane.showMessageDialog(null,"No se pueden ingresar valores negativos");
            System.exit(0);
        }
        System.out.println("Los numeros ingresados son " + numero1 + " y " + numero2);
        int suma = numero1 + numero2;
        JOptionPane.showMessageDialog((Component)null, "La suam de " + numero1 + " y " + numero2 + " es de " + suma, "Resultaods de la suma", -1);
        System.exit(0);
    }
}
