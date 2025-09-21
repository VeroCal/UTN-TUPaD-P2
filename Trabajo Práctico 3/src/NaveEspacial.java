/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vcalcerano
 */
public class NaveEspacial {
    
    String nombre;
    int combustible;
    int cantidad;
    

    public void despegar(int combustible){
    if(combustible < 150){
    System.out.println("El combustible no es suficiente");}
    //int recargarCombustible = 150 - combustible;
    //System.out.println("Debe recargar: " + recargarCombustible + " unidades");
        else{
            System.out.println("Lito para el despegue!");
            }
    }   
    
    //public void avanzar(distancia){}
    
    public void recargarCombustible(int cantidad) {
          
       int recargarCombustible = combustible + cantidad;
       if(recargarCombustible < 150 && recargarCombustible > 110){
    System.out.println("El máximo a recargar es 150 unidades");}
    //int recargarCombustible = 150 - combustible;
    //System.out.println("Debe recargar: " + recargarCombustible + " unidades");
        else{
            System.out.println("Lito para el despegue!");
            }
    }   
    
    
    }
    
    

            
     
    
    
    
    
    
