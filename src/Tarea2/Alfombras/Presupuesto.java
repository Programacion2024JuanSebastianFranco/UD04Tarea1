package Tarea2.Alfombras;

import Tarea1.Persona;
import Tarea2.Superficie;

public class Presupuesto {

    private Superficie suelo;
    private Alfombra alfombra;
    private Persona cliente;

    public Presupuesto(Superficie suelo, Alfombra alfombra, Persona cliente){
        this.suelo = suelo;
        this.alfombra = alfombra;
        this.cliente = cliente;

    }

    public void setSuelo(double alto, double ancho){
    }

    public void setAlfombra(String nombre, double coste, TipoTejido tejido){

        this.alfombra = new Alfombra(nombre, coste, tejido);
    }

    public void setCliente(String nombre){

        this.cliente = new Persona();

    }

    public double getSuelo(){

        return suelo.getArea();

    }

    public double costeTotal() {
        return suelo.getArea() * alfombra.getCoste();
    }

    public void compararPresupuesto(Presupuesto presupuesto) {

        double pre1 = costeTotal();
        double pre2 = presupuesto.costeTotal();


        if (this.costeTotal() < presupuesto.costeTotal()) {
            System.out.println("El presupuesto " + pre1 + " de " + this.alfombra.getTejido() + " es mejor por: " + (pre2 - pre1) + " €");
        } else if (this.costeTotal() == presupuesto.costeTotal()){System.out.println("Ambos son iguales con un presupuesto de: " + pre2 + " €");
        } else {
            System.out.println("El presupuesto " + pre2 + " de " + presupuesto.alfombra.getTejido() + " es mejor por: " + +(pre1 - pre2) + " €");

        }
    }






}