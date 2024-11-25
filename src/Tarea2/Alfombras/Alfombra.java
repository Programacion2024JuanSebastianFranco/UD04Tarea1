package Tarea2.Alfombras;

public class Alfombra {

    private String nombre;
    private double coste;
    private TipoTejido tejido;


    public Alfombra(String nombre, double coste, TipoTejido tejido) {
        this.nombre = nombre;
        this.coste = coste;
        this.tejido = tejido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCoste() {
        return coste;
    }

    public void setCoste(double coste) {
        this.coste = coste;
    }

    public TipoTejido getTejido() {
        return tejido;
    }

    public void setTejido(TipoTejido tejido) {
        this.tejido = tejido;
    }
}
