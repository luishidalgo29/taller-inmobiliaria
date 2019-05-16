package inmobiliaria;

public class Solar extends Superficie {

    protected Zona zona;

    public Solar(Zona zona, int precioMetro, String ubicacion, int Metros) {
        super(precioMetro, ubicacion, Metros);
        this.zona = zona;
    }

    @Override
    public String mostrar() {
        String retorno = super.mostrar();
        retorno += " zona : " + zona.getSituada();
        return retorno;
    }

    @Override
    public String getZona() {
        return zona.getSituada();
    }

}
