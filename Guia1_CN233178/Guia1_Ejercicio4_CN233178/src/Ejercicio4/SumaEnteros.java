package Ejercicio4;

import javax.swing.*;

public class SumaEnteros {

    public static void main(String[] args) {
        //Declara a 2 variables de tipo cadena (string)
        String primernumero;
        String segundonumero;
        //Declara a 3 variables de tipo entero
        int numero1, numero2, suma;

        System.out.println("Aplicacion para sumar 2 numeros enteros\n");

        //genera cuadros de dialogo para ingresar numeros (como String)
        primernumero = JOptionPane.showInputDialog("Digite el primer numero");
        segundonumero = JOptionPane.showInputDialog("Digite el segundo numero");

        //Convierte cada String a un numero entero

        numero1 = Integer.parseInt(primernumero) ;
        numero2 = Integer.parseInt(segundonumero) ;

        System.out.println("Los numeros ingresados son"+numero1+ "y" +numero2);

        //realiza la operacion de sumar los 2 numeros enteros ingresados por usuario
        suma = numero1 + numero2;

        //genera un cuadro de dialogo para presentar el resultado de la suma realizada
        JOptionPane.showMessageDialog(null, "La suma de" +
                numero1+"y"+numero2+ "es de" + suma,
                "Resultado de la suma",JOptionPane.PLAIN_MESSAGE);
        System.exit(0);
    }
}
