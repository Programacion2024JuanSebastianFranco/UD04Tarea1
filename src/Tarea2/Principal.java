package Tarea2;

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


            }
        } while (opc != 5);
    }


    int mostrarMenu() {
        Scanner scan = new Scanner(System.in);
        int opc;

        do {

            System.out.println("MENU\n1. Probar Cliente Vip\n2. Probar Superficie\n3. Probar Tarea\n4. Probar MI clase\n5. Salir");
            opc = scan.nextInt();

        } while (opc < 1 || opc > 5);
        return opc;
    }

    private void testClienteVip(){
        ClienteVip maria = new ClienteVip();
        System.out.println(maria);
    }

    private void testSuperficie(){
        Superficie muro = new Superficie (5,4);
        System.out.println("area= " + muro.getArea());
        muro.setAlto(-1.5);
        System.out.println("ancho= " + muro.getAnchura());
        System.out.println("alto= " + muro.getAlto());
        System.out.println("area= " + muro.getArea());
    }
}