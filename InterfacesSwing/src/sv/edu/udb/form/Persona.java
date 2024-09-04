package sv.edu.udb.form;

import sv.edu.udb.datos.PersonasDatos;
import sv.edu.udb.datos.OcupacionesDatos;
import sv.edu.udb.beans.PersonaBeans;
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
    private JButton btnEliminar;
    private JLabel lblOcupacion;
    private JLabel lblFechaNacimiento;
    private JComboBox cmbOcupacion;
    private JTextField txtFechaNacimiento;
    DefaultTableModel modelo = null;
    PersonaBeans personaBeans = null;
    PersonasDatos personasDatos = new PersonasDatos();
    OcupacionesDatos ocupacionesDatos = new OcupacionesDatos();

    public Persona(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(pnlPersona);
        this.setMinimumSize(new Dimension(600, 500));
        this.setLocationRelativeTo(getParent());
        /*
        Object [][] data = null;
        String[] colums = {
                "ID", "Nombres", "Edad", "Telefono", "Sexo"
        };

        modelo = new DefaultTableModel(data, colums);
        tblDatos.setModel(modelo);*/

        modelo = personasDatos.selectPersona();
        tblDatos.setModel(modelo);
        cmbOcupacion.setModel(ocupacionesDatos.selectOcupaciones());

        btnObtenerDatos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
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
                idOcupacion = ocupacionesDatos.getIdOcupacion(cmbOcupacion.getSelectedItem().toString());
                fechaNacimiento = txtFechaNacimiento.getText();
                personaBeans = new PersonaBeans(id,nombres,edad,telefono,sexo,idOcupacion,fechaNacimiento);
                if(btnObtenerDatos.getText().equals("Guardar")) {
                    personasDatos.insert(personaBeans);
                }else if (btnObtenerDatos.getText().equals("Editar")) {
                    personasDatos.update(personaBeans);
                }
                modelo=personasDatos.selectPersona();
                tblDatos.setModel(modelo);
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
                cmbOcupacion.setSelectedIndex(0);
                txtFechaNacimiento.setText("");
                btnObtenerDatos.setText("Guardar");
            }
        });


        tblDatos.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                tblObtenerDato(e);
            }
        });
        btnEliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnEliminarDatos();

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new Persona("Ingreso de Datos");
        frame.setVisible(true);
    }

    public void btnEliminarDatos(){
        personasDatos.delete(Integer.parseInt(txtId.getText()));
        //btnLimpiar();
        modelo = personasDatos.selectPersona();
        tblDatos.setModel(modelo);
    }

    private void tblObtenerDato(MouseEvent e){
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



}


