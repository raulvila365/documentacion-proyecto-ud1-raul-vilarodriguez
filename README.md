# Gestor de incidencias

## Descripción
Este proyecto es una aplicación hecha en Java que permite gestionar incidencias, como problemas
con ordenadores, impresoras o conexiones a Internet.

## Funcionalidades
- Listar todas las incidencias.
- Mostrar las incidencias abiertas.
- Buscar incidencias por ID o título.
- Consultar los detalles de una incidencia.
- Utilizar un menú interactivo.

## Requisitos
- Java JDK 17.
- Maven.
- IntelliJ IDEA.

## Estructura del proyecto
El proyecto contiene cuatro clases principales:
- **App.java:** ejecuta la aplicación.
- **GestorIncidencias.java:** gestiona y busca las incidencias.
- **Incidencia.java:** guarda la información de cada incidencia.
- **IncidenciaNoEncontradaException.java:** controla los errores al buscar incidencias.

## Clases principales
| Clase | Descripción |
|---|---|
| App | Ejecuta la aplicación |
| GestorIncidencias | Gestiona las incidencias |
| Incidencia | Guarda los datos de una incidencia |
| IncidenciaNoEncontradaException | Controla los errores |

## Compilación y ejecución
Para compilar y ejecutar el proyecto:
```bash
mvn clean compile exec:java
```

## Documentación Javadoc
Para generar la documentación:
```bash
mvn javadoc:javadoc
```

Para consultar la documentación generada, abrimos el archivo `docs/apidocs/index.html`.

## Documentación en GitHub Pages
La documentación Javadoc está disponible en:


## Autor
**Nombre:** Raúl Vila Rodríguez