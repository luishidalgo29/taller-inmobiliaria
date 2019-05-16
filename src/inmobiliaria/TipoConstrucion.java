package inmobiliaria;

public class TipoConstrucion {

    private String tipo;

    public TipoConstrucion(boolean nueva) {
        if (nueva) {
            this.tipo = "nueva";
        } else {
            this.tipo = "segunda mano";
        }
    }

    public String getTipo() {
        return tipo;
    }

}
