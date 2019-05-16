package inmobiliaria;

public class Zona {

    private String situada;

    public Zona(boolean zona) {
        if (zona) {
            this.situada = "Rustica";
        } else {
            this.situada = "Urbana";
        }
    }

    public String getSituada() {
        return situada;
    }

}
