package sumanumeros;
import javax.swing.JOptionPane;
public class SumaEnteros {
    public static void main(String[] args) {
        //DEclara 2 variables de tipo cadena
        String primernumero, segundonumero;
        //Declara tres variables tipo entero;
        int numero1, numero2, suma;
        System.out.println("Aplicacion para sumar dos numeros enteros\n");

        //Genera cuadros de dialalogos para ingresar numeros enteros (como string)
        primernumero = JOptionPane.showInputDialog("Digite el primer numero");
        segundonumero = JOptionPane.showInputDialog("Digite el segundo numero");

        //Convierte cada string en un numero entero
        numero1 = Integer.parseInt(primernumero);
        numero2 = Integer.parseInt(segundonumero);
        System.out.println("Los numeros ingresados son "+numero1+" y "+numero2);

        //realixa operacioes de sumar los dos numeros enteros ingresados por el usuario
        suma = numero1 + numero2;

        //Genera un cuadro de dialogo para presentar el resultado de la suma
        JOptionPane.showMessageDialog(null,"La suam de "+numero1+" y "+numero2+" es de "+suma,"Resultaods de la suma",JOptionPane.PLAIN_MESSAGE);
        System.exit(0);
    }
}
