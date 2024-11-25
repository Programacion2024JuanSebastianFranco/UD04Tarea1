package Tarea2;

import Tarea1.Persona;

public class Alfombra {

    private String nombre;
    private double coste;
    private TipoTejido tejido;


    public Alfombra(Superficie suelo, Alfombra alfombra, Persona cliente) {

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

    public double getPresupuesto(){
        return alfombra.getCoste() * suelo.getArea();
    }
}
