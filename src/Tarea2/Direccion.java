package Tarea2;

public class Direccion {

    int x;
    int y;

    public Direccion() {
        this.x = 0;
        this.y = 0;
    }

    public Direccion(int num, int num2) {
        setX(num);
        setY(num2);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
    }

    public void setY(int y) {
    }

    public  double getDistancia(int x2, int y2) {
        double dis;
        double op;
        int x1;
        int y1;

        x1 = 0;
        y1 = 0;
        setX(x2);
        setY(y2);

        op = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        dis = raiz(op);

        return dis;
    }

    private double recorrido(int x1, int y1, int x2, int y2){

        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

    }

    private double raiz(double numero) {
        double valor = Math.sqrt(numero);

        return valor;
    }

    public double distancia(){
        return recorrido(0,0,x,y);
    }

    public double distancia(int x, int y) {
        return recorrido(this.x,this.y,x,y);
    }

    public double distancia(Direccion punto2){
        return recorrido(this.x, this.y, punto2.x,punto2.y);
    }

    @Override
    public String toString() {
        return "Punto{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
