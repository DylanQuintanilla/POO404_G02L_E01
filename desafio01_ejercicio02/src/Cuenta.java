import javax.swing.*;

public class Cuenta {

    public static void main(String[] args) {

        int[] cuenta = {1000001, 1000002,1000003};
        double[] saldo = {400, 200, 500};
        int cuentaPrueba = 0;
        boolean continuar = true;
        double retiro;
        int transferencia = 0;


        do {
            try {
                cuentaPrueba = Integer.parseInt(JOptionPane.showInputDialog("Hola, ingrese el numero de cuenta"));
            }
            catch (Exception e){
                JOptionPane.showMessageDialog(null,"Por favor ingrese valores numericos, esa cuenta no existe");
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
                                    retiro = Double.parseDouble(JOptionPane.showInputDialog("Cuanto desea retirar $"));
                                }
                                catch (Exception e){
                                    JOptionPane.showMessageDialog(null,"Por favor ingrese valores ,monetarios");
                                    break;
                                }
                                if (saldo[i]<retiro){
                                    JOptionPane.showMessageDialog(null,"Lo sentimos usted posee $"+saldo[i]+" por ende no puede retirar "+retiro);
                                }
                                else{
                                    JOptionPane.showMessageDialog(null,"Proceso exitoso ");
                                    saldo[i] = saldo[i] - retiro;
                                    JOptionPane.showMessageDialog(null,"El saldo actual de la cuenta ****** es de $"+saldo[i]+"*******’");
                                }
                                break;
                            case 3:
                                try {
                                    retiro = Double.parseDouble(JOptionPane.showInputDialog("Cuanto desea consignar $"));
                                }
                                catch (Exception e){
                                    JOptionPane.showMessageDialog(null,"Por favor ingrese valores ,monetarios");
                                    break;
                                }
                                if (saldo[i]<retiro){
                                    JOptionPane.showMessageDialog(null,"Lo sentimos usted posee $"+saldo[i]+" por ende no puede consignar "+retiro);
                                }
                                else{
                                    JOptionPane.showMessageDialog(null,"Proceso exitoso ");
                                    saldo[i] = saldo[i] - retiro;
                                    JOptionPane.showMessageDialog(null,"El saldo actual de la cuenta ****** es de $"+saldo[i]+"*******’");
                                }
                                break;
                            case 4:
                                try {
                                    retiro = Double.parseDouble(JOptionPane.showInputDialog("Cuanto desea Transferir $"));
                                }
                                catch (Exception e){
                                    JOptionPane.showMessageDialog(null,"Por favor ingrese valores ,monetarios");
                                    break;
                                }
                                if (saldo[i]<retiro){
                                    JOptionPane.showMessageDialog(null,"Lo sentimos usted posee $"+saldo[i]+" por ende no puede transferir "+retiro);
                                }
                                else{
                                    try {
                                        transferencia = Integer.parseInt(JOptionPane.showInputDialog("A que cuenta desea transferir"));
                                    }
                                    catch (Exception e){
                                        JOptionPane.showMessageDialog(null,"Por favor ingrese valores numericos, esa cuenta no existe");
                                    }
                                    for (int y = 0; y < cuenta.length ; y++){
                                        if (cuenta[y] == transferencia){
                                            JOptionPane.showMessageDialog(null,"Proceso exitoso ");
                                            saldo[i]=saldo[i]-retiro;
                                            saldo[y]=saldo[y]+retiro;
                                            JOptionPane.showMessageDialog(null,"El saldo actual de la cuenta ****** es de $"+saldo[i]+"*******’");
                                        }
                                        System.out.println(y);
                                        if(y == 3) {
                                            JOptionPane.showMessageDialog(null,"Lo sentimos esa cuenta no existe");
                                        }
                                    }
                                }
                                break;
                            case 5:
                                JOptionPane.showMessageDialog(null,"Adios vuelve pronto");
                                continuar = false;
                                break;
                            default:
                                break;
                        }
                    }while (continuar == true);
                }
                else {
                    JOptionPane.showMessageDialog(null,"Lo sentimos esa cuenta no existe, intentelo nuevamente");
                    break;
                }
            }
        }while (continuar == true);
    }
}
