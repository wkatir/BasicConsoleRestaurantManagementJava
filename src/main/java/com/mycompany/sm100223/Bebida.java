/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sm100223;

/**
 *
 * @author Wilmer Salazar
 */

/**
 * La clase Bebida representa una bebida con nombre y precio.
 */

public class Bebida {
    private String nombre;
    private double precio;

    /**
     * Crea una nueva instancia de Bebida con los datos especificados.
     *
     * @param nombre el nombre de la bebida
     * @param precio el precio de la bebida
     */
    public Bebida(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    /**
     * Obtiene el nombre de la bebida.
     *
     * @return el nombre de la bebida
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene el precio de la bebida.
     *
     * @return el precio de la bebida
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Establece el nombre de la bebida.
     *
     * @param nombre el nuevo nombre de la bebida
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Establece el precio de la bebida.
     *
     * @param precio el nuevo precio de la bebida
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
      @Override
    public String toString() {
        return "Bebida{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
    
}

