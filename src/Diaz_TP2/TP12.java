package Diaz_TP2;

public class TP12 {

    public static void main(String[] args) {
        Combustible combustible = new Combustible("Gas Natural", 100);

        Vehiculo auto = new Camion("Mercedes Benz", "AB 321 R3", combustible);

        Ciudad origen = new Ciudad("Villa Mercedes", 800, 7);

        Ciudad destino = new Ciudad("Ciudad de San Luis", 891, 7);

        Viaje viaje = new Viaje(origen, destino, 535, auto, 2, 95);

        viaje.costoTotal();
    }
}