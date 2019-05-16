package inmobiliaria;

public class Vivienda extends Construcion {

    protected int precio;
    protected int numhabitantes;
    protected int piso;

    public Vivienda(int precio, int numabitantes, int piso, TipoConstrucion tipo, String ubicacion, int Metros) {
        super(tipo, ubicacion, Metros);
        this.precio = precio;
        this.numhabitantes = numhabitantes;
        this.piso = piso;
    }

    @Override
    public String mostrar() {
        String retorno = super.mostrar();
        retorno += " precio : " + precio + " numero de abitantes : " + numhabitantes + " piso :" + piso;
        return retorno;
    }

    @Override
    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getNumhabitantes() {
        return numhabitantes;
    }

    public void setNumhabitantes(int numhabitantes) {
        this.numhabitantes = numhabitantes;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

}
