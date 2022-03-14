package Clases;

import java.awt.*;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class Ventana extends JFrame {

    private JPanel panel = new JPanel();
    private JTextField btn_inicio = new JTextField();
    Font fuente=new Font("Bold", Font.ITALIC, 40);
    
    

    public Ventana() {
        
        btn_inicio.setBackground(Color.black);
        btn_inicio.setText("INICIO");
        btn_inicio.setForeground(Color.white);
        btn_inicio.setFont(fuente);
        btn_inicio.setBorder(BorderFactory.createLineBorder(Color.black));
        btn_inicio.setEditable(false);


        
        panel.setSize(600, 600);
        panel.setBackground(Color.black);
        panel.add(btn_inicio);
        add(panel);
        setSize(600, 600);
        // setLayout(null);
        setVisible(true);







        btn_inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {

    }

    public static void main(String[] args) {
        new Ventana();

    }
}
