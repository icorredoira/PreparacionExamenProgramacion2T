/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package programacion.preparacionexamen;
import java.util.*;
/**
 *
 * @author inmac
 */
public class PreparacionExamen {

    public static void main(String[] args) {
        System.out.println("Bienvenido/a al concesionario Dalle Ghas");
        System.out.println("Qué desea hacer?");
        System.out.println("""
                           1.Mostrar todos los coches registrados. 
                            2. Registrar un coche. 
                            3. Borrar un coche. 
                            4. Mostrar informaci\u00f3n de un coche seleccionado. 
                            5. Ordenar los coches por precio. 
                            6. Ordenar los coches alfab\u00e9ticamente por marca. 
                            7. Ordenar por marca y luego por precio. 
                            8. Arrancar un coche.
                            9. Reparar un coche.
                            10. Salir""");
        Scanner scanner = new Scanner(System.in);
        ArrayList<Vehiculo>concesionario=new ArrayList<>();
        int opcion=scanner.nextInt();
        boolean salir=false;

        while(!salir){
        switch (opcion){
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
                int tipoVehiculo=scanner.nextInt();
                scanner.nextLine();
            if(tipoVehiculo==1){
                System.out.println("Has escogido vehículo de combustión");
                VehiculoCombustion nuevoVehiculo = VehiculoCombustion.crearVehiculoCombustion(scanner);
                concesionario.add(nuevoVehiculo);
            } else if(tipoVehiculo==2){
                        System.out.println("Has escogido vehículo eléctrico");
                        VehiculoElectrico nuevoVehiculo = VehiculoElectrico.crearVehiculoElectrico(scanner);
                        
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
                System.out.println("Has seleccionado 8. Arrancar un coche");
                System.out.println("Indique el número de serie: ");
                Vehiculo vehiculoEncontrado = null;
                boolean encontrado = false;
                int numeroSerie = scanner.nextInt();
                for (int i = 0; i < concesionario.size(); i++) {
                    if (concesionario.get(i).numeroSerie == numeroSerie) {
                        try {
                            System.out.println("Vehiculo con número de serie " + numeroSerie + " encontrado. Indique la velocidad y la distancia a recorrer");
                            System.out.println("Velocidad: ");
                            int velocidad = scanner.nextInt();
                            System.out.println("Distancia");
                            int distancia = scanner.nextInt();
                            concesionario.get(i).acelerar(velocidad, distancia);
                        } catch (VelocidadExcesiva e) {
                            System.out.println("La velocidad supera los 120km/h");
                        } catch (FaltaCarga e) {
                            System.out.println("Falta carga. Cargue el vehículo");
                        } catch (FaltaCombustible e) {
                            System.out.println("Falta combustible. Llene el depósito");
                        } catch (FaltaRecursos e) {
                            System.out.println("Falta de recursos");
                        }
                    }
                }
            }
            case 9 -> {
                System.out.println("Has seleccionado 9. Reparar vehículo");
                System.out.println("Indica el número de serie");
                int numeroSerie = scanner.nextInt();
                for (int i = 0; i < concesionario.size(); i++) {
                    if (concesionario.get(i).numeroSerie == numeroSerie) {
                        concesionario.get(i).reparando();
                        System.out.println("Coche reparado. Depósito lleno");
                    } else {
                        System.out.println("Vehículo no encontrado");
                    }
                }
            }
            case 10 -> {
                System.out.println("Has seleccionado 10. Salir.");
                System.out.println("Hasta la próxima!");
                salir = true;
            }
            
            default -> System.out.println("Opción no válida. Escoja de nuevo");
        
        }
            System.out.println("Qué desea hacer?");
            System.out.println("""
                1.Mostrar todos los coches registrados.
                 2. Registrar un coche.
                 3. Borrar un coche.
                 4. Mostrar información de un coche seleccionado.
                 5. Ordenar los coches por precio.
                 6. Ordenar los coches alfabéticamente por marca.
                 7. Ordenar por marca y luego por precio.
                 8. Arrancar un coche.
                 9. Reparar un coche.
                 10. Salir""");
            opcion = scanner.nextInt();    
    }
    scanner.close();}

}
