package inmobiliaria;

public class Superficie extends Inmueble {

    protected int precioMetro;

    public Superficie(int precioMetro, String ubicacion, int Metros) {
        super(ubicacion, Metros);
        this.precioMetro = precioMetro;
    }

    @Override
    public int getPrecio() {
        return super.getMetros() * this.precioMetro;
    }

    @Override
    public String mostrar() {
        String retorno = super.mostrar();
        retorno += " precio por metro cuadrado : " + this.precioMetro + " precio :" + this.getPrecio();
        return retorno;
    }

    public void setPrecioMetro(int precioMetro) {
        this.precioMetro = precioMetro;
    }

    public int getPrecioMetro() {
        return precioMetro;
    }

}
