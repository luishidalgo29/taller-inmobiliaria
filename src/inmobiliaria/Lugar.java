package inmobiliaria;

public class Lugar {

    private String parte;

    public Lugar(boolean parte) {
        if (parte) {
            this.parte = "Publico";
        } else {
            this.parte = "Privado";
        }
    }

    public String getParte() {
        return parte;
    }

}
