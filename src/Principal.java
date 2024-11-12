import java.util.Scanner;

public class Principal {

    int mostrarMenu() {
        Scanner scan = new Scanner(System.in);
        int opc;

        do {

            System.out.println("MENU\n1. Dame ultimo\n2. Quita ultimo\n3. Voltea numero\n4. Es capicua\n5. Muestra los capicuas");
            opc = scan.nextInt();

        } while (opc < 1 || opc > 5);
        return opc;
    }

}
