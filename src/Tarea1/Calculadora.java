package Tarea1;

public class Calculadora {

    private double primerNumero;
    private double segundoNumero;
    private double resultadoSuma;
    private double resultadoResta;
    private double resultadoMulti;
    private double resultadoDivi;


    public double getPrimerNumero() {
        return primerNumero;
    }

    public void setPrimerNumero(double primerNumero) {
        this.primerNumero = primerNumero;
    }

    public double getSegundoNumero() {
        return segundoNumero;
    }

    public void setSegundoNumero(double segundoNumero) {
        this.segundoNumero = segundoNumero;
    }

    public double getResultadoSuma(double primerNumero, double segundoNumero) {
        double suma = primerNumero + segundoNumero;
        resultadoSuma = suma;
        return resultadoSuma;
    }
    

    public double getResultadoResta(double primerNumero, double segundoNumero) {
        double resta = primerNumero - segundoNumero;
        resultadoResta = resta;
        return resultadoResta;
    }

    public double getResultadoMulti(double primerNumero, double segundoNumero) {
        double multi = primerNumero * segundoNumero;
        resultadoMulti = multi;
        return resultadoMulti;
    }

    public double getResultadoDivi(double primerNumero, double segundoNumero) {
        double divi = primerNumero / segundoNumero;
        if (segundoNumero == 0)
            divi = segundoNumero;

        resultadoDivi = divi;

        return resultadoDivi;
    }

}
