import java.util.Scanner;

public class DescuentoTienda {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double montoCompra;
        String colorBolita;
        double descuento = 0.0;

        // Pedir al usuario que ingrese el monto de la compra
        System.out.print("Ingrese el monto total de la compra: ");
        montoCompra = reader.nextDouble();
        
        // Consumir el salto de línea pendiente
        reader.nextLine();

        // Pedir al usuario que ingrese el color de la bolita
        System.out.print("Ingrese el color de la bolita (roja, verde, blanca): ");
        colorBolita = reader.nextLine().toLowerCase();

        // Calcular el descuento según el color de la bolita
        switch (colorBolita) {
            case "roja":
                descuento = 0.10;
                break;
            case "verde":
                descuento = 0.05;
                break;
            case "blanca":
                descuento = 0.0;
                break;
            default:
                System.out.println("Color de bolita no válido.");
                return;
        }

        // Calcular el monto final después del descuento
        double montoFinal = montoCompra - (montoCompra * descuento);

        // Mostrar el resultado al usuario
        if (descuento > 0) {
            System.out.printf("Se le ha aplicado un descuento del %.0f%%. El monto final a pagar es: %.2f\n", descuento * 100, montoFinal);
        } else {
            System.out.println("No tiene descuento. Gracias por participar. El monto final a pagar es: " + montoCompra);
        }
    }
}
