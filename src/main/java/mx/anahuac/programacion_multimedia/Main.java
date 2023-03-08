package mx.anahuac.programacion_multimedia;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

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
        agregarImagen(panelOpciones);

        agregarIconoBoton(botonLibros);
        panelOpciones.add(botonComics);
        panelOpciones.add(botonManga);

        panelOpciones.setBackground(Color.getHSBColor(100,50,20));


        ventana.add(panelOpciones);

        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panelContenido=new JPanel();
        panelContenido.add(new JLabel("SELECCIONA UNA OPCION"));
        panelContenido.setBackground(Color.getHSBColor(50,90,40));

        ventana.add(panelContenido);
        botonLibros.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                ventana.getContentPane().remove(1);
                ventana.add(panelLibros);
                ventana.getContentPane().repaint();
                ventana.pack();
            }
        });


        botonComics.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                ventana.getContentPane().remove(1);
                ventana.add(panelComics);
                ventana.getContentPane().repaint();
                ventana.pack();
            }
        });

        ventana.setVisible(true);
    }


    public static void agregarImagen(JPanel contenedor){
        try{
            File file = new File("img.png");
            BufferedImage bufferedImage = ImageIO.read(file);

            ImageIcon icon= new ImageIcon(bufferedImage);
            Image image = icon.getImage(); // transform it
            Image newimg = image.getScaledInstance(100, 110,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
            icon = new ImageIcon(newimg);  // transform it back
            JLabel label=new JLabel();
            label.setIcon(icon);
            contenedor.add(label);
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

    }


    public static void agregarIconoBoton(JButton button){
        try{
            File file = new File("img.png");
            BufferedImage bufferedImage = ImageIO.read(file);

            ImageIcon icon= new ImageIcon(bufferedImage);
            Image image = icon.getImage(); // transform it
            Image newimg = image.getScaledInstance(30, 30,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
            icon = new ImageIcon(newimg);  // transform it back

            button.setIcon(icon);
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

    }

}