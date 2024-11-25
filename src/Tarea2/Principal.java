package Tarea2;

import Tarea1.Persona;
import Tarea2.Alfombras.Alfombra;
import Tarea2.Alfombras.Presupuesto;
import Tarea2.Alfombras.TipoTejido;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Principal principal = new Principal();

        int opc;

        do {
            opc = principal.mostrarMenu();
            switch (opc) {

                case 1 -> principal.testClienteVip();
                case 2 -> principal.testSuperficie();
                case 3 -> principal.testDistancia();
                case 4 -> principal.testAlfombra();

            }
        } while (opc != 5);
    }


    int mostrarMenu() {
        Scanner scan = new Scanner(System.in);
        int opc;

        do {

            System.out.println("MENU\n1. Probar Cliente Vip\n2. Probar Superficie\n4.Probar Alfombra\n5. Salir");
            opc = scan.nextInt();

        } while (opc < 1 || opc > 5);
        return opc;
    }

    private void testClienteVip(){
        ClienteVip maria = new ClienteVip();
        System.out.println(maria);
    }

    private void testSuperficie(){
        Superficie muro = new Superficie (10,6);
        System.out.println("area: " + muro.getArea());
        muro.setAlto(-2.6);
        System.out.println("ancho: " + muro.getAnchura());
        System.out.println("alto: " + muro.getAlto());
        System.out.println("area: " + muro.getArea());
    }

    private void testAlfombra(){
        Alfombra alfombra1 = new Alfombra("alfombra1",7, TipoTejido.ALGODON);
        Superficie suelo1 = new Superficie(32,6);
        Persona persona1 = new Persona();
        Presupuesto pre1 = new Presupuesto(suelo1,alfombra1,persona1);

        Alfombra alfombra2 = new Alfombra("alfombra2", 5,TipoTejido.POLIESTER);
        Superficie suelo2 = new Superficie(32,6);
        Persona cliente2 = new Persona();
        Presupuesto pre2 = new Presupuesto(suelo2,alfombra2,cliente2);

        System.out.println("Presupuesto: " + alfombra1.getNombre() + "\n"
                + "Tejido: " + alfombra1.getTejido() + "\n"
                + "Cliente: " + persona1.getNombre() + "\n"
                + "Superficie: " + suelo1.getArea()+ "m" + "\n"
                + "Total: " + pre1.costeTotal() + "€");

        pre1.compararPresupuesto(pre2);
    }

    private void testDistancia(){

        Direccion punto = new Direccion();
        double distancia = punto.getDistancia(5,60);
        System.out.println(distancia);

    }
}