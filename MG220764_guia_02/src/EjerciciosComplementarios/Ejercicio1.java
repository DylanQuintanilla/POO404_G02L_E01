package EjerciciosComplementarios;
import javax.swing.JOptionPane;

public class Ejercicio1 {
    public static void main(String[] args){
        double Nota=Double.parseDouble(JOptionPane.showInputDialog("Ingrese su nota"));
        //double nota = Integer.parseInt(Nota);
        if(Nota >= 7){
            JOptionPane.showMessageDialog(null,"Felicidades, aprobo la materia!");
        }if(Nota ==6.50 || Nota==6.60 || Nota==6.70 || Nota==6.80 || Nota==6.90){
            JOptionPane.showMessageDialog(null,"Tiene la posibilidad de realizar un examen de suficiencia para aprobar.");
        }else{
            JOptionPane.showMessageDialog(null,"Usted reprobo la materia");

        }
    }
}
