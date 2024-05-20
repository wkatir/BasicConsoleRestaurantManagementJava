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
 * La clase Platillo representa un platillo con nombre y precio.
 */

public class Platillo {
    private String nombre;
    private double precio;

    /**
     * Crea una nueva instancia de Platillo con los datos especificados.
     *
     * @param nombre el nombre del platillo
     * @param precio el precio del platillo
     */
    public Platillo(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    /**
     * Obtiene el nombre del platillo.
     *
     * @return el nombre del platillo
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene el precio del platillo.
     *
     * @return el precio del platillo
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Establece el nombre del platillo.
     *
     * @param nombre el nuevo nombre del platillo
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Establece el precio del platillo.
     *
     * @param precio el nuevo precio del platillo
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
