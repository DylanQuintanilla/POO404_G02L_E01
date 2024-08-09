public class Empresa {
    public static void main(String[] args) {
        // Estas son las instancias de Empleado y Gerente
        Empleado emp1 = new Empleado("Carlos González", 2500);
        Gerente gerente1 = new Gerente("Rafael Navas", 4000, 1000);

        // Comandos para mostrar las informaciones del empleado y el gerente
        System.out.println("Información del Empleado:");
        emp1.mostrarInfo();

        System.out.println("\nInformación del Gerente:");
        gerente1.mostrarInfo();
    }
}

