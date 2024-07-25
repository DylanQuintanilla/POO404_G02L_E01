package Complementarios.ejercicio02.CalculadoraAvanzada;

import Complementarios.ejercicio02.Calculadora.Calculadora;

import javax.swing.*;

public class MainCalculadoraAvanzada {
    public static void main(String[] args) {

        CalculadoraAvanzada calculadora1 = new CalculadoraAvanzada();

        boolean opcion = true;
        int desicion;
        double num1, num2;

        do {
            desicion = Integer.parseInt(JOptionPane.showInputDialog("Que desea hacer " +
                    "\nPotemcia ------------ 1" +
                    "\nOpuesto ------------- 2" +
                    "\nFactoria ------------ 3" +
                    "\nSalir --------------- 4"));
            switch (desicion){
                case 1:
                    num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite el numero para la potencia"));
                    num2 = Double.parseDouble(JOptionPane.showInputDialog("A cuanto la elevara (Cuadrado = 2)"));
                    JOptionPane.showMessageDialog(null,"El resultado es "+calculadora1.Potencia(num1,num2));
                    break;
                case 2:
                    num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite el numero que desea saber su opuesto"));
                    JOptionPane.showMessageDialog(null,"El resultado es "+calculadora1.Opuesto(num1));
                    break;
                case 3:
                    num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite el numero que desea saber su factorial"));
                    JOptionPane.showMessageDialog(null,"El resultado es "+calculadora1.Factorial(num1));
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null,"ADioooos ");
                    opcion = false;
                    break;
            }

        }while (opcion == true);
    }
}
