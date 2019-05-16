package inmobiliaria;

import java.util.ArrayList;

public class Inmobiliaria {

    public static void main(String[] args) {
        Lugar lugar = new Lugar(true);
        Lugar lugar2 = new Lugar(false);
        Zona zona = new Zona(true);
        Zona zona2 = new Zona(false);
        TipoConstrucion tipo = new TipoConstrucion(true);
        TipoConstrucion tipo2 = new TipoConstrucion(false);
        Garaje garaje = new Garaje(lugar, 15, "privado", 20);
        Garaje garaje1 = new Garaje(lugar2, 20, "publico", 30);
        Garaje garaje2 = new Garaje(lugar, 25, "privado", 40);
        Local locale = new Local(10, tipo, "kokorico", 20);
        Local locale1 = new Local(12, tipo2, "las plazas", 20);
        Local locale2 = new Local(13, tipo2, "octavio", 30);
        Solar solar = new Solar(zona, 14, "urbano", 35);
        Solar solar1 = new Solar(zona, 21, "urbano", 30);
        Solar solar2 = new Solar(zona2, 21, "rustico", 15);
        Vivienda vivienda = new Vivienda(150, 3, 210, tipo, "bolivar", 15);
        Vivienda vivienda1 = new Vivienda(220, 4, 211, tipo2, "centro", 30);
        Vivienda vivienda2 = new Vivienda(250, 5, 212, tipo, "equidad", 50);
        ArrayList<Inmueble> inmuebles = new ArrayList<>();
        inmuebles.add(solar);
        inmuebles.add(solar1);
        inmuebles.add(solar2);
        inmuebles.add(vivienda);
        inmuebles.add(vivienda1);
        inmuebles.add(vivienda2);
        inmuebles.add(locale);
        inmuebles.add(locale1);
        inmuebles.add(locale2);
        inmuebles.add(garaje);
        inmuebles.add(garaje2);
        inmuebles.add(garaje1);
        for (Inmueble inmueble : inmuebles) {

            System.out.println(inmueble.mostrar());

        }
        Agencia agencia = new Agencia();

        for (Inmueble inmueble : inmuebles) {
            if (inmueble.getClass() == Solar.class || inmueble.getClass() == Vivienda.class) {
                agencia.añadeVentaInmueble(inmueble);
            }
            if (inmueble.getClass() == Garaje.class || inmueble.getClass() == Local.class) {
                agencia.anadeAlquilerInmueble(inmueble);
            }
        }

        for (Inmueble inmueble : agencia.inmueblesVenta(500)) {
            System.out.println("-" + inmueble.mostrar());

        }
        for (Inmueble inmueble : agencia.localesSegundaMano(35)) {
            System.out.println("+" + inmueble.mostrar());

        }
        System.out.println("Numero de solares no urbanos en venta es :" + agencia.solaresRusticos());

    }

}
