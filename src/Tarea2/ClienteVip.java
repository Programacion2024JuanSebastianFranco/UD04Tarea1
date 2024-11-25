package Tarea2;

import Tarea1.Persona;

public class ClienteVip {

    //Propiedades
    private Persona cliente;
    private double limiteCredito;
    private String email;
    private TipoVip tipoVip;


    //Constructores
    public ClienteVip(Persona c, TipoVip tipo, String email, double limiteCredito) {
        setCliente(c);
        setTipoVip(tipo);
        setEmail(email);
        setLimiteCredito(limiteCredito);
    }

    public ClienteVip() { // Valores por defecto
        this(
                new Persona(),
                TipoVip.NORMAL,
                "anonimo@sincorreo.es",
                0
        );
    }

    public ClienteVip(Persona persona, double limiteCredito){
        this(
                persona,
                TipoVip.NORMAL,
                "",
                limiteCredito
        );
    }


    //Getter and Setter
    public Persona getCliente() {
        return cliente;
    }

    public void setCliente(Persona cliente) {
        this.cliente = cliente;
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        if (limiteCredito >= 0)
            this.limiteCredito = limiteCredito;
        else
            this.limiteCredito = 0;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email.contains("@"))
            this.email = email;
        else
            this.email = "";
    }

    public TipoVip getTipoVip() {
        return tipoVip;
    }

    public void setTipoVip(TipoVip tipoVip) {
        this.tipoVip = tipoVip;
    }


    @Override
    public String toString() {
        return "ClienteVip{" +
                "cliente=" + cliente +
                ", limiteCredito=" + limiteCredito +
                ", email='" + email + '\'' +
                ", tipoVip=" + tipoVip +
                '}';
    }
}
