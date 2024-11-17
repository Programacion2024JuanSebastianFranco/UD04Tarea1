public class PersonajeJuego {

    private int nivel;
    private int balas;

    public PersonajeJuego( int nivel, int balas) {
        this.nivel = nivel;
        this.balas = balas;
    }

    public int getNivel() {
        return nivel;
    }

    public int getBalas() {
        return balas;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void setBalas(int balas) {
        this.balas = balas;
    }

    public String disparar() {
        if (balas > 0) {
            balas--; // Disminuir una bala
            return "disparo exitoso, quedan " + balas + " balas";
        } else {
            return "No tienes balas para disparar";
        }
    }

    public String usarCanon() {
        if (nivel >= 5) {
            return "Cañon activado, has destruido a un enemigo poderoso";
        } else {
            return "Debes ser al menos nivel 5 para usar el cañón.";
        }
    }

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