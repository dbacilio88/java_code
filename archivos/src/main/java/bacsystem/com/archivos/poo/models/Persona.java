package bacsystem.com.archivos.poo.models;

public abstract class Persona {

    private String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public abstract String getDescripcion();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
