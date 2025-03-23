/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion.preparacionexamen;
import java.util.*;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/**
 *
 * @author inmac
 */
public class VehiculoComparadorPrecio implements Comparator <Vehiculo>  {

    @Override
    public int compare(Vehiculo o1, Vehiculo o2) {
        return Double.compare(o1.precio, o2.precio);
        
    }

    
}
