/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sm100223;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * @author Wilmer Salazar
 */

/**
* La clase InterfazUsuario representa la interfaz de usuario para un sistema de gestión de restaurantes.
* Permite al usuario interactuar con el sistema a través de un menú en la consola.
*/

public class InterfazUsuario {
    private Restaurante restaurante;
    private Scanner scanner;

    public InterfazUsuario(Restaurante restaurante) {
        this.restaurante = restaurante;
        this.scanner = new Scanner(System.in);
    }

    public void mostrarMenuPrincipal() {
        int opcion = 0;
        do {
            try {
                System.out.println("==== Menú Principal ====");
                System.out.println("1. Gestionar Clientes");
                System.out.println("2. Gestionar Reservaciones");
                System.out.println("3. Gestionar Pedidos");
                System.out.println("4. Salir");
                System.out.print("Ingrese una opción: ");
                opcion = scanner.nextInt();
                scanner.nextLine(); 
            } catch (InputMismatchException e) {
                System.out.println("Opción inválida. Intente nuevamente.");
                scanner.nextLine(); 
                continue;
            } catch (NoSuchElementException e) {
                System.out.println("Error de entrada. Intente nuevamente.");
                scanner = new Scanner(System.in);
                continue;
            }

            switch (opcion) {
                case 1:
                    gestionarClientes();
                    break;
                case 2:
                    gestionarReservaciones();
                    break;
                case 3:
                    gestionarPedidos();
                    break;
                case 4:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        } while (opcion != 4);
    }

    public void gestionarClientes() {
        int opcion = 0;
        do {
            try {
                System.out.println("\n==== Gestión de Clientes ====");
                System.out.println("1. Registrar Cliente");
                System.out.println("2. Actualizar Cliente");
                System.out.println("3. Eliminar Cliente");
                System.out.println("4. Listar Clientes");
                System.out.println("5. Volver al Menú Principal");
                System.out.print("Ingrese una opción: ");
                opcion = scanner.nextInt();
                scanner.nextLine();
                switch (opcion) {
                    case 1:
                        registrarCliente();
                        break;
                    case 2:
                        actualizarCliente();
                        break;
                    case 3:
                        eliminarCliente();
                        break;
                    case 4:
                        listarClientes();
                        break;
                    case 5:
                        System.out.println("Volviendo al Menú Principal...");
                        break;
                    default:
                        System.out.println("Opción inválida. Intente nuevamente.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, ingrese un número.");
                scanner.nextLine(); 
            } catch (Exception e) {
                System.out.println("Ocurrió un error: " + e.getMessage());
            }
        } while (opcion != 5);
    }

    public void gestionarReservaciones() {
        int opcion = 0;
        do {
            try {
                System.out.println("\n==== Gestión de Reservaciones ====");
                System.out.println("1. Realizar Reservación");
                System.out.println("2. Actualizar Reservación");
                System.out.println("3. Cancelar Reservación");
                System.out.println("4. Listar Reservaciones");
                System.out.println("5. Volver al Menú Principal");
                System.out.print("Ingrese una opción: ");
                opcion = scanner.nextInt();
                scanner.nextLine();
                switch (opcion) {
                    case 1:
                        realizarReservacion();
                        break;
                    case 2:
                        actualizarReservacion();
                        break;
                    case 3:
                        cancelarReservacion();
                        break;
                    case 4:
                        listarReservaciones();
                        break;
                    case 5:
                        System.out.println("Volviendo al Menú Principal...");
                        break;
                    default:
                        System.out.println("Opción inválida. Intente nuevamente.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, ingrese un número.");
                scanner.nextLine(); 
            } catch (Exception e) {
                System.out.println("Ocurrió un error: " + e.getMessage());
            }
        } while (opcion != 5);
    }

    public void gestionarPedidos() {
        int opcion = 0;
        do {
            try {
                System.out.println("\n==== Gestión de Pedidos ====");
                System.out.println("1. Realizar Pedido");
                System.out.println("2. Actualizar Pedido");
                System.out.println("3. Cancelar Pedido");
                System.out.println("4. Listar Pedidos");
                System.out.println("5. Volver al Menú Principal");
                System.out.print("Ingrese una opción: ");
                opcion = scanner.nextInt();
                scanner.nextLine();
                switch (opcion) {
                    case 1:
                        realizarPedido();
                        break;
                    case 2:
                        actualizarPedido();
                        break;
                    case 3:
                        cancelarPedido();
                        break;
                    case 4:
                        listarPedidos();
                        break;
                    case 5:
                        System.out.println("Volviendo al Menú Principal...");
                        break;
                    default:
                        System.out.println("Opción inválida. Intente nuevamente.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, ingrese un número.");
                scanner.nextLine(); 
            } catch (Exception e) {
                System.out.println("Ocurrió un error: " + e.getMessage());
            }
        } while (opcion != 5);
    }

    private void registrarCliente() {
        System.out.print("Ingrese el nombre del cliente: ");
        String nombre = scanner.nextLine();

        if (buscarCliente(nombre) != null) {
            System.out.println("Ya existe un cliente con ese nombre.");
            return;
        }

        System.out.print("Ingrese el teléfono del cliente: ");
        String telefono = scanner.nextLine();
        System.out.print("Ingrese el correo electrónico del cliente: ");
        String correoElectronico = scanner.nextLine();

        Cliente nuevoCliente = new Cliente(nombre, telefono, correoElectronico);
        restaurante.agregarCliente(nuevoCliente);
        System.out.println("Cliente registrado exitosamente.");
    }

    private Cliente buscarCliente(String nombre) {
        ArrayList<Cliente> clientes = restaurante.obtenerClientes();
        for (Cliente cliente : clientes) {
            if (cliente.getNombre().equalsIgnoreCase(nombre)) {
                return cliente;
            }
        }
        return null;
    }

    private void actualizarCliente() {
        System.out.println("Ingrese el nombre del cliente a actualizar: ");
        String nombreCliente = scanner.nextLine();
        Cliente clienteActual = buscarCliente(nombreCliente);

        if (clienteActual != null) {
            System.out.print("Ingrese el nuevo nombre del cliente: ");
            String nuevoNombre = scanner.nextLine();
            System.out.print("Ingrese el nuevo teléfono del cliente: ");
            String nuevoTelefono = scanner.nextLine();
            System.out.print("Ingrese el nuevo correo electrónico del cliente: ");
            String nuevoCorreoElectronico = scanner.nextLine();

            Cliente nuevoCliente = new Cliente(nuevoNombre, nuevoTelefono, nuevoCorreoElectronico);
            restaurante.actualizarCliente(clienteActual, nuevoCliente);
            System.out.println("Cliente actualizado exitosamente.");
        } else { System.out.println("No se encontró el cliente.");
       }
   }

   private void eliminarCliente() {
       System.out.println("Ingrese el nombre del cliente a eliminar: ");
       String nombreCliente = scanner.nextLine();
       Cliente cliente = buscarCliente(nombreCliente);

       if (cliente != null) {
           restaurante.eliminarCliente(cliente);
           System.out.println("Cliente eliminado exitosamente.");
       } else {
           System.out.println("No se encontró el cliente.");
       }
   }

   private void listarClientes() {
       ArrayList<Cliente> clientes = restaurante.obtenerClientes();
       if (clientes.isEmpty()) {
           System.out.println("No hay clientes registrados.");
       } else {
           System.out.println("Lista de Clientes:");
           for (Cliente cliente : clientes) {
               System.out.println("Nombre: " + cliente.getNombre() + ", Teléfono: " + cliente.getTelefono() + ", Correo Electrónico: " + cliente.getCorreoElectronico());
           }
       }
   }

  private void realizarReservacion() {
    System.out.print("Ingrese el nombre del cliente: ");
    String nombreCliente = scanner.nextLine();
    Cliente cliente = buscarCliente(nombreCliente);

    if (cliente != null) {
        LocalDateTime fecha;
        int numeroPersonas;

        try {
            System.out.print("Ingrese la fecha de la reservación (yyyy-MM-dd HH:mm): (Ejemplo: 2024-06-03 18:00): ");
            String fechaString = scanner.nextLine();
            fecha = LocalDateTime.parse(fechaString, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
        } catch (DateTimeParseException e) {
            System.out.println("Formato de fecha incorrecto. Intente nuevamente.");
            return;
        }

        try {
            System.out.print("Ingrese el número de personas: ");
            numeroPersonas = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea
        } catch (InputMismatchException e) {
            System.out.println("Número de personas inválido. Intente nuevamente.");
            scanner.nextLine(); // Consumir el salto de línea
            return;
        } catch (NoSuchElementException e) {
            System.out.println("Error de entrada. Intente nuevamente.");
            scanner = new Scanner(System.in);
            return;
        }

        Reservacion nuevaReservacion = new Reservacion(fecha, numeroPersonas, cliente);
        try {
            restaurante.realizarReservacion(nuevaReservacion);
            System.out.println("Reservación realizada exitosamente.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    } else {
        System.out.println("No se encontró el cliente.");
    }
}


   private void actualizarReservacion() {
    System.out.print("Ingrese el nombre del cliente de la reservación a actualizar: ");
    String nombreCliente = scanner.nextLine();
    Cliente cliente = buscarCliente(nombreCliente);
    if (cliente != null) {
        ArrayList<Reservacion> reservaciones = restaurante.obtenerReservaciones();
        ArrayList<Reservacion> reservacionesCliente = new ArrayList<>();
        for (Reservacion reservacion : reservaciones) {
            if (reservacion.getCliente().equals(cliente)) {
                reservacionesCliente.add(reservacion);
            }
        }
        if (!reservacionesCliente.isEmpty()) {
            System.out.println("Reservaciones del cliente:");
            for (int i = 0; i < reservacionesCliente.size(); i++) {
                Reservacion reservacion = reservacionesCliente.get(i);
                System.out.println((i + 1) + ". Fecha: " + reservacion.getFecha() +
                        ", Número de personas: " + reservacion.getNumerPersonas());
            }
            System.out.print("Ingrese el número de la reservación a actualizar: ");
            int numReservacion = scanner.nextInt();
            scanner.nextLine();
            try {
                if (numReservacion > 0 && numReservacion <= reservacionesCliente.size()) {
                    Reservacion reservacionActual = reservacionesCliente.get(numReservacion - 1);
                    System.out.print("Ingrese la nueva fecha de la reservación (yyyy-MM-dd HH:mm): ");
                    String fechaString = scanner.nextLine();
                    LocalDateTime nuevaFecha;
                    try {
                        nuevaFecha = LocalDateTime.parse(fechaString, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
                    } catch (DateTimeParseException e) {
                        System.out.println("Formato de fecha incorrecto. Intente nuevamente.");
                        return;
                    }
                    int nuevoNumerPersonas;
                    try {
                        System.out.print("Ingrese el nuevo número de personas: ");
                        nuevoNumerPersonas = scanner.nextInt();
                        scanner.nextLine(); // Consumir el salto de línea
                    } catch (InputMismatchException e) {
                        System.out.println("Número de personas inválido. Intente nuevamente.");
                        scanner.nextLine(); // Consumir la entrada incorrecta
                        return;
                    }
                    Reservacion nuevaReservacion = new Reservacion(nuevaFecha, nuevoNumerPersonas, cliente);
                    try {
                        restaurante.actualizarReservacion(reservacionActual, nuevaReservacion);
                        System.out.println("Reservación actualizada exitosamente.");
                    } catch (IllegalArgumentException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                } else {
                    System.out.println("Número de reservación inválido.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Intente nuevamente.");
                scanner.nextLine();
            } catch (NoSuchElementException e) {
                System.out.println("Error de entrada. Intente nuevamente.");
                scanner = new Scanner(System.in);
            }
        } else {
            System.out.println("No se encontraron reservaciones para el cliente.");
        }
    } else {
        System.out.println("No se encontró el cliente.");
    }
}


  private void cancelarReservacion() {
    System.out.print("Ingrese el nombre del cliente de la reservación a cancelar: ");
    String nombreCliente = scanner.nextLine();
    Cliente cliente = buscarCliente(nombreCliente);

    if (cliente != null) {
        ArrayList<Reservacion> reservaciones = restaurante.obtenerReservaciones();
        ArrayList<Reservacion> reservacionesCliente = new ArrayList<>();

        for (Reservacion reservacion : reservaciones) {
            if (reservacion.getCliente().equals(cliente)) {
                reservacionesCliente.add(reservacion);
            }
        }

        if (!reservacionesCliente.isEmpty()) {
            System.out.println("Reservaciones del cliente:");
            for (int i = 0; i < reservacionesCliente.size(); i++) {
                Reservacion reservacion = reservacionesCliente.get(i);
                System.out.println((i + 1) + ". Fecha: " + reservacion.getFecha() +
                                ", Número de personas: " + reservacion.getNumerPersonas());
            }

            System.out.print("Ingrese el número de la reservación a cancelar: ");
            int numReservacion = scanner.nextInt();
             scanner.nextLine();

            try {
                if (numReservacion > 0 && numReservacion <= reservacionesCliente.size()) {
                    Reservacion reservacion = reservacionesCliente.get(numReservacion - 1);
                    try {
                        restaurante.cancelarReservacion(reservacion);
                        System.out.println("Reservación cancelada exitosamente.");
                    } catch (IllegalArgumentException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                } else {
                    System.out.println("Número de reservación inválido.");
                }
            } catch (InputMismatchException e){
                System.out.println("Entrada inválida. Intente nuevamente.");
         scanner.nextLine();
            } catch (NoSuchElementException e) {
                System.out.println("Error de entrada. Intente nuevamente.");
                scanner = new Scanner(System.in);
            }
        } else {
            System.out.println("No se encontraron reservaciones para el cliente.");
        }
    } else {
        System.out.println("No se encontró el cliente.");
    }
}

   
   
    private void listarReservaciones() {
    ArrayList<Reservacion> reservaciones = restaurante.obtenerReservaciones();
    if (reservaciones.isEmpty()) {
        System.out.println("No hay reservaciones registradas.");
    } else {
        System.out.println("Lista de Reservaciones:");
        for (Reservacion reservacion : reservaciones) {
            System.out.println("Cliente: " + reservacion.getCliente().getNombre() +
                    ", Fecha: " + reservacion.getFecha() +
                    ", Número de personas: " + reservacion.getNumerPersonas());
        }
    }
}

private void realizarPedido() {
    System.out.print("Ingrese el nombre del cliente: ");
    String nombreCliente = scanner.nextLine();
    Cliente cliente = buscarCliente(nombreCliente);

    if (cliente != null) {
        Pedido nuevoPedido = new Pedido(cliente);
        boolean agregarMasProductos = true;

        while (agregarMasProductos) {
            System.out.println("\n¿Qué desea agregar al pedido?");
            System.out.println("1. Platillo");
            System.out.println("2. Bebida");
            System.out.println("3. Finalizar pedido");
            System.out.print("Ingrese una opción: ");
            int opcion;
            try {
                opcion = scanner.nextInt();
                scanner.nextLine(); 
            } catch (InputMismatchException e) {
                System.out.println("Opción inválida. Intente nuevamente.");
                scanner.nextLine(); 
                continue;
            } catch (NoSuchElementException e) {
                System.out.println("Error de entrada. Intente nuevamente.");
                scanner = new Scanner(System.in);
                continue;
            }

            switch (opcion) {
                case 1:
                    agregarPlatillo(nuevoPedido);
                    break;
                case 2:
                    agregarBebida(nuevoPedido);
                    break;
                case 3:
                    agregarMasProductos = false;
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        }

        try {
            restaurante.realizarPedido(nuevoPedido);
            System.out.println("Pedido realizado exitosamente.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    } else {
        System.out.println("No se encontró el cliente.");
    }
}

private void agregarPlatillo(Pedido pedido) {
    System.out.print("Ingrese el nombre del platillo: ");
    String nombre = scanner.nextLine();
    double precio;
    try {
        System.out.print("Ingrese el precio del platillo: ");
        precio = scanner.nextDouble();
        scanner.nextLine(); 
    } catch (InputMismatchException e) {
        System.out.println("Precio inválido. Intente nuevamente.");
        scanner.nextLine(); 
        return;
    } catch (NoSuchElementException e) {
        System.out.println("Error de entrada. Intente nuevamente.");
        scanner = new Scanner(System.in);
        return;
    }

    Platillo platillo = new Platillo(nombre, precio);
    pedido.agregarPlatillo(platillo);
    System.out.println("Platillo agregado al pedido.");
}

private void agregarBebida(Pedido pedido) {
    System.out.print("Ingrese el nombre de la bebida: ");
    String nombre = scanner.nextLine();
    double precio;
    try {
        System.out.print("Ingrese el precio de la bebida: ");
        precio = scanner.nextDouble();
        scanner.nextLine(); 
    } catch (InputMismatchException e) {
        System.out.println("Precio inválido. Intente nuevamente.");
        scanner.nextLine(); 
        return;
    } catch (NoSuchElementException e) {
        System.out.println("Error de entrada. Intente nuevamente.");
        scanner = new Scanner(System.in);
        return;
    }

    Bebida bebida = new Bebida(nombre, precio);
    pedido.agregarBebida(bebida);
    System.out.println("Bebida agregada al pedido.");
}

private void actualizarPedido() {
    System.out.print("Ingrese el nombre del cliente del pedido a actualizar: ");
    String nombreCliente = scanner.nextLine();
    Cliente cliente = buscarCliente(nombreCliente);

    if (cliente != null) {
        ArrayList<Pedido> pedidos = restaurante.obtenerPedidos();
        ArrayList<Pedido> pedidosCliente = new ArrayList<>();

        for (Pedido pedido : pedidos) {
            if (pedido.getCliente().equals(cliente)) {
                pedidosCliente.add(pedido);
            }
        }

        if (!pedidosCliente.isEmpty()) {
            System.out.println("Pedidos del cliente:");
            for (int i = 0; i < pedidosCliente.size(); i++) {
                Pedido pedido = pedidosCliente.get(i);
                System.out.println((i + 1) + ". Platillos: " + pedido.getPlatillos() +
                        ", Bebidas: " + pedido.getBebidas());
            }

            System.out.print("Ingrese el número del pedido a actualizar: ");
            int numPedido = scanner.nextInt();
            scanner.nextLine(); 

            if (numPedido > 0 && numPedido <= pedidosCliente.size()) {
                Pedido pedidoActual = pedidosCliente.get(numPedido - 1);
                Pedido nuevoPedido = new Pedido(cliente);
                boolean agregarMasProductos = true;

                while (agregarMasProductos) {
                    System.out.println("\n¿Qué desea agregar al nuevo pedido?");
                    System.out.println("1. Platillo");
                    System.out.println("2. Bebida");
                    System.out.println("3. Finalizar pedido");
                    System.out.print("Ingrese una opción: ");
                    int opcion;
                    try {
                        opcion = scanner.nextInt();
                        scanner.nextLine(); 
                    } catch (InputMismatchException e) {
                        System.out.println("Opción inválida. Intente nuevamente.");
                        scanner.nextLine(); 
                        continue;
                    } catch (NoSuchElementException e) {
                        System.out.println("Error de entrada. Intente nuevamente.");
                        scanner = new Scanner(System.in);
                        continue;
                    }

                    switch (opcion) {
                        case 1:
                            agregarPlatillo(nuevoPedido);
                            break;
                        case 2:
                    agregarBebida(nuevoPedido);
                    break;
                    case 3:
                    agregarMasProductos = false;
                    break;
                    default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    }
                    }try {
                    restaurante.actualizarPedido(pedidoActual, nuevoPedido);
                    System.out.println("Pedido actualizado exitosamente.");
                } catch (IllegalArgumentException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            } else {
                System.out.println("Número de pedido inválido.");
            }
        } else {
            System.out.println("No se encontraron pedidos para el cliente.");
        }
    } else {
        System.out.println("No se encontró el cliente.");
    }
}

private void cancelarPedido() {
    System.out.print("Ingrese el nombre del cliente del pedido a cancelar: ");
    String nombreCliente = scanner.nextLine();
    Cliente cliente = buscarCliente(nombreCliente);

    if (cliente != null) {
        ArrayList<Pedido> pedidos = restaurante.obtenerPedidos();
        ArrayList<Pedido> pedidosCliente = new ArrayList<>();

        for (Pedido pedido : pedidos) {
            if (pedido.getCliente().equals(cliente)) {
                pedidosCliente.add(pedido);
            }
        }

        if (!pedidosCliente.isEmpty()) {
            System.out.println("Pedidos del cliente:");
            for (int i = 0; i < pedidosCliente.size(); i++) {
                Pedido pedido = pedidosCliente.get(i);
                System.out.println((i + 1) + ". Platillos: " + pedido.getPlatillos() +
                        ", Bebidas: " + pedido.getBebidas());
            }

            System.out.print("Ingrese el número del pedido a cancelar: ");
            int numPedido = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea restante

            if (numPedido > 0 && numPedido <= pedidosCliente.size()) {
                Pedido pedido = pedidosCliente.get(numPedido - 1);
                try {
                    restaurante.cancelarPedido(pedido);
                    System.out.println("Pedido cancelado exitosamente.");
                } catch (IllegalArgumentException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            } else {
                System.out.println("Número de pedido inválido.");
            }
        } else {
            System.out.println("No se encontraron pedidos para el cliente.");
        }
    } else {
        System.out.println("No se encontró el cliente.");
    }
}

private void listarPedidos() {
    ArrayList<Pedido> pedidos = restaurante.obtenerPedidos();
    if (pedidos.isEmpty()) {
        System.out.println("No hay pedidos registrados.");
    } else {
        System.out.println("Lista de Pedidos:");
        for (Pedido pedido : pedidos) {
            System.out.println("Cliente: " + pedido.getCliente().getNombre() +
                    ", Platillos: " + pedido.getPlatillos() +
                    ", Bebidas: " + pedido.getBebidas());
        }
    }
}               

                
}