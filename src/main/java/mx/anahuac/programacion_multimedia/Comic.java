package mx.anahuac.programacion_multimedia;

public class Comic extends Libro{
    private String tipo_coloreado;

    public Comic(int id, String name, String autor, String editorial, Float precio, int inventario, String tipo_coloreado) {
        super(id, name, autor, editorial, precio, inventario);
        this.tipo_coloreado = tipo_coloreado;
    }

    public String getTipo_coloreado() {
        return tipo_coloreado;
    }

    public void setTipo_coloreado(String tipo_coloreado) {
        this.tipo_coloreado = tipo_coloreado;
    }
}
