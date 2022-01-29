package bacsystem.com.archivos.poo.models;

import java.util.Date;
import java.util.GregorianCalendar;

public class Empleado extends Persona {

    private double sueldo;
    private Date alta;
    private int codigo;
    private int id;
    private static int siguiente;

    public Empleado(String nombre, double sueldo) {
        super(nombre);
        this.sueldo = sueldo;
    }

    public void subirSueldo(double porcentaje) {
        double aumento = this.sueldo * porcentaje / 100;
        this.sueldo += aumento;
    }

    @Override
    public String getDescripcion() {

        return "El Empledo tiene Id: " + getId() + " Sueldo: " + getSueldo();
    }

    public String getInformacionEmpleado() {

        String informacion = "Id: " + getId() + ", Nombre: " + super.getNombre() + ", Fecha Alta: " + getAlta()
                + ", Codigo: " + getCodigo() + ", Sueldo: " + getSueldo();
        return informacion;

    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public Date getAlta() {
        GregorianCalendar calendar = new GregorianCalendar();
        this.alta = calendar.getTime();
        return alta;
    }

    public void setAlta(Date alta) {

        this.alta = alta;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getId() {
        ++siguiente;
        this.id = siguiente;
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
