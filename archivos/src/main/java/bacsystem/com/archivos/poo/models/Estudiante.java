package bacsystem.com.archivos.poo.models;

public class Estudiante extends Persona {

    private String carrera;

    public Estudiante(String nombre, String carrera) {
        super(nombre);
        this.carrera = carrera;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public String getDescripcion() {

        return "El nombre del estudiante es: " + super.getNombre() + " Carrera: " + this.carrera;
    }

}