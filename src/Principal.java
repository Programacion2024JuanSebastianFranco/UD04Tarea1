import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Principal principal = new Principal();

        int opc;

        do {
            opc = principal.mostrarMenu();
            switch (opc){

                case 1 -> principal.testCoche();



            }
        } while(opc != 5);
    }


    int mostrarMenu() {
        Scanner scan = new Scanner(System.in);
        int opc;

        do {

            System.out.println("MENU\n1. Probar Coche\n2. Probar Calculadora\n3. Probar Persona\n4. Probar MI clase\n5. Salir");
            opc = scan.nextInt();

        } while (opc < 1 || opc > 5);
        return opc;
    }



    private void testCoche(){
        Coche ibiza = new Coche();
        Coche cordoba = new Coche();

        // Establecer valores para las propiedades
        ibiza.setPuertas(4);
        ibiza.setPeso(1500.0);
        ibiza.setPrecio(15000.0);
        ibiza.setMotor("TDI 1200");
        ibiza.setRuedas(4);
        ibiza.setModelo("Ibiza");
        ibiza.setColor("Rojo");

        // Imprimir información sobre los coches
        System.out.println("Información del coche 1:");
        System.out.println("Puertas: " + ibiza.getPuertas());
        System.out.println("Peso: " + ibiza.getPeso() + " kg");
        System.out.println("Precio: " + ibiza.getPrecio()+"€");
        System.out.println("Motor: " + ibiza.getMotor());
        System.out.println("Ruedas: " + ibiza.getRuedas());
        System.out.println("Modelo: " + ibiza.getModelo());
        System.out.println("Color: " + ibiza.getColor());

        //probamos los setter que pueden dar error
        cordoba.setPuertas(2);
        cordoba.setPeso(-1200.0);
        cordoba.setPrecio(25000.0);
        cordoba.setMotor("TDI 2000");
        cordoba.setRuedas(4);
        cordoba.setModelo("Cordaba");
        cordoba.setColor("Azul");
    }
}
