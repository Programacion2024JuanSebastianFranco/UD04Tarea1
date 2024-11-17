public class PersonajeJuego {

    // Propiedades
    private int nivel;
    private int balas;

    public PersonajeJuego( int nivel, int balas) {
        this.nivel = nivel;
        this.balas = balas;
    }

    // Getters

    public int getNivel() {
        return nivel;
    }

    public int getBalas() {
        return balas;
    }

    // Setters

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void setBalas(int balas) {
        this.balas = balas;
    }

    // Métodos adicionales

    // disparar
    public String disparar() {
        if (balas > 0) {
            balas--; // Disminuir una bala
            return "disparo exitoso, quedan " + balas + " balas";
        } else {
            return "No tienes balas para disparar";
        }
    }

    // usar un cañón (disponible solo en nivel 5)
    public String usarCanon() {
        if (nivel >= 5) {
            return "Cañon activado, has destruido a un enemigo poderoso";
        } else {
            return "Debes ser al menos nivel 5 para usar el cañón.";
        }
    }

    // atacar a un enemigo (depende de las balas o el cañon)
    public String atacar() {
        if (balas > 0) {
            return disparar();
        } else if (nivel >= 5) {
            return usarCanon();
        } else {
            return "No puedes atacar: sin balas y sin acceso al cañon";
        }
    }
}