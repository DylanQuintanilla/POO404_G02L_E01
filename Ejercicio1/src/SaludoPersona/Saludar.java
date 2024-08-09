package SaludoPersona;
import javax.swing.JOptionPane;
<<<<<<< Updated upstream
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


=======
import java.util.Calendar;

public class Saludar {

    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Ingrese su nombre y apellido: ");
        if (nombre == null || nombre.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No puso ningun nombre");
            return;
        }

        String sexo = JOptionPane.showInputDialog("Seleccione su sexo (M/F):");
        if (sexo == null || (!sexo.equalsIgnoreCase("M") && !sexo.equalsIgnoreCase("F"))) {
            JOptionPane.showMessageDialog(null, "Sexo no válido. Debe ser 'M' para masculino o 'F' para femenino");
            return;
        }

        String fechaCum = JOptionPane.showInputDialog("Ingrese su fecha de nacimiento (dd-MM-yyyy):");
        if (fechaCum == null || !esFechaValida(fechaCum)) {
            JOptionPane.showMessageDialog(null, "Fecha no válida. El formato debe ser dd-MM-yyyy.");
            return;
        }

        String[] partes = fechaCum.split("-");
        int dia = Integer.parseInt(partes[0]);
        int mes = Integer.parseInt(partes[1]);
        int año = Integer.parseInt(partes[2]);

        if (!esFechaCorrecta(dia, mes, año)) {
            JOptionPane.showMessageDialog(null, "Fecha no válida.");
            return;
        }

        Calendar fechaNacimiento = Calendar.getInstance();
        fechaNacimiento.set(año, mes - 1, dia);
        Calendar hoy = Calendar.getInstance();

        int edad = hoy.get(Calendar.YEAR) - fechaNacimiento.get(Calendar.YEAR);
        if (hoy.get(Calendar.MONTH) < fechaNacimiento.get(Calendar.MONTH) ||
                (hoy.get(Calendar.MONTH) == fechaNacimiento.get(Calendar.MONTH) &&
                        hoy.get(Calendar.DAY_OF_MONTH) < fechaNacimiento.get(Calendar.DAY_OF_MONTH))) {
            edad--;
        }

        String saludo;

        if (edad > 30) {
            if (sexo.equalsIgnoreCase("M")) {
                saludo = "Buenos días Mr. " + nombre;
            } else {
                saludo = "Buenos días Ms. " + nombre;
            }
        } else {
            saludo = "Hola amigo " + nombre;
        }


        boolean bisiesto;

        if (año % 4 == 0 && (año % 100 != 0 || año % 400 == 0)) {
            bisiesto = true;
        } else {
            bisiesto = false;
        }

        String bisiesto2;

        if (bisiesto) {
            bisiesto2 = "es bisiesto.";
        } else {
            bisiesto2 = "no es bisiesto";
        }


        String[] diasSemana = {"domingo", "lunes", "martes", "miércoles", "jueves", "viernes", "sábado"};
        String diaSemana2 = diasSemana[fechaNacimiento.get(Calendar.DAY_OF_WEEK) - 1];

        JOptionPane.showMessageDialog(null, saludo + "\nTienes " + edad + " años.\nEl año " + año + " " + bisiesto2 + "\nNaciste un " + diaSemana2 + ".");
    }

    private static boolean esFechaValida(String fecha) {
        return fecha.matches("^\\d{2}-\\d{2}-\\d{4}$");//expresion regular
    }


    private static boolean esBisiesto(int año) {
        return (año % 4 == 0 && (año % 100 != 0 || año % 400 == 0));
    }


    private static boolean esFechaCorrecta(int dia, int mes, int año) {
        if (mes < 1 || mes > 12) {
            return false;
        }

        int diasFebrero;
        if (esBisiesto(año)) {
            diasFebrero = 29;
        } else {
            diasFebrero = 28;
        }
        int[] diasEnMes = {31, diasFebrero, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (dia < 1 || dia > diasEnMes[mes - 1]) {
            return false;
        }
        return true;
    }

}





>>>>>>> Stashed changes
