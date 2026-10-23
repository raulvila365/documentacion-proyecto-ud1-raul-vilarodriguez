package es.centro.incidencias;

import java.util.Locale;

/**
 * Representa una incidencia informática del centro.
 * Guarda su identificador, título, prioridad y estado.
 *
 * @author Raul
 * @version 1.0
 * @since 1.0
 */

public final class Incidencia {

    private final String id;
    private final String titulo;
    private final String prioridad;
    private final boolean abierta;

    /**
     * Crea una incidencia con sus datos.
     *
     * @param id identificador de la incidencia.
     * @param titulo título de la incidencia.
     * @param prioridad prioridad de la incidencia.
     * @param abierta indica si la incidencia está abierta.
     */

    public Incidencia(String id, String titulo, String prioridad, boolean abierta) {
        this.id = id;
        this.titulo = titulo;
        this.prioridad = prioridad;
        this.abierta = abierta;
    }

    /**
     * Obtiene el identificador de la incidencia.
     *
     * @return identificador de la incidencia.
     */

    public String getId() {
        return id;
    }

    /**
     * Obtiene el título de la incidencia.
     *
     * @return título de la incidencia.
     */

    public String getTitulo() {
        return titulo;
    }

    /**
     * Obtiene la prioridad de la incidencia.
     *
     * @return prioridad de la incidencia.
     */

    public String getPrioridad() {
        return prioridad;
    }

    /**
     * Comprueba si la incidencia está abierta.
     *
     * @return {@code true} si está abierta
     *         o {@code false} si está cerrada.
     */

    public boolean isAbierta() {
        return abierta;
    }

    /**
     * Comprueba si el identificador o el título
     * contienen el texto indicado.
     * No distingue entre mayúsculas y minúsculas.
     *
     * @param texto texto que se desea buscar.
     * @return {@code true} si encuentra una coincidencia
     *         o {@code false} si no encuentra ninguna.
     * @throws NullPointerException si el texto es {@code null}.
     */

    public boolean coincideCon(String texto) {
        String criterio = texto.toLowerCase(Locale.ROOT);
        return id.toLowerCase(Locale.ROOT).contains(criterio)
                || titulo.toLowerCase(Locale.ROOT).contains(criterio);
    }

}
