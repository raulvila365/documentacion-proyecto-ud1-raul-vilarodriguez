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

Los archivos principales son:

- `src/main/java/`: contiene las cuatro clases Java.
- `App.java`: ejecuta la aplicación.
- `GestorIncidencias.java`: gestiona las incidencias.
- `Incidencia.java`: guarda los datos de una incidencia.
- `IncidenciaNoEncontradaException.java`: controla los errores.
- `pom.xml`: configuración de Maven.
- `README.md`: información del proyecto.
- `docs/apidocs/`: documentación Javadoc generada.

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
También podemos compilar y ejecutar con Maven Wrapper:

```powershell
.\mvnw.cmd clean compile exec:java
```

## Documentación Javadoc
Para generar la documentación:
```bash
mvn javadoc:javadoc
```

Para consultar la documentación generada, abrimos el archivo `docs/apidocs/index.html`.

## Documentación en GitHub Pages
La documentación Javadoc está disponible en:
[Ver documentación Javadoc](https://raulvila365.github.io/documentacion-proyecto-ud1-raul-vilarodriguez/apidocs/)

## Autor
**Nombre:** Raúl Vila Rodríguez