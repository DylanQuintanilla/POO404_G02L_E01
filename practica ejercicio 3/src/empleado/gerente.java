package empleado;

import javax.swing.*;

public class gerente {

    double bono;
    String nombre;
    String apellido;
    double salarioBase;

    //Metodo que permite mostrar el contenido de los atributos
    public void mostrarInfo()
    {
        JOptionPane.showConfirmDialog(null,nombre +" "+apellido);
    }

  nombre=JOptionPane.ShowInputDialog("Ingrese el Nombre");
    salarioBase=JOptionPane.ShowInputDialog("Ingrese el Salario Base");



    }
