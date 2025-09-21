/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vcalcerano
 */
public class Ejercicio2 {
    
    public static void main(String[] args) {
        Mascota perro = new Mascota();
        
        perro.nombre = "Cuqui";
        perro.edad = 10;
        perro.especie = "Caniche";
        
       for (int i = 0; i <= 4 ; i++) {
         perro.cumplirAnios(); 
         perro.mostrarInfo();    
    
}
    }
    
}
