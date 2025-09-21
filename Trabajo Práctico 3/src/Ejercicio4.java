/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vcalcerano
 */
public class Ejercicio4 {
    public static void main(String[] args) {
       var animalUno = new Gallina(2,2,28);
        animalUno.mostrarEstado();
       
        
        var animalDos = new Gallina(4,1,13);
        animalDos.mostrarEstado();
        
         for (int i = 0; i <= 3 ; i++) {
             animalUno.envejecer();
             animalDos.envejecer();
             animalUno.ponerHuevo();
             animalDos.ponerHuevo();
             animalUno.mostrarEstado();
             animalDos.mostrarEstado();
         }
       
    
       
}
}
