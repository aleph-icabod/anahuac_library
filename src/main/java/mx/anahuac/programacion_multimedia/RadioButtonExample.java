package mx.anahuac.programacion_multimedia;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class RadioButtonExample {
    JFrame f;

    RadioButtonExample() {
        f = new JFrame();
        JRadioButton r1 = new JRadioButton("A) Male");
        JRadioButton r2 = new JRadioButton("B) Female");

        r1.setBounds(75, 50, 100, 30);
        r2.setBounds(75, 100, 100, 30);
        JCheckBox ch1=new JCheckBox("Otro");
        ch1.setBounds(75,150,100,30);
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        bg.add(ch1);

        //para poder usar la forma generica de obtener el elemento seleccionado
        r1.setActionCommand("male");
        r2.setActionCommand("female");
        ch1.setActionCommand("otro");

        f.add(r1);
        f.add(r2);
        f.add(ch1);
        JButton button = new JButton("Aceptar");
        button.setBounds(75, 200, 100, 30);


        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(r1.isSelected()){
                    JOptionPane.showMessageDialog(null,"You are Male.");
                }
                if(r2.isSelected()){
                    JOptionPane.showMessageDialog(null,"You are Female.");
                }

                //opcion mas generica para multiples opciones
                String seleccion=bg.getSelection().getActionCommand();
                System.out.println(seleccion);
            }
        });
        f.add(button);

        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new RadioButtonExample();
    }
}