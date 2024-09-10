package sv.edu.udb.form;

import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import sv.edu.udb.datos.PersonasDatos;
import sv.edu.udb.beans.PersonaBeans;
import sv.edu.udb.datos.OcupacionDatos;

public class Persona extends JFrame{
    private JTextField txtId;
    private JTextField txtNombre;
    private JTextField txtEdad;
    private JTextField txtTelefono;
    private JComboBox cmbSexo;
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
    private JComboBox cmbOcupacion;
    private JTextField txtFechaNacimiento;
    private JButton btnEliminar;
    private JButton btn;
    private JLabel lblOcupacion;
    private JLabel lblFechaNacimiento;


    DefaultTableModel model = null;
    PersonaBeans personaBeans = null;
    PersonasDatos personasDatos = new PersonasDatos();
    OcupacionDatos ocupacionDatos = new OcupacionDatos();

    public Persona(String title){
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(pnlPersonas);
        this.setMinimumSize(new Dimension(600, 500));
        this.setLocationRelativeTo(getParent());

        //Arreglo de objeto para inicializar con vacio la tabla

        //Object [][] data=null;

        //Arreglo de String para crear los nombres de las columnas

        //String[] colums = {
                //"id", "Nombres"," Edad", " Telefono", " Sexo"
        //};

        //Instancia del modelo

        //modelo = new DefaultTableModel(data, colums);

        //Seteo del modelo, el cual tendra la estructura que permira
        // a la tabla representar los datos

        //tblDatos.setModel(modelo);

        modelo=personasDatos.selectPersona();
        tblDatos.setModel(modelo);
        cmbOcupacion.setModel(ocupacionDatos.selectOcupaciones());

        btnObtenerDatos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
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
        btnLimpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnEliminar();
            }
        });
    }

    public void btnEliminar(){
        personasDatos.delete(Integer.parseInt(txtId.getText()));
        btnLimpiar();
        modelo=personasDatos.selectPersona();
        tblDatos.setModel(modelo);
    }

    private void tblObtenerDatos(MouseEvent e){

        int id;
        String nombres;
        int edad;
        String telefono;
        String sexo;
        int idOcupacion;
        String fechaNacimiento;
        if (txtId.getText().isEmpty()){
            id = 0;
        }else{
            id = Integer.parseInt(txtId.getText());
        }
        nombres = txtNombre.getText();
        edad = Integer.parseInt(txtEdad.getText());
        telefono = txtTelefono.getText();
        sexo = cmbSexo.getSelectedItem().toString();
        idOcupacion = ocupacionDatos.getIdOcupacion(cmbOcupacion.getSelectedItem().toString());
        fechaNacimiento = txtFechaNacimiento.getText();
        personaBeans = new
                PersonaBeans(id,nombres,edad,telefono,sexo,idOcupacion,fechaNacimiento);
        if(btnObtenerDatos.getText().equals("Guardar")) {
            personasDatos.insert(personaBeans);
        }else if (btnObtenerDatos.getText().equals("Editar")) {
            personasDatos.update(personaBeans);
        }
        modelo=personasDatos.selectPersona();
        tblDatos.setModel(modelo);
        //
    }

    private void btnLimpiar(){
        txtId.setText("");
        txtNombre.setText("");
        txtEdad.setText("");
        txtTelefono.setText("");
        cmbSexo.setSelectedIndex(0);
        cmbOcupacion.setSelectedIndex(0);
        txtFechaNacimiento.setText("");
        btnObtenerDatos.setText("Guardar");
    }

    private void btnObtenerDatos(MouseEvent e){
        int fila = tblDatos.rowAtPoint(e.getPoint());
        int columna = tblDatos.columnAtPoint(e.getPoint());
        if ((fila > -1) && (columna > -1)){
            txtId.setText(modelo.getValueAt(fila,0).toString());
            txtNombre.setText(modelo.getValueAt(fila,1).toString());
            txtEdad.setText(modelo.getValueAt(fila,2).toString());
            txtTelefono.setText(modelo.getValueAt(fila,3).toString());
            cmbSexo.setSelectedItem(modelo.getValueAt(fila,4).toString());
            cmbOcupacion.setSelectedItem(modelo.getValueAt(fila,5).toString());
            txtFechaNacimiento.setText(modelo.getValueAt(fila,6).toString());
            btnObtenerDatos.setText("Editar");
        }

    }

    public static void main(String[] args){
        JFrame frame = new Persona("Ingreso de datos");
        frame.setVisible(true);
    }
}
