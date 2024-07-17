package complementarios;

import javax.swing.*;

public class Ejercicio03 {
    public static void main(String[] args)
    {
        String leer;
        double sueldo, mayor=0,menor=10000;
        int i=1, contador=0, cantidadEmpleados;
        cantidadEmpleados = Integer.parseInt(JOptionPane.showInputDialog("Cuantos empleados ingresara"));
        while(i<=cantidadEmpleados)
        {
            leer = JOptionPane.showInputDialog("Ingrese el Sueldo del Empleado " +i);
            sueldo = Double.parseDouble(leer);
            if (sueldo<0){
                JOptionPane.showMessageDialog(null,"Favor ingresar valores positivos","Mensaje de Error",JOptionPane.ERROR_MESSAGE);
            }
            else {
                if (sueldo > 300)
                    contador = contador + 1;
                if (sueldo > mayor)
                    mayor = sueldo;
                if (sueldo < menor)
                    menor = sueldo;
                i = i + 1;
            }
        }
        JOptionPane.showMessageDialog(null, " El sueldo Mayor es de $: " + mayor +"\nEl sueldo Menor es de $: " + menor + "\n"+ contador + " Empleados tienen un sueldo mayor de $300");
    }
}
