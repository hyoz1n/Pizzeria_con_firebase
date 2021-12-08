package Pizzas;

public class Pizzas {
    private String id;
    private String nombre;
    private String precio;
    private String localizacion;
    public Pizzas(){

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    @Override
    public String toString() {
        return "Pizzas" + ": " +
                 nombre + " " +
                "Precio" + ": " +
                 precio + " " +
                "Localizacion" + ": " +
                 localizacion
                ;
    }
}
