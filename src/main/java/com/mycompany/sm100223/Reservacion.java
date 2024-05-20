/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sm100223;

import java.time.LocalDateTime;

/**
 *
 * @author Wilmer Salazar
 */

/**
 * La clase Reservacion representa una reservación con fecha, número de personas y cliente asociado.
 */

public class Reservacion {
    private LocalDateTime fecha;
    private int numerPersonas;
    private Cliente cliente;

    /**
     * Crea una nueva instancia de Reservacion con los datos especificados.
     *
     * @param fecha          la fecha de la reservación
     * @param numerPersonas  el número de personas para la reservación
     * @param cliente        el cliente asociado a la reservación
     */
    public Reservacion(LocalDateTime fecha, int numerPersonas, Cliente cliente) {
        this.fecha = fecha;
        this.numerPersonas = numerPersonas;
        this.cliente = cliente;
    }

    /**
     * Obtiene el cliente asociado a la reservación.
     *
     * @return el cliente de la reservación
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * Obtiene la fecha de la reservación.
     *
     * @return la fecha de la reservación
     */
    public LocalDateTime getFecha() {
        return fecha;
    }

    /**
     * Obtiene el número de personas de la reservación.
     *
     * @return el número de personas de la reservación
     */
    public int getNumerPersonas() {
        return numerPersonas;
    }

    /**
     * Establece el cliente asociado a la reservación.
     *
     * @param cliente el nuevo cliente de la reservación
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * Establece la fecha de la reservación.
     *
     * @param fecha la nueva fecha de la reservación
     */
    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    /**
     * Establece el número de personas de la reservación.
     *
     * @param numerPersonas el nuevo número de personas de la reservación
     */
    public void setNumerPersonas(int numerPersonas) {
        this.numerPersonas = numerPersonas;
    }
}
