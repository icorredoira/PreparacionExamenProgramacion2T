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
public class VehiculoCombustion extends Vehiculo {
    protected String tipoCombustible;
    protected int cantidadDepositoActual;
    protected int capacidadDeposito;

    public VehiculoCombustion(String tipoCombustible, int cantidadDepositoActual, int capacidadDeposito, String marca, String modelo, String color, double precio, int velocidadMaxima, int velocidad, boolean hayAveria, int numeroSerie) {
        super(marca, modelo, color, precio, velocidadMaxima, velocidad, hayAveria, numeroSerie);
        this.tipoCombustible = tipoCombustible;
        this.cantidadDepositoActual = cantidadDepositoActual;
        this.capacidadDeposito = capacidadDeposito;
    }

    public VehiculoCombustion(String tipoCombustible, int cantidadDepositoActual, int capacidadDeposito, String marca, String modelo, String color, double precio, int velocidadMaxima, int numeroSerie) {
        super(marca, modelo, color, precio, velocidadMaxima, numeroSerie);
        this.tipoCombustible = tipoCombustible;
        this.cantidadDepositoActual = cantidadDepositoActual;
        this.capacidadDeposito = capacidadDeposito;
    }

    @Override
    public int getNumeroSerie() {
        return numeroSerie;
    }

    @Override
    public void setNumeroSerie(int numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    @Override
    public boolean isHayAveria() {
        return hayAveria;
    }

    @Override
    public void setHayAveria(boolean hayAveria) {
        this.hayAveria = hayAveria;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
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

    public int getCapacidadDeposito() {
        return capacidadDeposito;
    }

    public void setCapacidadDeposito(int capacidadDeposito) {
        this.capacidadDeposito = capacidadDeposito;
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

    public int getCantidadDepositoActual() {
        return cantidadDepositoActual;
    }

    public void setCantidadDepositoActual(int cantidadDepositoActual) {
        this.cantidadDepositoActual = cantidadDepositoActual;
    }

    public void echarCombustible(int cantidadCombustible) {
        setCantidadDepositoActual(getCantidadDepositoActual() + cantidadCombustible);
    }

    ;
    
    @Override
    public void acelerar(int velocidad, int distancia) throws FaltaCombustible, VelocidadExcesiva {
        if (velocidad > 120) {
            throw new VelocidadExcesiva();
        }
        setVelocidad(velocidad);
        if (getCantidadDepositoActual() - distancia * 6 < 0) {
            throw new FaltaCombustible();
        }
        setCantidadDepositoActual(getCantidadDepositoActual() - distancia * 6);
    }

    @Override
    public String toString() {
        return "VehiculoCombustion{" + "marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", precio=" + precio + ", velocidadMaxima=" + velocidadMaxima + ", velocidad=" + velocidad + ", numeroSerie=" + numeroSerie + ", tipoCombustible=" + tipoCombustible + ", cantidadDepositoActual=" + cantidadDepositoActual + ", capacidadDeposito=" + capacidadDeposito + '}';
    }

    @Override
    public void reparando() {
        setCantidadDepositoActual(getCapacidadDeposito());
        setHayAveria(false);
    }
    
    Scanner scanner=new Scanner(System.in);

    public static VehiculoCombustion crearVehiculoCombustion(Scanner scanner) {
        double precio = 0;
        int velocidadMaxima = 0;
        int cantidadDepositoActual = 0;
        int capacidadDeposito = 0;
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
        System.out.println("Qué combustible tiene?");
        String tipoCombustible = scanner.nextLine();
        entradaValida = false;
        while (!entradaValida) {
            try {
                System.out.println("¿Cuánto combustible tiene en el depósito actualmente?");
                cantidadDepositoActual = scanner.nextInt();
                entradaValida = true;
            } catch (InputMismatchException e) {
                System.out.println("Introduzca solo números");
            }
        }
        entradaValida = false;
        while (!entradaValida) {
            try {
                System.out.println("¿Qué capacidad tiene el depósito?");
                capacidadDeposito = scanner.nextInt();
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
        return new VehiculoCombustion(tipoCombustible, cantidadDepositoActual, capacidadDeposito, marca, modelo, color, precio, velocidadMaxima, numeroSerie);

    }
    
}
