package mx.anahuac.programacion_multimedia;

import javax.swing.*;
import java.awt.*;

public class PanelComic extends PanelLibro{

    private JCheckBox coloreado;
    public PanelComic(){
        super();
    }

    public void iniciarComponentes(){
        super.iniciarComponentes();
        this.coloreado=new JCheckBox("A color");
    }

    @Override
    public void dibujar() {
        super.dibujar();
        this.add(this.coloreado);
    }

    @Override
    public void ejecutarGuardar() {
        String nombre =getCampoNombre().getText();
        String autor = getCampoAutor().getText();
        String editorial = getCampoEditorial().getText();
        Integer precio = (Integer)getCampoPrecio().getValue();
        Integer inventario = (Integer) getCampoInventario().getValue();
        String tipoColoreado=coloreado.getText();

        Comic nuevoLibro = new Comic(1, nombre, autor, editorial, new Float(precio), inventario,tipoColoreado);

        getListaDeLibros().add(nuevoLibro);
        System.out.println(getListaDeLibros().size());
        reset();
    }
}
