package sv.edu.udb.form;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Persona extends JFrame{
    private JTextField txtTelefono;
    private JTextField txtEdad;
    private JTextField txtNombre;
    private JComboBox cmbSexo;
    private JButton btnLimpiar;
    private JButton btnObtenerDatos;
    private JLabel lblId;
    private JLabel lblNombre;
    private JLabel lblEdad;
    private JLabel lblTelefono;
    private JLabel lblSexo;
    private JTextField txtId;
    private JPanel pnlPersona;
    private JTable tblDatos;
    DefaultTableModel modelo = null;

    public Persona(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(pnlPersona);
        this.setMinimumSize(new Dimension(600, 500));
        this.setLocationRelativeTo(getParent());
        Object [][] data = null;
        String[] colums = {
                "ID", "Nombres", "Edad", "Telefono", "Sexo"
        };
        modelo = new DefaultTableModel(data, colums);
        tblDatos.setModel(modelo);



        btnObtenerDatos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String id;
                String nombres;
                String edad;
                String telefono;
                String sexo;
                id = txtId.getText();
                nombres = txtNombre.getText();
                edad = txtEdad.getText();
                telefono = txtTelefono.getText();
                sexo = cmbSexo.getSelectedItem().toString();
                JOptionPane.showMessageDialog(null,"Datos Obtenidos: \n ID: " +id+
                        "\n nombres: "+ nombres+"\n Edad: "+edad+"\n Telefono: "+telefono+
                        "\n Sexo: "+ sexo);

                Object[] newRow = {id, nombres, edad, telefono, sexo};

                modelo.addRow(newRow);
            }
        });
        btnLimpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtId.setText("");
                txtNombre.setText("");
                txtEdad.setText("");
                txtTelefono.setText("");
                cmbSexo.setSelectedIndex(0);
            }
        });


        tblDatos.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                tblObtenerDato(e);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new Persona("Ingreso de Datos");
        frame.setVisible(true);
    }

    private void tblObtenerDato(MouseEvent e){
        int fila = tblDatos.rowAtPoint(e.getPoint());
        int columna = tblDatos.columnAtPoint(e.getPoint());

        if ((fila > -1) && (columna > -1) ){
            txtId.setText(modelo.getValueAt(fila, 0).toString());
            txtNombre.setText(modelo.getValueAt(fila, 1).toString());
            txtEdad.setText(modelo.getValueAt(fila, 2).toString());
            txtTelefono.setText(modelo.getValueAt(fila, 3).toString());
            cmbSexo.setSelectedItem(modelo.getValueAt(fila, 4).toString());
        }
    }

}


