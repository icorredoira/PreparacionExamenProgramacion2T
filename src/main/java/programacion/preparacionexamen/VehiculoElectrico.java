/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion.preparacionexamen;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author inmac
 */
public class VehiculoElectrico extends Vehiculo {

    protected int capacidadBateria;
    protected int cargaActual;

    public VehiculoElectrico(int capacidadBateria, int cargaActual, String marca, String modelo, String color, double precio, int velocidadMaxima, int velocidad, boolean hayAveria, int numeroSerie) {
        super(marca, modelo, color, precio, velocidadMaxima, velocidad, hayAveria, numeroSerie);
        this.capacidadBateria = capacidadBateria;
        this.cargaActual = cargaActual;
    }

    public VehiculoElectrico(int capacidadBateria, int cargaActual, String marca, String modelo, String color, double precio, int velocidadMaxima, int numeroSerie) {
        super(marca, modelo, color, precio, velocidadMaxima, numeroSerie);
        this.capacidadBateria = capacidadBateria;
        this.cargaActual = cargaActual;
    }

    @Override
    public int getNumeroSerie() {
        return numeroSerie;
    }

    @Override
    public void setNumeroSerie(int numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public int getCapacidadBateria() {
        return capacidadBateria;
    }

    public void setCapacidadBateria(int capacidadBateria) {
        this.capacidadBateria = capacidadBateria;
    }

    public int getCargaActual() {
        return cargaActual;
    }

    public void setCargaActual(int cargaActual) {
        this.cargaActual = cargaActual;
    }

    @Override
    public boolean isHayAveria() {
        return hayAveria;
    }

    @Override
    public void setHayAveria(boolean hayAveria) {
        this.hayAveria = hayAveria;
    }

    @Override
    public String getMarca() {
        return marca;
    }

    @Override
    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String getModelo() {
        return modelo;
    }

    @Override
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public double getPrecio() {
        return precio;
    }

    @Override
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    @Override
    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    @Override
    public int getVelocidad() {
        return velocidad;
    }

    @Override
    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public void cargarVehiculo(int cargaElectrica) {
        setCargaActual(getCargaActual() + cargaElectrica);
    }

    
    

    @Override
    public void acelerar(int velocidad, int distancia) throws FaltaCarga, VelocidadExcesiva{
        setVelocidad(velocidad);
        setCargaActual(getCargaActual() - distancia * 6);
    }

        

    @Override
    public void reparando() {
        setHayAveria(false);
        setCargaActual(getCapacidadBateria());
    }

    @Override
    public String toString() {
        return "VehiculoElectrico{" + "marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", precio=" + precio + ", velocidadMaxima=" + velocidadMaxima + ", velocidad=" + velocidad + ", numeroSerie=" + numeroSerie + "capacidadBateria=" + capacidadBateria + ", cargaActual=" + cargaActual + '}';
    }
        Scanner scanner=new Scanner(System.in);

        public static VehiculoElectrico crearVehiculoElectrico(Scanner scanner) {
        double precio = 0;
        int velocidadMaxima = 0;
        int cantidadCargaActual = 0;
        int capacidadCarga = 0;
        int numeroSerie = 0;
        System.out.println("Has escogido vehículo de combustión");
        System.out.println("Qué marca es el coche?");
        String marca = scanner.nextLine();
        System.out.println("Qué modelo es el coche?");
        String modelo = scanner.nextLine();
        System.out.println("Qué color es el coche?");
        String color = scanner.nextLine();
        boolean entradaValida = false;
        while (!entradaValida) {
            try {
                System.out.println("Qué precio tiene");
                precio = scanner.nextDouble();
                entradaValida = true;
            } catch (InputMismatchException e) {
                System.out.println("Introduzca solo números");
            }
        }
        entradaValida = false;
        while (!entradaValida) {
            try {
                System.out.println("Qué velocidad máxima tiene?");
                velocidadMaxima = scanner.nextInt();
                entradaValida = true;
            } catch (InputMismatchException e) {
                System.out.println("Introduzca solo números");
            }
        }
        
        entradaValida = false;
        while (!entradaValida) {
            try {
                System.out.println("¿Cuánta carga tiene actualmente?");
                cantidadCargaActual = scanner.nextInt();
                entradaValida = true;
            } catch (InputMismatchException e) {
                System.out.println("Introduzca solo números");
            }
        }
        entradaValida = false;
        while (!entradaValida) {
            try {
                System.out.println("¿Qué capacidad tiene de carga?");
                capacidadCarga = scanner.nextInt();
                entradaValida = true;
            } catch (InputMismatchException e) {
                System.out.println("Introduzca solo números");
            }
        }
        entradaValida = false;
        while (!entradaValida) {
            try {
                System.out.println("Qué número de serie tiene el coche?");
                numeroSerie = scanner.nextInt();
                entradaValida = true;
            } catch (InputMismatchException e) {
                System.out.println("Introduzca solo números");
            }
        }
        return new VehiculoElectrico(capacidadCarga, cantidadCargaActual, marca, modelo, color, precio, velocidadMaxima, numeroSerie);
        }


}
