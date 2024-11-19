package Tarea2;

public class Superficie {

    private double alto;
    private double anchura;
    private double area;


    //Constructores
    public Superficie() {
        this.alto = 0;
        this.anchura = 0;
    }

    public Superficie(double ancho, double altura) {

        this.anchura = ancho;
        this.alto = altura;

        if (ancho < 0)
            this.anchura = 0;
        if (altura < 0)
            this.alto = 0;
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

    public void setAnchura(int anchura) {
        this.anchura = anchura;
        if (anchura < 0)
            this.anchura = 0;
    }

    public double getArea() {
        area = anchura * alto;
        return area;
    }
}
