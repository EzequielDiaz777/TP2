package Diaz_TP2;

public class Auto extends Vehiculo {

    Auto(String marca, String patente, Combustible combustible) {
        super(marca, patente, combustible);
    }

    @Override
    public float cantidadDeCombustible(float km) {
        return (float) (km * 0.07);
    }

    @Override
    public float calcularCostoDeCombustible(float km) {
        return (float) (cantidadDeCombustible(km) * this.getCombustible().getPrecio());
    }
}