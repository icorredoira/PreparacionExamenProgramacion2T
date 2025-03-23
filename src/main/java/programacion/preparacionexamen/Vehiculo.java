/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion.preparacionexamen;

/**
 *
 * @author inmac
 */
public abstract class Vehiculo implements Reparable {
    //marca, modelo, color, capacidad del depósito, precio, velocidad maxima, cantidad en depósito

    protected String marca;
    protected String modelo;
    protected String color;
    protected double precio;
    protected int velocidadMaxima;
    protected int velocidad;
    protected boolean hayAveria;
    protected int numeroSerie;

    public Vehiculo(String marca, String modelo, String color, double precio, int velocidadMaxima, int velocidad, boolean hayAveria, int numeroSerie) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.precio = precio;
        this.velocidadMaxima = velocidadMaxima;
        this.velocidad = velocidad;
        this.hayAveria = hayAveria;
        this.numeroSerie=numeroSerie;
    }

    public Vehiculo(String marca, String modelo, String color, double precio, int velocidadMaxima, int numeroSerie) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.precio = precio;
        this.velocidadMaxima = velocidadMaxima;
        this.numeroSerie=numeroSerie;
    }

    public int getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(int numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    
    

    public boolean isHayAveria() {
        return hayAveria;
    }

    public void setHayAveria(boolean hayAveria) {
        this.hayAveria = hayAveria;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", precio=" + precio + ", velocidadMaxima=" + velocidadMaxima + ", velocidad=" + velocidad + ", numeroSerie=" + numeroSerie + '}';
    }

    

    @Override
    public void reparando() {

        setHayAveria(false);
    }

    
    
    public abstract void acelerar(int velocidad, int distancia) throws FaltaRecursos, VelocidadExcesiva;
}
