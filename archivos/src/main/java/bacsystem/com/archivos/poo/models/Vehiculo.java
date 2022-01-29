package bacsystem.com.archivos.poo.models;

public class Vehiculo {

    private String color;
    private String marca;
    private int llantas;
    private int largo;
    private int ancho;
    private int motor;
    private int peso;

    public Vehiculo() {
        this.color = "Negro";
        this.marca = "Toyota";
        this.llantas = 4;
        this.largo = 4;
        this.ancho = 2;
        this.motor = 1800;
        this.peso = 5000;
    }

    public String obtenerInformacionGeneral() {
        return "Color: " + this.color + " Marca: " + this.marca + " N° Llantas " + this.llantas + " Largo: "
                + this.largo + " Ancho: " + this.ancho + " Motor: " + this.motor + " Peso: " + this.peso;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getLlantas() {
        return llantas;
    }

    public void setLlantas(int llantas) {
        this.llantas = llantas;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        this.motor = motor;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

}
