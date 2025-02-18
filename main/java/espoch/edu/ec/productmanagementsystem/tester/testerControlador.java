/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package espoch.edu.ec.productmanagementsystem.tester;

import espoch.edu.ec.productmanagementsystem.modelo.Productos;

/**
 *
 * @author Claudia
 */
public class testerControlador {
    public void prueba(Productos objProducto) {
        System.out.println("Titulo: " + objProducto.getProducto());
        System.out.println("Descripcion: " + objProducto.getPrecio());
        System.out.println("Estado: " + objProducto.getDisponible());
    }
}
