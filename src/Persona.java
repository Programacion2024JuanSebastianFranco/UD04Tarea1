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

    public void setNif(String nif, char letra) {
        this.nif = nif;
    }
}
