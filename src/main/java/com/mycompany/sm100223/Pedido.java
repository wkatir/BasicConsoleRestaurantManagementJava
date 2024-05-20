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
 * La clase Pedido representa un pedido realizado por un cliente,
 * que incluye una lista de platillos y una lista de bebidas.
 */
public class Pedido {
    private ArrayList<Platillo> platillos;
    private ArrayList<Bebida> bebidas;
    private Cliente cliente;

    /**
 * Crea un nuevo objeto Pedido asociado a un cliente, sin ningún platillo ni bebida.
 * @param cliente El cliente asociado al pedido.
 */
public Pedido(Cliente cliente) {
    this.cliente = cliente;
    this.platillos = new ArrayList<>();
    this.bebidas = new ArrayList<>();
}

    /**
     * Agrega un platillo a la lista de platillos del pedido.
     *
     * @param platillo el platillo a agregar
     */
    public void agregarPlatillo(Platillo platillo) {
        platillos.add(platillo);
    }

    /**
     * Agrega una bebida a la lista de bebidas del pedido.
     *
     * @param bebida la bebida a agregar
     */
    public void agregarBebida(Bebida bebida) {
        bebidas.add(bebida);
    }

    /**
     * Obtiene la lista de bebidas del pedido.
     *
     * @return la lista de bebidas
     */
    public ArrayList<Bebida> getBebidas() {
        return bebidas;
    }

    /**
     * Obtiene el cliente que realizó el pedido.
     *
     * @return el cliente del pedido
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * Obtiene la lista de platillos del pedido.
     *
     * @return la lista de platillos
     */
    public ArrayList<Platillo> getPlatillos() {
        return platillos;
    }

    /**
     * Establece la lista de bebidas del pedido.
     *
     * @param bebidas la nueva lista de bebidas
     */
    public void setBebidas(ArrayList<Bebida> bebidas) {
        this.bebidas = bebidas;
    }

    /**
     * Establece el cliente que realizó el pedido.
     *
     * @param cliente el nuevo cliente del pedido
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * Establece la lista de platillos del pedido.
     *
     * @param platillos la nueva lista de platillos
     */
    public void setPlatillos(ArrayList<Platillo> platillos) {
        this.platillos = platillos;
    }
}
