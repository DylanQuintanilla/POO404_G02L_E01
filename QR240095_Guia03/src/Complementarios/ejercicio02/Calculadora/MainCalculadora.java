package Complementarios.ejercicio02.Calculadora;

import javax.swing.*;
import java.util.Scanner;

public class MainCalculadora {
    public static void main(String[] args) {
        boolean opcion = true;
        int desicion;
        double num1, num2;
        Calculadora calculadora1 = new Calculadora();
        do {
            desicion = Integer.parseInt(JOptionPane.showInputDialog("Que desea hacer " +
                    "\nSuma ------------ 1" +
                    "\nResta ----------- 2" +
                    "\nMultiplicacion -- 3" +
                    "\nDivision -------- 4" +
                    "\nSalir ----------- 5"));
            switch (desicion){
                case 1:
                    num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite el primer numero para la suma"));
                    num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite el degundo numero para la suma"));
                    JOptionPane.showMessageDialog(null,"El resultado es "+calculadora1.Suma(num1,num2));
                    break;
                case 2:
                    num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite el primer numero para la resta"));
                    num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite el degundo numero para la resta"));
                    JOptionPane.showMessageDialog(null,"El resultado es "+calculadora1.Resta(num1,num2));
                    break;
                case 3:
                    num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite el primer numero para la multiplicacion"));
                    num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite el degundo numero para la multiplicacion"));
                    JOptionPane.showMessageDialog(null,"El resultado es "+calculadora1.Multiplicacion(num1,num2));
                    break;
                case 4:
                    num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite el primer numero para la division"));
                    num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite el degundo numero para la division (Recuerda ser diferente a 0)"));
                    JOptionPane.showMessageDialog(null,"El resultado es "+calculadora1.Multiplicacion(num1,num2));
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null,"ADioooos ");
                    opcion = false;
                    break;
            }

        }while (opcion == true);
    }
}
