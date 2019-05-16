
package inmobiliaria;


public class Garaje extends Superficie{
    protected Lugar parte;

    public Garaje(Lugar parteDE, int precioMetro, String ubicacion, int Metros) {
        super(precioMetro, ubicacion, Metros);
        this.parte = parteDE;
    }

    @Override
    public String mostrar() {
        String retorno = super.mostrar();
        retorno+=" Lugar : "+parte.getParte();
        return retorno;
    }

    
    public String getParteDE() {
        return parte.getParte();
    }

    
    
}
