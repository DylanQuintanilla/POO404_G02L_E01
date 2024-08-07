package SaludoPersona;
import javax.swing.JOptionPane;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Saludar {
    public static void main(String[] args){
        String nombre;
        String apellido;
        String genero;


        nombre = JOptionPane.showInputDialog("Ingrese su nombre: ");
        apellido = JOptionPane.showInputDialog("Ingrese su apellido: ");
        genero = (String)JOptionPane.showInputDialog(null,"Ingrese el sexo:\nMasculino(M)\nFemenino(F)");

        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setLenient(false);

        Date fechaNacido = null;

        while(fechaNacido == null){
            try{
                JOptionPane.showInputDialog("Ingrese su fecha de nacimiento (dd/MM/yyyy): ");
                String fechaStr = scanner.nextLine();

                fechaNacido = sdf.parse(fechaStr);

                Calendar calendario = Calendar.getInstance();
                calendario.setTime(fechaNacido);
                int dia = calendario.get(Calendar.DAY_OF_MONTH);
                int mes = calendario.get(Calendar.MONTH)+ 1;
                int año = calendario.get(Calendar.YEAR);

                JOptionPane.showMessageDialog(null,"Fecha de nacimiento valida: %02d/%02d/%d%n"+dia+ mes+ año);
            }
            catch (ParseException e){
                JOptionPane.showMessageDialog(null,"Formato de fecha no valido");
            }
        }
        Calendar hoy = Calendar.getInstance();
        Calendar cumpleaños = Calendar.getInstance();
        cumpleaños.setTime(fechaNacido);

        int edad = hoy.get(Calendar.YEAR) - cumpleaños.get(Calendar.YEAR);
        if(hoy.get(Calendar.MONTH) + 1 < cumpleaños.get(Calendar.MONTH) + 1 ||
                (hoy.get(Calendar.MONTH) + 1 == cumpleaños.get(Calendar.MONTH) + 1 &&
                        hoy.get(Calendar.DAY_OF_MONTH) <cumpleaños.get(Calendar.DAY_OF_MONTH))){
            edad--;
        }
        JOptionPane.showMessageDialog(null,"Hola "+nombre);
        scanner.close();


    }
}


