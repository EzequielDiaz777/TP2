package Diaz_TP2;

public abstract class Vehiculo {

    protected String marca;
    protected String patente;
    protected Combustible combustible;

    Vehiculo(String marca, String patente, Combustible combustible) {
        this.marca = marca;
        this.patente = patente;
        this.combustible = combustible;
    }

    public String getMarca() {
        return marca;
    }

    public String getPatente() {
        return patente;
    }

    public Combustible getCombustible() {
        return combustible;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public void setCombustible(Combustible combustible) {
        this.combustible = combustible;
    }

    public abstract float cantidadDeCombustible(float km);

    public abstract float calcularCostoDeCombustible(float km);
}