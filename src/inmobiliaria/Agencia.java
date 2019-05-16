package inmobiliaria;

import java.util.ArrayList;

public class Agencia {

    private ArrayList<Inmueble> enventa;
    private ArrayList<Inmueble> enalquiler;

    public Agencia() {
        this.enventa = new ArrayList<>();
        this.enalquiler = new ArrayList<>();

    }

    public boolean añadeVentaInmueble(Inmueble enVenta) {
        if (enVenta.getClass() == Solar.class || enVenta.getClass() == Vivienda.class) {
            if (!enventa.contains(enVenta)) {
                enventa.add(enVenta);
                return true;
            }
        }
        return false;
    }

    public boolean anadeAlquilerInmueble(Inmueble enAlquiler) {
        if (enAlquiler.getClass() == Garaje.class || enAlquiler.getClass() == Local.class) {
            if (!enalquiler.contains(enAlquiler)) {
                enalquiler.add(enAlquiler);
                return true;
            }
        }
        return false;
    }

    public ArrayList<Inmueble> inmueblesVenta(int precio) {
        ArrayList<Inmueble> salida = new ArrayList<>();
        for (Inmueble inmueble : enventa) {
            if (inmueble.getPrecio() < precio) {
                salida.add(inmueble);
            }
        }
        return salida;
    }

    public ArrayList<Inmueble> localesSegundaMano(int metros) {
        ArrayList<Inmueble> salida = new ArrayList<>();
        for (Inmueble inmueble : enalquiler) {
            if (inmueble.getMetros() > metros && inmueble.getClass() == Local.class) {
                if (inmueble.getTipo().equals("segunda mano")) {
                    salida.add(inmueble);
                }
            }
        }
        return salida;
    }

    public int solaresRusticos() {
        int salida = 0;
        for (Inmueble inmueble : enventa) {
            if (inmueble.getClass() == Solar.class) {
                if (inmueble.getZona().equals("Rustica")) {
                    salida++;
                }
            }
        }
        return salida;
    }

}
