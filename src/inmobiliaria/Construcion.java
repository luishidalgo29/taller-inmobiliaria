package inmobiliaria;

public abstract class Construcion extends Inmueble {

    protected TipoConstrucion tipo;

    public Construcion(TipoConstrucion tipo, String ubicacion, int Metros) {
        super(ubicacion, Metros);
        this.tipo = tipo;
    }

    @Override
    public String mostrar() {
        String retorno = super.mostrar();
        retorno += " tipo de construcion : " + tipo.getTipo();
        return retorno;
    }

    @Override
    protected abstract int getPrecio();

    @Override
    public String getTipo() {
        return tipo.getTipo();
    }

}
