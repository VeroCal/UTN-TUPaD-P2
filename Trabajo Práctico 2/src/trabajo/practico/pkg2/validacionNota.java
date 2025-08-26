/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo.practico.pkg2;

import java.util.Scanner;

/**
 *
 * @author vcalcerano
 */
public class validacionNota {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int nota;
        
        do {
        System.out.println("Ingrese una nota entre 0 y 10: ");
        nota = Integer.parseInt(input.nextLine());
         if (nota < 0 || nota > 10) {
                System.out.println("Error: Nota inválida.");
         }
        
        }while (nota >= 0 || nota <= 10);  
            System.out.println("Nota guardada correctamente.");
               
       
       
        
                
       
        
        
        
        
        
        
    }
    
}
