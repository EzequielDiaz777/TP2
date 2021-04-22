package Diaz_TP2;

public final class Camioneta extends Vehiculo {

    public Camioneta(String marca, String patente, Combustible combustible) {
        super(marca, patente, combustible);
    }

    @Override
    public float cantidadDeCombustible(float km) {
        return (float) (km * 0.1);
    }

    @Override
    public float calcularCostoDeCombustible(float km) {
        return (float) (cantidadDeCombustible(km) * this.getCombustible().getPrecio());
    }
}