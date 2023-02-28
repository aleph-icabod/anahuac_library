package mx.anahuac.programacion_multimedia;

import javax.swing.*;
import java.awt.*;

public class PanelLibro extends JPanel {
    private JTextField campoNombre;
    private JTextField campoAutor;
    private JTextField campoEditorial;
    private JTextField campoPrecio;
    private JTextField campoInventario;


    public PanelLibro() {
        super();
        this.campoNombre = new JTextField();
        this.campoAutor = new JTextField();
        this.campoEditorial = new JTextField();
        this.campoPrecio = new JTextField();
        this.campoInventario = new JTextField();

        BoxLayout layout=new BoxLayout(this,BoxLayout.Y_AXIS);
        this.setLayout(layout);

        JLabel tituloPanel=new JLabel("Panel libros");

        tituloPanel.setForeground(Color.GREEN);

        this.add(tituloPanel);
        this.add(new JLabel("Ingresa Nombre"));
        this.add(this.campoNombre);
        this.add(new JLabel("Ingresa Autor"));
        this.add(this.campoAutor);
        this.add(new JLabel("Ingresa Editorial"));
        this.add(this.campoEditorial);
        this.add(new JLabel("Ingresa Precio"));
        this.add(this.campoPrecio);
        this.add(new JLabel("Ingresa Inventario"));
        this.add(this.campoInventario);

        JButton btnGuardar=new JButton("Guardar");
        JButton btnCancelar=new JButton("Cancelar");

        this.add(btnGuardar);
        this.add(btnCancelar);
    }

}
