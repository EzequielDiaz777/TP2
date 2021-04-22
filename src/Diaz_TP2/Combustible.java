package Diaz_TP2;

public class Combustible {

    private String tipoDeCombustible;
    private float precio;

    Combustible(String tipoDeCombustible, float precio) {
        this.tipoDeCombustible = tipoDeCombustible;
        this.precio = precio;
    }

    public float getPrecio() {
        return precio;
    }

    public String getTipoDeCombustible() {
        return tipoDeCombustible;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setTipoDeCombustible(String tipoDeCombustible) {
        this.tipoDeCombustible = tipoDeCombustible;
    }
}