# ForoHub

## Descripción

ForoHub es una API REST para gestionar tópicos en un foro. Permite crear, listar, actualizar y eliminar tópicos.

## Requisitos

- Java 17 o superior
- Maven 4 o superior
- PostgreSQL 13 o superior

## Configuración

### Configuración de la base de datos

1. Crea una base de datos PostgreSQL llamada `forohub`.
2. Configura las credenciales de la base de datos en `src/main/resources/application.properties`.

### Migraciones de Flyway

Las migraciones de Flyway se aplicarán automáticamente al iniciar la aplicación.

## Ejecución

Para ejecutar la aplicación, usa el siguiente comando:

```bash
mvn spring-boot:run
