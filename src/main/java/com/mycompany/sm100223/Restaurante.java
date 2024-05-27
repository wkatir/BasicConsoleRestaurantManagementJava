/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sm100223;

import java.util.ArrayList;

/**
 *
 * @author Wilmer Salazar
 */

/**
 * La clase Restaurante gestiona clientes, reservaciones y pedidos.
 */

public class Restaurante {
    private ArrayList<Cliente> clientes;
    private ArrayList<Reservacion> reservaciones;
    private ArrayList<Pedido> pedidos;

    /**
     * Constructor de la clase Restaurante. Inicializa las listas de clientes, reservaciones y pedidos.
     */
    public Restaurante() {
        clientes = new ArrayList<>();
        reservaciones = new ArrayList<>();
        pedidos = new ArrayList<>();
    }

    /**
     * Agrega un nuevo cliente a la lista de clientes.
     *
     * @param cliente El cliente a agregar.
     */
    public void agregarCliente(Cliente cliente){
        clientes.add(cliente);
    }

    /**
     * Elimina un cliente de la lista de clientes.
     *
     * @param cliente El cliente a eliminar.
     */
    public void eliminarCliente(Cliente cliente){
        clientes.remove(cliente);
    }

    /**
     * Actualiza la información de un cliente existente.
     *
     * @param clienteActual El cliente actual que será actualizado.
     * @param clienteNuevo El cliente con la nueva información.
     */
    public void actualizarCliente(Cliente clienteActual, Cliente clienteNuevo){
        int index = clientes.indexOf(clienteActual);
        if(index != -1){
            clientes.set(index, clienteNuevo);
        }
    }

    /**
     * Obtiene la lista de todos los clientes.
     *
     * @return Una lista de clientes.
     */
    public ArrayList<Cliente> obtenerClientes() {
        return clientes;
    }

    /**
     * Agrega una nueva reservación a la lista de reservaciones.
     *
     * @param reservacion La reservación a agregar.
     */
    public void realizarReservacion(Reservacion reservacion){
        reservaciones.add(reservacion);
    }

    /**
     * Cancela una reservación de la lista de reservaciones.
     *
     * @param reservacion La reservación a cancelar.
     */
    public void cancelarReservacion(Reservacion reservacion){
        reservaciones.remove(reservacion);
    }

    /**
     * Actualiza una reservación existente.
     *
     * @param reservacionActual La reservación actual que será actualizada.
     * @param reservacionNueva La nueva reservación con la información actualizada.
     */
    public void actualizarReservacion(Reservacion reservacionActual, Reservacion reservacionNueva){
        int index = reservaciones.indexOf(reservacionActual);
        if(index != -1){
            reservaciones.set(index, reservacionNueva);
        }
    }

    /**
     * Obtiene la lista de todas las reservaciones.
     *
     * @return Una lista de reservaciones.
     */
    public ArrayList<Reservacion> obtenerReservaciones() {
        return reservaciones;
    }

    /**
     * Agrega un nuevo pedido a la lista de pedidos.
     *
     * @param pedido El pedido a agregar.
     */
    public void realizarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    /**
     * Cancela un pedido de la lista de pedidos.
     *
     * @param pedido El pedido a cancelar.
     */
    public void cancelarPedido(Pedido pedido) {
        pedidos.remove(pedido);
    }

    /**
     * Actualiza un pedido existente.
     *
     * @param pedidoActual El pedido actual que será actualizado.
     * @param pedidoNuevo El nuevo pedido con la información actualizada.
     */
    public void actualizarPedido(Pedido pedidoActual, Pedido pedidoNuevo) {
        int index = pedidos.indexOf(pedidoActual);
        if (index != -1) {
            pedidos.set(index, pedidoNuevo);
        }
    }

    /**
     * Obtiene la lista de todos los pedidos.
     *
     * @return Una lista de pedidos.
     */
    public ArrayList<Pedido> obtenerPedidos() {
        return pedidos;
    }
}
    
    
    
   
