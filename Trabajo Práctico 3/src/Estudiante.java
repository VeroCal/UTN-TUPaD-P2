/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vcalcerano
 */
public class Estudiante {
    String nombre;
    String apellido;
    String curso;
    Double calificacion;
    
public void monstrarInfo(){
    System.out.println("Nombre: " + nombre);
    System.out.println("Apellido: " + apellido);
    System.out.println("Curso: " + curso);
    System.out.println("Calificación: " + calificacion);
    
}

public void subirCalificacion(double puntos){
    calificacion += puntos;
   
    
}

public void bajarCalificacion(double puntos){
    calificacion -= puntos;
    

    
}   
}
