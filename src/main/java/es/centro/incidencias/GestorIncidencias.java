package es.centro.incidencias;

import java.util.List;

/**
 * Clase que gestiona las incidencias del centro educativo.
 * Permite listar, buscar y consultar incidencias.
 *
 * @author Raul
 * @version 1.0
 * @since 1.0
 */

public final class GestorIncidencias {

    private final List<Incidencia> incidencias;

    /**
     * Crea un gestor con cuatro incidencias iniciales.
     */

    public GestorIncidencias() {
        incidencias = List.of(
                new Incidencia("INC-001", "No se puede iniciar sesión", "alta", true),
                new Incidencia("INC-002", "Actualizar el navegador", "media", false),
                new Incidencia("INC-003", "Impresora sin conexión", "baja", true),
                new Incidencia("INC-004", "Fallo de red en el aula", "alta", true)
        );
    }

    /**
     * Obtiene todas las incidencias registradas.
     *
     * @return lista de todas las incidencias.
     */

    public List<Incidencia> listar() {
        return incidencias;
    }

    /**
     * Obtiene las incidencias que siguen abiertas.
     *
     * @return lista de incidencias abiertas,
     *         o una lista vacía si no hay ninguna.
     */

    public List<Incidencia> listarAbiertas() {
        return incidencias.stream()
                .filter(Incidencia::isAbierta)
                .toList();
    }

    /**
     * Busca incidencias por su identificador o título.
     * No distingue entre mayúsculas y minúsculas.
     *
     * @param texto texto que se desea buscar.
     * @return lista de incidencias encontradas,
     *         o una lista vacía si no hay coincidencias.
     */

    public List<Incidencia> buscar(String texto) {
        return incidencias.stream()
                .filter(incidencia -> incidencia.coincideCon(texto))
                .toList();
    }

    /**
     * Busca una incidencia por su identificador.
     * No distingue entre mayúsculas y minúsculas.
     *
     * @param id identificador de la incidencia.
     * @return incidencia encontrada.
     * @throws IncidenciaNoEncontradaException si no existe
     *         una incidencia con ese identificador.
     */

    public Incidencia buscarPorId(String id) throws IncidenciaNoEncontradaException {
        return incidencias.stream()
                .filter(incidencia -> incidencia.getId().equalsIgnoreCase(id))
                .findFirst()
                .orElseThrow(() -> new IncidenciaNoEncontradaException(id));
    }

    /**
     * Obtiene una incidencia por su identificador.
     * No se recomienda porque devuelve {@code null}
     * cuando la incidencia no existe.
     *
     * @param id identificador de la incidencia.
     * @return incidencia encontrada o {@code null}
     *         si no existe.
     * @deprecated desde la versión 1.0.0.
     *             Utilizar {@link #buscarPorId(String)}
     *             para controlar las incidencias no encontradas.
     * @see #buscarPorId(String)
     */

    @Deprecated(since = "1.0.0", forRemoval = false)
    public Incidencia obtenerIncidencia(String id) {
        try {
            return buscarPorId(id);
        } catch (IncidenciaNoEncontradaException excepcion) {
            return null;
        }
    }
}
