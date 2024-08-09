public class Empleado {
    protected String nombre;
    protected double salarioBase;

    // Constructor
    public Empleado(String nombre, double salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;


    }

    // Método para calcular el salario
    public double calcularSalario() {
        return salarioBase;
    }

    // Método para mostrar la información del empleado
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: " + calcularSalario());
    }
}

