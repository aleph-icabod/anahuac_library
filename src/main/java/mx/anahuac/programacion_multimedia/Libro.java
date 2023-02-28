package mx.anahuac.programacion_multimedia;

public class Libro {
    private int id;
    private String nombre;
    private String autor;
    private String editorial;
    private int precio;
    private int inventario;

    public Libro(){

    }

    public Libro(int id,String name, String autor,String editorial, int precio,int inventario){
        this.id=id;
        this.nombre=name;
        this.autor=autor;
        this.editorial=editorial;
        this.precio=precio;
        this.inventario=inventario;
    }

    public Libro(int id, String nombre, String autor) {
        this.id = id;
        this.nombre = nombre;
        this.autor = autor;
    }

    public int getId(){
        return this.id;
    }

    public void setId(int id){
        this.id=id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getInventario() {
        return inventario;
    }

    public void setInventario(int inventario) {
        this.inventario = inventario;
    }
}
