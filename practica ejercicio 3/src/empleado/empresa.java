package empleado;

import javax.swing.JOptionPane;
public class empresa {
    public static void main(String[] args)
    {
        empleado emp= new empleado(); //Objeto de tipo Empleado
        gerente pro=new gerente(); //Objeto de tipo profesor
        JOptionPane.showMessageDialog(null,"claseempleado");
//Utilizando los metodos de Empleado
        emp.ingresarsalario();
        emp.mostrarInfo();
        JOptionPane.showMessageDialog(null,"clase gerente");
//Utilizando los metodos de profesor
        pro.ingresarsalario();
        pro.mostrarInfo();
    }
}