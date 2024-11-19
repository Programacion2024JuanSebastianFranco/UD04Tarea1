package Tarea2;

public class Superficie {

    private double alto;
    private double anchura;


    //Constructores
    public Superficie() {
        this.alto = 0;
        this.anchura = 0;
    }

    public Superficie(double ancho, double alto) {
        setAlto(alto);
        setAnchura(ancho);
    }

    //Setter And Getter
    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
        if (alto < 0)
            this.alto = 0;
    }

    public double getAnchura() {
        return anchura;
    }

    public void setAnchura(double anchura) {
        this.anchura = anchura;
        if (anchura < 0)
            this.anchura = 0;
    }

    public double getArea() {
        return anchura * alto;
    }

    @Override
    public String toString() {
        return "Superficie{" +
                "alto=" + alto +
                ", anchura=" + anchura +
                '}';
    }
}
