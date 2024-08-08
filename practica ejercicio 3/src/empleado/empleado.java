package empleado;

import javax.swing.*;

public class empleado {
     String nombre;
     String apellido;
    double salarioBase;

    //Metodo que permite mostrar el contenido de los atributos
    public void mostrarInfo()
    {
        JOptionPane.showConfirmDialog(null,nombre +" "+apellido);
    }
    //Metodo que permite cambiar los datos de los atributos
    public void ()
    {
        nombre=JOptionPane.showInputDialog("Ingrese el Nombre");
        apellido=JOptionPane.showInputDialog("Ingrese el Apellido");
        salarioBase=JOptionPane.showInputDialog("Ingrese el Salario Base");

        //Clase gerente que hereda de Empleado
        class gerente extends empleado {
            int salarioBase;
            public void ingresarsalario()
            {
                mostrarInfo();//Metodo heredado de Empleado
                JOptionPane.showMessageDialog(null,salarioBase);
            }
            public void ingreso2()
            {
                ingresarsalario();//Metodo heredado de Empleado
                String s=JOptionPane.showInputDialog("Ingrese el sueldo");
                salarioBase= Integer.parseInt(s);
            }





    }
}



