package Tarea1;

public class Coche {

    private int puertas;
    private int ruedas;
    private double peso;
    private double precio;
    private String motor;
    private String modelo;
    private String color;
    private String marca;

    /**
     * TOMA UN VALOR COMO RUEDAS Y LO DEVUELVE
     * @return ruedas
     */
    public int getRuedas() {
        return ruedas;
    }


    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public double getPrecio() {
        if (precio < 20000)
            System.err.println("El precio no puede ser mayor que 20.000");

        return precio;

    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }


    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public double getPeso() {
        if (peso > 0)
            System.err.println("EL peso tiene que ser mayor o igual a 0");

        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color.toUpperCase();
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
