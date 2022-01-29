package bacsystem.com.archivos.poo.models;

public class Audi extends Vehiculo {

    private int capacidad;
    private int puertas;

    public Audi(int capacidad, int puerta) {
        super();
        this.capacidad = capacidad;
        this.puertas = puerta;
    }

    public String getObtenerAudiInformacion() {

        return "La capacidad de carga es: " + this.capacidad + " y el numero de puertas es: " + this.puertas;

    }

    public void obtenerCapacidad() {
        System.out.println("La capacidad de carga es " + this.capacidad);
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

}
