# Sistema de Gestión de Clientes para un Restaurante

Este proyecto tiene como objetivo desarrollar un sistema de gestión de clientes para un restaurante utilizando Java y los principios de la Programación Orientada a Objetos (POO). El sistema permite al restaurante llevar un registro de sus clientes, gestionar sus reservaciones, tomar pedidos y brindar un servicio más eficiente.

## Características principales

- Gestión de clientes: Registrar, actualizar, eliminar y listar clientes.
- Gestión de reservaciones: Realizar, actualizar, cancelar y listar reservaciones.
- Gestión de pedidos: Realizar, agregar platillos y bebidas, actualizar, cancelar y listar pedidos.
- Interfaz de usuario basada en consola para interactuar con el sistema.
- Aplicación de los principios de POO, incluyendo encapsulamiento, herencia, polimorfismo y abstracción.

## Estructura del proyecto

1. `Cliente`: Representa a un cliente del restaurante con atributos como nombre, teléfono y correo electrónico.
2. `Reservacion`: Representa una reservación realizada por un cliente con atributos como fecha, hora y número de personas.
3. `Pedido`: Representa un pedido realizado por un cliente con listas de platillos y bebidas.
4. `Platillo`: Representa un platillo del menú con nombre y precio.
5. `Bebida`: Representa una bebida del menú con nombre y precio.
6. `Restaurante`: Contiene métodos para gestionar las listas de clientes, reservaciones y pedidos.
7. `InterfazUsuario`: Contiene métodos para interactuar con el usuario a través de la consola.
8. `Main`: Clase principal que inicia la aplicación y la interfaz de usuario.

## Requisitos

- Java 8 o superior
- Un entorno de desarrollo integrado (IDE) compatible con Java

## Instrucciones de uso

1. Clona este repositorio en tu máquina local.
2. Abre el proyecto en tu IDE preferido.
3. Compila y ejecuta la clase `Main`.
4. Sigue las instrucciones en la interfaz de usuario basada en consola para interactuar con el sistema.

## Diagrama de Secuencia

![Diagrama de Secuencia](diagramas/diagrama-secuencia.png)

## Diagrama de Clases

![Diagrama de Clases](diagramas/diagrama-clases.png)

## Contribución

Si deseas contribuir a este proyecto, puedes seguir los siguientes pasos:

1. Haz un fork de este repositorio.
2. Crea una nueva rama para tus cambios: `git checkout -b mi-nueva-rama`.
3. Realiza tus modificaciones y commit los cambios: `git commit -am 'Agrega mis cambios'`.
4. Envía tus cambios al repositorio remoto: `git push origin mi-nueva-rama`.
5. Crea un nuevo Pull Request en este repositorio.

## Licencia

Este proyecto está licenciado bajo la [Licencia MIT](LICENSE).
