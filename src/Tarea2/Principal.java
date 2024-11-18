package Tarea2;

import Tarea1.Persona;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Principal principal = new Principal();

        int opc;

        do {
            opc = principal.mostrarMenu();
            switch (opc) {

                case 1 -> principal.testClienteVip();


            }
        } while (opc != 5);
    }


    int mostrarMenu() {
        Scanner scan = new Scanner(System.in);
        int opc;

        do {

            System.out.println("MENU\n1. Probar Cliente Vip\n2. Probar Tarea\n3. Probar Tarea\n4. Probar MI clase\n5. Salir");
            opc = scan.nextInt();

        } while (opc < 1 || opc > 5);
        return opc;
    }

    private void testClienteVip(){
        ClienteVip maria = new ClienteVip();
        maria.getCliente().setApellido("Maria");
        System.out.println(maria);

    }
}