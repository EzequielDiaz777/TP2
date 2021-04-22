package Diaz_TP2;

public class Ciudad {

    private String nombre;
    private float km;
    private int ruta;

    public Ciudad(String nombre, float km, int ruta) {
        this.nombre = nombre;
        this.km = km;
        this.ruta = ruta;
    }

    public String getNombre() {
        return nombre;
    }

    public float getKm() {
        return km;
    }

    public int getRuta() {
        return ruta;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setKm(float km) {
        this.km = km;
    }

    public void setRuta(int ruta) {
        this.ruta = ruta;
    }
}