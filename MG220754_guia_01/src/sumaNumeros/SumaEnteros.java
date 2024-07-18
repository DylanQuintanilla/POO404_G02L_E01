package sumaNumeros;
import javax.swing.JOptionPane;// genera cuadros de dialogo para usuario

public class SumaEnteros {
    public static void main(String[] args){
        String primernumero;
        String segundonumero;

        //declara a 3 variables de tipo entero(int)
        int numero1, numero2, suma;

        System.out.println("Aplicaciones para sumar 2 numeros enteros\n");

        primernumero = JOptionPane.showInputDialog("Digite el primer numero: ");
        segundonumero =JOptionPane.showInputDialog("Digite el segundo nuemro");


        numero1=Integer.parseInt(primernumero);
        numero2=Integer.parseInt(segundonumero);

        if(numero1 <=0 || numero2<=0){
            JOptionPane.showMessageDialog(null, "Esos numeros no son validos aqui jeje");
        } else{
            System.out.println("Los numeros ingresados son "+numero1+" y "+numero2);

            suma=numero1 + numero2;

            JOptionPane.showMessageDialog(null, "La suma de "+

                    numero1+" y "+numero2+" es de "+suma,"Resultado de la suma ", JOptionPane.PLAIN_MESSAGE);
            System.exit(0);
        }

        System.out.println("Los numeros Ingresados son "+numero1+" y "+numero2);

        suma = numero1 + numero2;

        JOptionPane.showMessageDialog(null,"La suma de "+numero1+
                " y "+numero2+" es de "+suma,"resultado de la suma",JOptionPane.PLAIN_MESSAGE);
        System.exit(0);

    }
}
