package mx.anahuac.programacion_multimedia;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        JFrame ventana=new JFrame("Examen");
        ventana.setSize(400,500);

        GridLayout layout=new GridLayout(1,0);
        ventana.setLayout(layout);

        PanelLibro panelLibros=new PanelLibro();
        ventana.add(panelLibros);

        PanelComic panelComics=new PanelComic();
        ventana.add(panelComics);

        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }
}