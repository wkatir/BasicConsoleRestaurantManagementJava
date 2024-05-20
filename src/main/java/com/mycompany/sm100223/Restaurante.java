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

public class Restaurante {
    private ArrayList<Cliente> clientes;
    private ArrayList<Reservacion> reservaciones;
    private ArrayList<Pedido> pedidos;

    public Restaurante() {
        clientes = new ArrayList<>();
        reservaciones = new ArrayList<>();
        pedidos = new ArrayList<>();
    }
    
    public void agregarCliente(Cliente cliente){
        clientes.add(cliente);
    }
    
    public void eliminarCliente(Cliente cliente){
        clientes.remove(cliente);
    }
    
    public void actualizarCliente(Cliente clienteActual, Cliente clienteNuevo){
        int index = clientes.indexOf(clienteActual);
        if(index != -1){
            clientes.set(index, clienteNuevo);
        }
    }

    public ArrayList<Cliente> obtenerClientes() {
        return clientes;
    }
    
    public void realizarReservacion(Reservacion reservacion){
        reservaciones.add(reservacion);
    }
    
    public void cancelarReservacion(Reservacion reservacion){
        reservaciones.remove(reservacion);
    }
    
    public void actualizarReservacion(Reservacion reservacionActual, Reservacion reservacionNueva){
        int index = reservaciones.indexOf(reservacionActual);
        if(index != -1){
            reservaciones.set(index, reservacionNueva);
        }
    }

    public ArrayList<Reservacion> obtenerReservaciones() {
        return reservaciones;
    }
    
    public void realizarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public void cancelarPedido(Pedido pedido) {
        pedidos.remove(pedido);
    }

    public void actualizarPedido(Pedido pedidoActual, Pedido pedidoNuevo) {
        int index = pedidos.indexOf(pedidoActual);
        if (index != -1) {
            pedidos.set(index, pedidoNuevo);
        }
    }

    public ArrayList<Pedido> obtenerPedidos() {
        return pedidos;
    }
}
    
    
    
    
   
