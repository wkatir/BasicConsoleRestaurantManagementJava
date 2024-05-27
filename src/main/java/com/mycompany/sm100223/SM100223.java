/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sm100223;

/**
 *
 * @author Wilmer Salazar - SM100223
 */
public class SM100223 {

    public static void main(String[] args) {
        Restaurante restaurante = new Restaurante();
        InterfazUsuario interfaz = new InterfazUsuario(restaurante);
        interfaz.mostrarMenuPrincipal();
    }
}
