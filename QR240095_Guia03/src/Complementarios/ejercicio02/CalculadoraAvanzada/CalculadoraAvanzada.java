package Complementarios.ejercicio02.CalculadoraAvanzada;

public class CalculadoraAvanzada {
    double numero1, numero2, respuesta = 1;

    public CalculadoraAvanzada(){
        this.numero1 = 0;
        this.numero2 = 0;
    }

    public double Potencia(Double numero1, Double numero2){
        respuesta = Math.pow(numero1, numero2);
        return respuesta;
    }
    public double Opuesto(Double numero1){
        respuesta = numero1 * -1;
        return respuesta;
    }
    public double Factorial(Double numero1){
        respuesta = 1;
        for (int i = 1; i <= numero1; i++){
            respuesta = respuesta * i;
            System.out.println(respuesta);
        }
        return respuesta;
    }
}
