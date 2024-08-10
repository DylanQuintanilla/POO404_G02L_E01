import javax.swing.*;

public class Cuenta {

    public static void main(String[] args) {

        int[] cuenta = {1000001,1000002,1000003};
        //int[] cuenta = {1,2,3}; cuentas de pruebas
        double[] saldo = {400, 200, 500};
        int cuentaPrueba = 0;
        boolean continuar = true;
        double movimiento;
        int transferencia = 0;


        do {
            try {
                cuentaPrueba = Integer.parseInt(JOptionPane.showInputDialog("Hola, ingrese el numero de cuenta"));
            }
            catch (Exception e){
                JOptionPane.showMessageDialog(null,"Por favor ingrese valores numericos, esa cuenta no existe");
                cuentaPrueba = 0;
            }
            for (int i = 0; i < cuenta.length; i++){
                if(cuentaPrueba == cuenta[i]){
                    do {
                        int opcion = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido-------------\n" +
                                "¿Què desea hacer?\n"+
                                "---------------------\n" +
                                "1. Consulta de saldo\n" +
                                "2. Retiro de fondos\n" +
                                "3. Consignaciones\n" +
                                "4. Transferencias\n" +
                                "5. Salir"));
                        switch (opcion){
                            case 1:
                                JOptionPane.showMessageDialog(null,"El saldo actual de la cuenta ****** es de $"+saldo[i]+"*******’");
                                break;
                            case 2:
                                try {
                                    movimiento = Double.parseDouble(JOptionPane.showInputDialog("Cuanto desea retirar $"));
                                }
                                catch (Exception e){
                                    JOptionPane.showMessageDialog(null,"Por favor ingrese valores ,monetarios");
                                    break;
                                }
                                if (saldo[i]<movimiento){
                                    JOptionPane.showMessageDialog(null,"Lo sentimos usted posee $"+saldo[i]+" por ende no puede retirar "+movimiento);
                                } else if (movimiento <= 0) {
                                    JOptionPane.showMessageDialog(null,"Lo sentimos usted no puede retirar un valor negativo");
                                } else{
                                    JOptionPane.showMessageDialog(null,"Proceso exitoso ");
                                    saldo[i] = saldo[i] - movimiento;
                                    JOptionPane.showMessageDialog(null,"El saldo actual de la cuenta ****** es de $"+saldo[i]+"*******’");
                                }
                                break;
                            case 3:
                                try {
                                    movimiento = Double.parseDouble(JOptionPane.showInputDialog("Cuanto desea consignar $"));
                                }
                                catch (Exception e){
                                    JOptionPane.showMessageDialog(null,"Por favor ingrese valores ,monetarios");
                                    break;
                                }
                                if (movimiento <= 0){
                                    JOptionPane.showMessageDialog(null,"Lo sentimos usted usted no puede consignar valores negativos");
                                }
                                else{
                                    JOptionPane.showMessageDialog(null,"Proceso exitoso ");
                                    saldo[i] = saldo[i] + movimiento;
                                    JOptionPane.showMessageDialog(null,"El saldo actual de la cuenta ****** es de $"+saldo[i]+"*******’");
                                }
                                break;
                            case 4:
                                try {
                                    movimiento = Double.parseDouble(JOptionPane.showInputDialog("Cuanto desea Transferir $"));
                                }
                                catch (Exception e){
                                    JOptionPane.showMessageDialog(null,"Por favor ingrese valores ,monetarios");
                                    break;
                                }
                                if (saldo[i]<movimiento){
                                    JOptionPane.showMessageDialog(null,"Lo sentimos usted posee $"+saldo[i]+" por ende no puede transferir "+movimiento);
                                } else if (movimiento <= 0) {
                                    JOptionPane.showMessageDialog(null,"Lo sentimos usted no puede transferir un valor negativo");
                                } else{
                                    try {
                                        transferencia = Integer.parseInt(JOptionPane.showInputDialog("A que cuenta desea transferir"));
                                    }
                                    catch (Exception e){
                                        JOptionPane.showMessageDialog(null,"Por favor ingrese valores numericos, esa cuenta no existe");
                                    }
                                    for (int y = 0; y < cuenta.length ; y++){
                                        if (cuenta[y] == transferencia){
                                            JOptionPane.showMessageDialog(null,"Proceso exitoso ");
                                            saldo[i]=saldo[i]-movimiento;
                                            saldo[y]=saldo[y]+movimiento;
                                            JOptionPane.showMessageDialog(null,"El saldo actual de la cuenta ****** es de $"+saldo[i]+"*******’");
                                            y = cuenta.length;
                                        }else if (y >= (cuenta.length - 1)){
                                            JOptionPane.showMessageDialog(null,"Lo sentimos esa cuenta no existe, lo regresaremos al menu");
                                        }

                                    }
                                }
                                break;
                            case 5:
                                JOptionPane.showMessageDialog(null,"Adios vuelve pronto");
                                continuar = false;
                                break;
                            default:
                                JOptionPane.showMessageDialog(null,"Favor de ingresar valores que esten propios en la aplicacion");
                                break;
                        }
                    }while (continuar == true);
                    i = cuenta.length;
                    int replaced = JOptionPane.showConfirmDialog(null,"Desea hacer alguna operacion mas en otra cuenta?");
                    switch (replaced) {
                        case JOptionPane.CANCEL_OPTION:
                            continuar = false;
                            break;
                        case JOptionPane.CLOSED_OPTION:
                            continuar = false;
                            break;
                        case JOptionPane.NO_OPTION:
                            continuar = false;
                            break;
                        case JOptionPane.YES_OPTION:
                            continuar = true;
                            break;
                    }
                }
                else if(i >= (cuenta.length - 1) && cuentaPrueba != 0) {
                    JOptionPane.showMessageDialog(null,"Lo sentimos esa cuenta no existe, intentelo nuevamente");
                }
            }
        }while (continuar == true);
    }
}
