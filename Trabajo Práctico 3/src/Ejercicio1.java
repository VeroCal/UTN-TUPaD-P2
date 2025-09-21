/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vcalcerano
 */
public class Ejercicio1 {
    
    public static void main(String[] args) {
        
        Estudiante alumno = new Estudiante();
        
        alumno.nombre = "Juan";
        alumno.apellido = "Perez";
        alumno.curso = "Programación 2";
        alumno.calificacion = 7.5;
        
        alumno.monstrarInfo();
        
        alumno.subirCalificacion(10);
        
        alumno.bajarCalificacion(2);
        
        alumno.monstrarInfo();
    }
    
    








}