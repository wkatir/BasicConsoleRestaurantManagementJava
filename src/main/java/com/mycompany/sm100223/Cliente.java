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
 * La clase Cliente representa a un cliente con nombre, teléfono y correo electrónico.
 */

public class Cliente {
    private String nombre;
    private String telefono;
    private String correoElectronico;

    /**
     * Crea una nueva instancia de Cliente con los datos especificados.
     *
     * @param nombre            el nombre del cliente
     * @param telefono          el número de teléfono del cliente
     * @param correoElectronico el correo electrónico del cliente
     */
    public Cliente(String nombre, String telefono, String correoElectronico) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
    }

    /**
     * Obtiene el correo electrónico del cliente.
     *
     * @return el correo electrónico del cliente
     */
    public String getCorreoElectronico() {
        return correoElectronico;
    }

    /**
     * Obtiene el nombre del cliente.
     *
     * @return el nombre del cliente
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene el número de teléfono del cliente.
     *
     * @return el número de teléfono del cliente
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Establece el correo electrónico del cliente.
     *
     * @param correoElectronico el nuevo correo electrónico del cliente
     */
    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    /**
     * Establece el nombre del cliente.
     *
     * @param nombre el nuevo nombre del cliente
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Establece el número de teléfono del cliente.
     *
     * @param telefono el nuevo número de teléfono del cliente
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
