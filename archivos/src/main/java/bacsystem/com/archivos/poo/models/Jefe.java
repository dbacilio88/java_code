package bacsystem.com.archivos.poo.models;

public class Jefe extends Empleado {

    private double incentivo;

    public Jefe(String nombre, double sueldo) {
        super(nombre, sueldo);
    }

    @Override
    public String getDescripcion() {

        return "El Jefe se llama " + super.getNombre() + " Su sueldo es: " + getSueldo();
    }

    public void establecerIncentivo(double incentivo) {
        this.incentivo = incentivo;
    }

    public double getSueldo() {
        double sueldo = super.getSueldo();
        return sueldo + this.incentivo;
    }

    public double getIncentivo() {
        return incentivo;
    }

    public void setIncentivo(double incentivo) {
        this.incentivo = incentivo;
    }

}
