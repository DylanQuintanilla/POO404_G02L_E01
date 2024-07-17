package complementarios;

import javax.swing.JOptionPane;
import java.io.Console;
public class Ejercicio02 {
    public static void main(String[] args) {
        double totalCompra=0,totalPagar=0,descuento=0;
        String colorBolita="";
        totalCompra = Double.parseDouble(JOptionPane.showInputDialog("Cuanto le salio en su compra"));
        colorBolita = JOptionPane.showInputDialog("Que color de bolita tiene la persona\nRoja(r)\nVerde(v)\nBlanca(b)");
        switch (colorBolita) {
            case "r":case "R":
                descuento = 0.2;
                totalPagar = totalCompra - (totalCompra*descuento);
                break;
            case "v": case"V":
                descuento = 0.1;
                totalPagar = totalCompra - (totalCompra*descuento);
                break;
            case "b": case"B":
                descuento = 0;
                totalPagar = totalCompra - (totalCompra*descuento);
                break;
            default:
                JOptionPane.showMessageDialog(null,"Usted ha ingresado otra letra");
                System.exit(0);
                break;
        }
        JOptionPane.showMessageDialog(null,"Su compra era de: "+totalCompra+"\nPero se le aplicara un descuento de "+(descuento*100)+"%\nPor ende su total a pagar es de: "+totalPagar);

    }
}
