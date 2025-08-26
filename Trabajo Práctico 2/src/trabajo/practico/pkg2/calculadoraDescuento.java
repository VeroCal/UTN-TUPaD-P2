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
public class calculadoraDescuento {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el precio del producto: ");
        double precio = Double.parseDouble(input.nextLine());
        System.out.print("Ingrese la categoría del producto: ");
        String categoria = input.nextLine().toUpperCase(); // Convertimos a mayúscula
        
 double porcentajeDescuento = 0; // Siempre se debe declarar antes de switch
      
     
 switch (categoria) {
            case "A":
                porcentajeDescuento = 10;
                break;
            case "B":
                porcentajeDescuento = 15;
                break;
            case "C":
                porcentajeDescuento = 20;
                break;}
 
 double descuento = precio*(porcentajeDescuento/ 100);
 double precioFinal = precio - descuento;

 System.out.println("El precio final del producto es: "+ precioFinal);
                
         
        
        
        
        
        
    }
    
}
