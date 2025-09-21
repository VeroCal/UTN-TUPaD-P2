/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vcalcerano
 */
public class Ejercicio3 {
     public static void main(String[] args) {
        Libro nuevoLibro = new Libro();

        nuevoLibro.setAñoPublicacion(2025);  // 
        System.out.println("Año de publicación " + nuevoLibro.getAñoPublicacion());
        
        nuevoLibro.setAñoPublicacion(2000);
        System.out.println("Año de publicación " + nuevoLibro.getAñoPublicacion());
    }
}
