/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package programacion.preparacionexamen;

/**
 *
 * @author inmac
 */
public class FaltaRecursos extends Exception {

    /**
     * Creates a new instance of <code>FaltaRecursos</code> without detail
     * message.
     */
    public FaltaRecursos() {
    }

    /**
     * Constructs an instance of <code>FaltaRecursos</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public FaltaRecursos(String msg) {
        super(msg);
    }
}
