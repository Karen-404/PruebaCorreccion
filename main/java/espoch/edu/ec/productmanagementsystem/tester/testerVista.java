/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package espoch.edu.ec.productmanagementsystem.tester;
/**
 *
 * @author Claudia
 */
public class testerVista {
    
    public VistaProducto vista;

    public testerVista(VistaProducto vista) {
        this.vista = vista;
    }

   

    public void prueba() {

        try {
            System.out.println("Titulo: " + vista.getProducto());
            System.out.println("Descripcion: " + vista.getPrecio());
            System.out.println("Estado: " + vista.getDisponible());

        } catch (NumberFormatException e) {
            
        }
    }  
}
