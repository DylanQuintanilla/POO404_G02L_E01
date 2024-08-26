package sv.edu.udb.form;

import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Persona extends JFrame{
    private JTextField txtId;
    private JTextField txtNombre;
    private JTextField txtEdad;
    private JTextField txtTelefono;
    private JComboBox ComboBox;
    private JButton btnObtenerDatos;
    private JButton btnLimpiar;
    private JLabel img;
    private JLabel lblId;
    private JLabel lblNombre;
    private JLabel lblEdad;
    private JLabel lblTelefono;
    private JLabel lblSexo;
    private JTable tblDatos;
    DefaultTableModel modelo=null;
    private JPanel pnlPersonas;

    public Persona(String title){
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(pnlPersonas);
        this.setMinimumSize(new Dimension(600, 500));
        this.setLocationRelativeTo(getParent());

        //Arreglo de objeto para inicializar con vacio la tabla

        Object [][] data=null;

        //Arreglo de String para crear los nombres de las columnas

        String[] colums = {
                "id", "Nombres"," Edad", " Telefono", " Sexo"
        };

        //Instancia del modelo

        modelo = new DefaultTableModel(data, colums);

        //Seteo del modelo, el cual tendra la estructura que permira
        // a la tabla representar los datos

        tblDatos.setModel(modelo);

        btnObtenerDatos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnObtenerDatos();
            }
        });
        btnLimpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnLimpiar();
            }
        });
        tblDatos.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                tblObtenerDatos(e);
            }
        });
    }

    private void tblObtenerDatos(MouseEvent e){
        int fila = tblDatos.rowAtPoint(e.getPoint());
        int columna = tblDatos.columnAtPoint(e.getPoint());

        if((fila > -1) && (columna > -1)){
            txtId.setText(modelo.getValueAt(fila, 0).toString());
            txtNombre.setText(modelo.getValueAt(fila, 1).toString());
            txtEdad.setText(modelo.getValueAt(fila, 2).toString());
            txtTelefono.setText(modelo.getValueAt(fila, 3).toString());
            ComboBox.setSelectedItem(modelo.getValueAt(fila, 4).toString());
        }
    }

    private void btnLimpiar(){
        txtId.setText("");
        txtNombre.setText("");
        txtEdad.setText("");
        txtTelefono.setText("");
        ComboBox.setSelectedIndex(0);
    }

    private void btnObtenerDatos(){
        String id;
        String nombres;
        String edad;
        String telefono;
        String sexo;

        id= txtId.getText();
        nombres = txtNombre.getText();
        edad = txtEdad.getText();
        telefono = txtTelefono.getText();
        sexo = ComboBox.getSelectedItem().toString();

        JOptionPane.showMessageDialog(null, "Datos obtenidos: \n ID: "+id+
                "\n nombres: "+nombres+"\n Edad: "+edad+"\n Telefono: "+telefono+
                "\n Sexo: "+sexo);

        Object[] newRow = {id ,
        nombres,
        edad,
        telefono,
        sexo};

        modelo.addRow(newRow);
    }

    public static void main(String[] args){
        JFrame frame = new Persona("Ingreso de datos");
        frame.setVisible(true);
    }
}
