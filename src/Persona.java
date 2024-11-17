public class Persona {

    private String nombre;
    private String apellido;
    private int edad;
    private String nif;



    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        if (edad < 0 || edad > 100)
            edad = 0;

        return edad;
    }

    public String getNif() {
        return nif;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    private int dniCorrecto(int i){
        int dni = 0;
        dni = i % 23;

        return dni;
    }

    private char dameLetra(int n){
        char letra;
        letra=switch (n){
            case 0 -> 'T';
            case 1->'R';
            case 2->'W';
            case 3->'A';
            case 4->'G';
            case 5->'M';
            case 6->'Y';
            case 7->'F';
            case 8->'P';
            case 9->'D';
            case 10->'X';
            case 11->'B';
            case 12->'N';
            case 13->'J';
            case 14->'Z';
            case 15->'S';
            case 16->'Q';
            case 17->'V';
            case 18->'H';
            case 19->'L';
            case 20->'C';
            case 21->'K';
            default -> 'E';
        };
        return letra;
    }

    private boolean esNifCorrecto(int dni, char letra) {
        int n = dniCorrecto(dni);
        char l = dameLetra(n);
        if (dni < 0){
            return false;
        }

        return l == Character.toUpperCase(letra);

    }

    public void setNif(int dni, char letra) {
        if (esNifCorrecto(dni,letra)){
            this.nif = dni+""+letra;
        }
        else
            System.out.println("“Error al introducir el DNI");
    }

    public boolean esAdolescente(){
        if (edad > 12 && edad < 20){
            return true;
        }
        else {
            return false;
        }
    }

    public String getFullName(){
        if (nombre.isEmpty() && apellido.isEmpty()){
            return "";
        } else if (nombre.isEmpty()) {
            return apellido;
        } else if (apellido.isEmpty()) {
            return nombre;
        }
        else {
            return nombre + " " + apellido;
        }
    }

}
