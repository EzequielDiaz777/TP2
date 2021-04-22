package Diaz_TP2;

public class Viaje {

    private Ciudad origen;
    private Ciudad destino;
    private float distancia;
    private Vehiculo vehiculo;
    private int cantidadDePeajes;
    private float precioDelPeaje;

    public Viaje(Ciudad origen, Ciudad destino, float distancia, Vehiculo vehiculo, int cantidadDePeajes, float precioDelPeaje) {
        this.origen = origen;
        this.destino = destino;
        this.distancia = distancia;
        this.vehiculo = vehiculo;
        this.cantidadDePeajes = cantidadDePeajes;
        this.precioDelPeaje = precioDelPeaje;
    }

    public Viaje(Ciudad origen, Ciudad destino, Vehiculo vehiculo, int cantidadDePeajes, float precioDelPeaje) {
        this.origen = origen;
        this.destino = destino;
        this.vehiculo = vehiculo;
        this.cantidadDePeajes = cantidadDePeajes;
        this.precioDelPeaje = precioDelPeaje;
    }

    public Ciudad getOrigen() {
        return origen;
    }

    public Ciudad getDestino() {
        return destino;
    }

    public float getDistancia() {
        return distancia;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public int getCantidadDePeajes() {
        return cantidadDePeajes;
    }

    public float getPrecioDelPeaje() {
        return precioDelPeaje;
    }

    public void setOrigen(Ciudad origen) {
        this.origen = origen;
    }

    public void setDestino(Ciudad destino) {
        this.destino = destino;
    }

    public void setDistancia(float distancia) {
        this.distancia = distancia;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public void setCantidadDePeajes(int cantidadDePeajes) {
        this.cantidadDePeajes = cantidadDePeajes;
    }

    public void setPrecioDelPeaje(float precioDelPeaje) {
        this.precioDelPeaje = precioDelPeaje;
    }

    public float distancias() {
        if (origen.getRuta() == destino.getRuta()) {
            return Math.abs(origen.getKm() - destino.getKm());
        } else {
            return distancia;
        }
    }

    public float costoEnPeajes() {
        return precioDelPeaje * cantidadDePeajes;
    }

    public float costoEnCombustible() {
        return vehiculo.calcularCostoDeCombustible(distancias());
    }

    public void costoTotal() {
        if (origen.getRuta() == destino.getRuta()) {
            System.out.println("La distancia entre " + origen.getNombre() + " y " + destino.getNombre() + " es de: " + Math.abs(origen.getKm() - destino.getKm()));
        } else {
            System.out.println("La distancia entre " + origen.getNombre() + " y " + destino.getNombre() + " es de: " + distancia);
        }
        System.out.println("La cantidad de combustible que se usara en este viaje sera de: " + vehiculo.cantidadDeCombustible(distancias()) + " y el costo en combustible sera de: " + vehiculo.calcularCostoDeCombustible(distancias()));
        System.out.println("La cantidad de peajes que hay en este viaje es de: " + cantidadDePeajes + " y el costo de cada peaje es de: " + precioDelPeaje);
        System.out.println("El gasto total de peaje es de: " + precioDelPeaje * cantidadDePeajes);
        float total = costoEnCombustible() + costoEnPeajes();
        System.out.println("El costo total es de: " + total);
    }
}