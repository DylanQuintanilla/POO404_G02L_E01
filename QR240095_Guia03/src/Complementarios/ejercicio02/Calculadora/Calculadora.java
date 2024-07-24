package Complementarios.ejercicio02.Calculadora;

public class Calculadora {
    double numero1, numero2;
     public Calculadora(){
         this.numero1 = 0;
         this.numero2 = 0;
     }

     public double Suma(double numero1, double numero2) {
         double respuesta = numero1 + numero2;
         return respuesta;
     }

    public double Resta(double numero1, double numero2) {
        double respuesta = numero1 - numero2;
        return respuesta;
    }

    public double Multiplicacion(double numero1, double numero2) {
        double respuesta = numero1 * numero2;
        return respuesta;
    }

    public double Division(double numero1, double numero2) {
        double respuesta;
         if (numero2 != 0){
              respuesta = numero1 / numero2;
         }
        else {
             System.out.println("No se puede poner 0 en el divisor");
             respuesta = 0;
         }
        return respuesta;
    }
}
