package mx.anahuac.programacion_multimedia;

public class Manga extends Libro{
    private int tomo;
    private String genero;

    public Manga(int id, String name, String autor, String editorial, int precio, int inventario, int tomo, String genero) {
        super(id, name, autor, editorial, precio, inventario);
        this.tomo = tomo;
        this.genero = genero;
    }

    public int getTomo() {
        return tomo;
    }

    public void setTomo(int tomo) {
        this.tomo = tomo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
