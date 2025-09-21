/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vcalcerano
 */
public class Gallina {
    
    int idGallina;
    int edad;
    int huevosPuestos;
    
    // Contructor (aproveché el ejercicio para ir practicandolo)
public Gallina(int idGallina, int edad, int huevosPuestos){
    this.idGallina = idGallina;
    this.edad = edad;
    this.huevosPuestos = huevosPuestos;
    
    
}    

public void mostrarEstado(){
    System.out.println("ID Gallina: " + idGallina + "  //  Edad: " + edad + "  //  Huevos Puestos: " + huevosPuestos);
    
}

public void envejecer(){
edad += 2;

}

public void ponerHuevo(){
huevosPuestos +=2;    


}
        
        
        
        

}
