package guia2;
import javax.swing.*;

public class SentenciaWhile {
    public static void main(String[] args){
        String Leer;
        double sueldo, mayor=0, menor=10000;
        int i=1, contador=0;
        while (i<=5){
            Leer=JOptionPane.showInputDialog("Ingrese el sueldo del empleado "+i);
            sueldo=Double.parseDouble(Leer);
            if(sueldo>mayor)
                mayor=sueldo;
            if(sueldo<menor)
                menor=sueldo;
            i=i+1;
        }
        JOptionPane.showMessageDialog(null,"El sueldo Mayor es de $: "+mayor
                +"\nEl sueldo Menor es de $: "+menor+"\n"+contador+" Empleados que tienen un sueldo mayor de $300");
    }

}
