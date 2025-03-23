/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion.preparacionexamen;
import java.util.*;
/**
 *
 * @author inmac
 */
public class Correccion {
    

    public static void main(String[] args) {
        System.out.println("Bienvenido/a al concesionario Dalle Ghas");
        System.out.println("Qué desea hacer?");
        System.out.println("""
                1.Mostrar todos los coches registrados.
                 2. Registrar un coche.
                 3. Borrar un coche.
                 4. Mostrar información de un coche seleccionado.
                 5. Ordenar los coches por precio.
                 6. Ordenar los coches alfabéticamente por marca.
                 7. Ordenar por marca y luego por precio.
                 8. Salir""");
        Scanner scanner = new Scanner(System.in);
        ArrayList<Vehiculo> concesionario = new ArrayList<>();
        int opcion = scanner.nextInt();
        boolean salir = false;

        while (!salir) {

            switch (opcion) {
                case 1 -> {
                    System.out.println("Ha escogido 1.Mostrar todos los coches registrados.");
                    if (concesionario.isEmpty()) {
                        System.out.println("El concesionario está vacío");
                    } else {
                        System.out.println("Estos son todos los coches registrados:");
                        for (int i = 0; i < concesionario.size(); i++) {
                            System.out.println(i + ": " + concesionario.get(i));
                        }
                    }

                }
                case 2 -> {
                    System.out.println("Has escogido 2. Registrar un coche");

                    System.out.println("¿Qué tipo de vehículo es?\n 1. Combustión. \n 2. Eléctrico\n 3. Volver al menú inicial");
                    int tipoVehiculo = scanner.nextInt();
                    scanner.nextLine();

                    if (tipoVehiculo == 1) {
                        System.out.println("Has escogido vehículo de combustión");
                        System.out.println("Qué marca es el coche?");
                        String marca = scanner.nextLine();
                        System.out.println("Qué modelo es el coche?");
                        String modelo = scanner.nextLine();
                        System.out.println("Qué color es el coche?");
                        String color = scanner.nextLine();
                        System.out.println("Qué precio tiene");
                        double precio = scanner.nextDouble();
                        System.out.println("Qué velocidad máxima tiene?");
                        int velocidadMaxima = scanner.nextInt();
                        System.out.println("Qué combustible tiene?");
                        scanner.nextLine();
                        String tipoCombustible = scanner.nextLine();
                        System.out.println("¿Cuánto combustible tiene en el depósito actualmente?");
                        int cantidadDepositoActual = scanner.nextInt();
                        System.out.println("¿Qué capacidad tiene el depósito?");
                        int capacidadDeposito = scanner.nextInt();
                        System.out.println("Qué número de serie tiene el coche?");
                        int numeroSerie = scanner.nextInt();
                        concesionario.add(new VehiculoCombustion(tipoCombustible, cantidadDepositoActual, capacidadDeposito, marca, modelo, color, precio, velocidadMaxima, numeroSerie));

                    } else if (tipoVehiculo == 2) {

                        System.out.println("Has escogido vehículo eléctrico");
                        System.out.println("Qué marca es el coche?");
                        scanner.nextLine();
                        String marca = scanner.nextLine();
                        System.out.println("Qué modelo es el coche?");
                        String modelo = scanner.nextLine();
                        System.out.println("Qué color es el coche?");
                        String color = scanner.nextLine();
                        System.out.println("Qué precio tiene");
                        double precio = scanner.nextDouble();
                        System.out.println("Qué velocidad máxima tiene?");
                        int velocidadMaxima = scanner.nextInt();
                        System.out.println("¿Cuánta carga tiene en el depósito actualmente?");
                        int cargaActual = scanner.nextInt();
                        System.out.println("¿Qué capacidad tiene de carga?");
                        int capacidadBateria = scanner.nextInt();
                        System.out.println("Qué número de serie tiene el coche?");
                        int numeroSerie = scanner.nextInt();
                        concesionario.add(new VehiculoElectrico(capacidadBateria, cargaActual, marca, modelo, color, precio, velocidadMaxima, numeroSerie));

                    } else {

                        System.out.println("Volviendo al menú inicial");

                    }

                }
                case 3 -> {
                    System.out.println("Ha seleccionado 3. Borrar un coche");
                    System.out.println("Para borrar un vehículo indique el número de serie");
                    Vehiculo vehiculoEncontrado = null;
                    boolean encontrado = false;
                    int numeroSerie = scanner.nextInt();
                    for (int i = 0; i < concesionario.size(); i++) {
                        if (numeroSerie == concesionario.get(i).getNumeroSerie()) {
                            encontrado = true;
                            vehiculoEncontrado = concesionario.get(i);
                            concesionario.remove(i);
                            System.out.println("Se ha eliminado correctamente el vehículo");
                        } else {
                            System.out.println("No se ha encontrado el vehículo");
                        }

                    }
                }

                case 4 -> {
                    System.out.println("Ha seleccionado 4. Mostrar información de un coche seleccionado");
                    System.out.println("Indique el número de serie: ");
                    Vehiculo vehiculoEncontrado = null;
                    boolean encontrado = false;
                    int numeroSerie = scanner.nextInt();
                    for (int i = 0; i < concesionario.size(); i++) {
                        if (numeroSerie == concesionario.get(i).getNumeroSerie()) {
                            encontrado = true;
                            vehiculoEncontrado = concesionario.get(i);
                            System.out.println(vehiculoEncontrado);
                        }
                    }
                    if (encontrado = false) {
                        System.out.println("No se ha encontrado el vehículo");
                    }

                }

                case 5 -> {
                    System.out.println("Ha seleccionado 5. Ordenar los coches por precio.");
                    if (concesionario.isEmpty()) {
                        System.out.println("El concesionario está vacío");
                    } else {
                        Collections.sort(concesionario, new VehiculoComparadorPrecio());
                        for (Vehiculo v : concesionario) {
                            System.out.println(v);
                        }
                    }
                }

                case 6 -> {
                    System.out.println("Has seleccionado 6. Ordenar los coches alfabéticamente por marca");
                    if (concesionario.isEmpty()) {
                        System.out.println("El concesionario está vacío");
                    } else {
                        Collections.sort(concesionario, new VehiculoComparadorMarca());
                        for (Vehiculo v : concesionario) {
                            System.out.println(v);
                        }
                    }
                }

                case 7 -> {
                    System.out.println("Has seleccionado 7. Ordenar por marca y por precio");
                    if (concesionario.isEmpty()) {
                        System.out.println("El concesionario está vacío");
                    } else {
                        Collections.sort(concesionario, new VehiculoComparadorMarca());
                        for (Vehiculo v : concesionario) {
                            System.out.println(v);
                        }
                        Collections.sort(concesionario, new VehiculoComparadorPrecio());
                        for (Vehiculo v : concesionario) {
                            System.out.println(v);
                        }
                    }
                }

                case 8 -> {
                    System.out.println("Has seleccionado 8. Salir.");
                    System.out.println("Hasta la próxima!");
                    salir = true;
                }

                default -> System.out.println("Opción no válida. Escoja de nuevo");

            }

            // Mostrar el menu y leer la opcion aqui:
            System.out.println("Qué desea hacer?");
            System.out.println("""
                1.Mostrar todos los coches registrados.
                 2. Registrar un coche.
                 3. Borrar un coche.
                 4. Mostrar información de un coche seleccionado.
                 5. Ordenar los coches por precio.
                 6. Ordenar los coches alfabéticamente por marca.
                 7. Ordenar por marca y luego por precio.
                 8. Salir""");
            opcion = scanner.nextInt();
}
    }
    }
