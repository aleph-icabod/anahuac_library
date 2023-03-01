package mx.anahuac.programacion_multimedia;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

public class PanelLibro extends JPanel {
    private JTextField campoNombre;
    private JTextField campoAutor;
    private JTextField campoEditorial;
    private JSpinner campoPrecio;
    private JSpinner campoInventario;


    private List<Libro> listaDeLibros;

    public JList listaVisual;

    public PanelLibro() {
        super();

        this.listaDeLibros = new ArrayList<>();
        this.iniciarComponentes();
        this.dibujar();
        this.agregarBotones();
        this.dibujarListaEficiente();
    }


    public void iniciarComponentes(){
        this.campoNombre = new JTextField();
        this.campoAutor = new JTextField();
        this.campoEditorial = new JTextField();
        this.campoPrecio = new JSpinner();
        this.campoInventario = new JSpinner();
        this.listaVisual=new JList();
        this.listaVisual.setListData(this.listaDeLibros.toArray());


    }

    public void dibujar(){
        Font fuenteTitulo = new Font("SansSerif", Font.BOLD, 20);

        BoxLayout layout = new BoxLayout(this, BoxLayout.Y_AXIS);
        this.setLayout(layout);

        JLabel tituloPanel = new JLabel("Panel libros");
        tituloPanel.setFont(fuenteTitulo);
        tituloPanel.setForeground(Color.BLUE);

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
        this.add(this.listaVisual);
    }


    public void agregarBotones(){
        JButton btnGuardar = new JButton("Guardar");
        JButton btnCancelar = new JButton("Cancelar");

        this.add(btnGuardar);
        this.add(btnCancelar);

        btnGuardar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                ejecutarGuardar();
            }
        });


        btnCancelar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                reset();
            }
        });
    }
    public void reset() {
        campoNombre.setText("");
        campoEditorial.setText("");
        campoAutor.setText("");
        campoInventario.setValue(0);
        campoPrecio.setValue(0);
        dibujarListaEficiente();
    }


    public void ejecutarGuardar(){
        String nombre = campoNombre.getText();
        String autor = campoAutor.getText();
        String editorial = campoEditorial.getText();
        Integer precio = (Integer) campoPrecio.getValue();
        Integer inventario = (Integer) campoInventario.getValue();

        Libro nuevoLibro = new Libro(this.listaDeLibros.size()+1, nombre, autor, editorial, new Float(precio), inventario);

        listaDeLibros.add(nuevoLibro);
        System.out.println(listaDeLibros.size());
        reset();
    }

    public JTextField getCampoNombre() {
        return campoNombre;
    }

    public JTextField getCampoAutor() {
        return campoAutor;
    }

    public JTextField getCampoEditorial() {
        return campoEditorial;
    }

    public JSpinner getCampoPrecio() {
        return campoPrecio;
    }

    public JSpinner getCampoInventario() {
        return campoInventario;
    }

    public List<Libro> getListaDeLibros() {
        return listaDeLibros;
    }


    public void dibujarLista(){
        for(int i=0;i<this.listaDeLibros.size();i++){
            Libro l=this.listaDeLibros.get(i);
            String texto=l.getId()+":"+l.getNombre();
            this.add(new JLabel(texto));
        }
    }

    public void dibujarListaEficiente(){
        this.listaVisual.setListData(this.listaDeLibros.toArray());
    }
}
