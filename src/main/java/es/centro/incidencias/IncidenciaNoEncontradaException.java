package es.centro.incidencias;

/**
 * Excepción que se produce cuando se busca una
 * incidencia por su identificador y no existe.
 *
 * @author Raul
 * @version 1.0
 * @since 1.0
 * @see GestorIncidencias#buscarPorId(String)
 */

public class IncidenciaNoEncontradaException extends Exception {

    /**
     * Crea una excepción indicando el identificador
     * de la incidencia que no se ha encontrado.
     *
     * @param id identificador de la incidencia no encontrada.
     */

    public IncidenciaNoEncontradaException(String id) {
        super("No existe ninguna incidencia con el identificador " + id + ".");
    }
}
