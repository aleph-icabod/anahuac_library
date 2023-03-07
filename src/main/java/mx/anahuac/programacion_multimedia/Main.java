package mx.anahuac.programacion_multimedia;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Main {

    public static void main(String[] args) {
        JFrame ventana=new JFrame("Examen");
        ventana.setSize(400,500);

        GridLayout layout=new GridLayout(1,2);
        ventana.setLayout(layout);

        PanelLibro panelLibros=new PanelLibro();
        //ventana.add(panelLibros);

        PanelComic panelComics=new PanelComic();
        //ventana.add(panelComics);

        JPanel panelOpciones=new JPanel();
        panelOpciones.setLayout(new BoxLayout(panelOpciones,BoxLayout.Y_AXIS));
        panelOpciones.add(new JLabel("Selecciona una opcion"));
        JButton botonLibros=new JButton("Libros");
        JButton botonComics=new JButton("Comics");
        JButton botonManga=new JButton("Mangas");
        panelOpciones.add(botonLibros);
        panelOpciones.add(botonComics);
        panelOpciones.add(botonManga);

        panelOpciones.setBackground(Color.BLUE);
        ventana.add(panelOpciones);

        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panelContenido=new JPanel();
        panelContenido.add(new JLabel("SELECCIONA UNA OPCION"));
        panelContenido.setBackground(Color.RED);

        ventana.add(panelContenido);
        botonLibros.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                ventana.getContentPane().remove(1);
                ventana.add(panelLibros);
                ventana.repaint();
            }
        });


        botonComics.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                ventana.getContentPane().remove(1);
                ventana.add(panelComics);
                ventana.repaint();
            }
        });

        ventana.setVisible(true);
    }
}