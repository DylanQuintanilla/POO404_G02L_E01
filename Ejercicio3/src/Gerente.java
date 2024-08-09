public class Gerente extends Empleado {
    private double bono;

    // Constructor
    public Gerente(String nombre, double salarioBase, double bono) {
        super(nombre, salarioBase);
        this.bono = bono;
    }

    // Sobrecargar el método calcularsalario
    @Override
    public double calcularSalario() {
        return salarioBase + bono;
    }

    // Sobrecargar el método mostrarInfo
    @Override
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario Base: " + salarioBase);
        System.out.println("Bono: " + bono);
        System.out.println("Salario Total: " + calcularSalario());
    }
}
