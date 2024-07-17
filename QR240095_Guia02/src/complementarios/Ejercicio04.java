package complementarios;

import javax.swing.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public class Ejercicio04 {
    public static void main(String[] args) {
        HashMap<String, String> hmap = new HashMap<String, String>();
        hmap.put("QR240095", "Dylan Rivera");

        boolean opcionWhile = true;
        int opcionSwitch = 0;
        String carnet="", nombre;

        do{
            opcionSwitch = Integer.parseInt(JOptionPane.showInputDialog("Que desea hacer\n" +
                    "Ingreso de un estudiante ----- 1\n" +
                    "Ver estudiantes -------------- 2\n" +
                    "Buscar estudiante ------------ 3\n" +
                    "Salir ------------------------ 4"));
            switch (opcionSwitch){
                case 1:
                    carnet = JOptionPane.showInputDialog("Cual es el carnet del estudiante");
                    nombre = JOptionPane.showInputDialog("Cual es el nombre del estudiante");
                    hmap.put(carnet, nombre);
                    break;
                case 2:
                    Set set = hmap.entrySet();
                    Iterator iterador = set.iterator();
                    while(iterador.hasNext()) {
                        Map.Entry mentry = (Map.Entry) iterador.next();
                        JOptionPane.showMessageDialog(null,"Carnet: " + mentry.getKey() + " - Nombre: " + mentry.getValue()+"\n");
                    }
                        break;

                case 3:
                    carnet = JOptionPane.showInputDialog("Cual es el carnet del estudiante del que desea saber informacion");
                    nombre = hmap.get(carnet);
                    JOptionPane.showMessageDialog(null,"El nombre del estudiante es "+nombre);
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null,"Adioooos");
                    opcionWhile = false;
            }
        }while (opcionWhile == true);
    }
}
