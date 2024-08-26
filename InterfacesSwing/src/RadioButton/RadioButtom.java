package RadioButton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RadioButtom extends JFrame{
    private JRadioButton rbtOpcion1;
    private JRadioButton rbtOpcion2;
    private JRadioButton rbtOpcion3;
    private JLabel lblTitulo;
    private JLabel lblImagen;
    private JPanel pnlImg;


    public RadioButtom(String title){
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(pnlImg);
        this.setMinimumSize(new Dimension(400, 400));
        this.setLocationRelativeTo(getParent());
    }

    public RadioButtom() {
        rbtOpcion1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sv/edu/udb/img/img1.jpg")));
            }
        });

        rbtOpcion2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sv/edu/udb/img/img1.jpg")));
            }
        });
        rbtOpcion3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sv/edu/udb/img/img3.png")));
            }
        });
    }

    public static void main(String[] args){
        JFrame frame = new RadioButtom("Seleccione una imagen");
        frame.setVisible(true);
    }
}
