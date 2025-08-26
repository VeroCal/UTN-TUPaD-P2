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
public class actualizacionStock {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese stock actual del producto: ");
        int stockActual = Integer.parseInt(input.nextLine());
        System.out.println("Ingrese la cantidad vendida del producto: ");
        int cantidadVendida= Integer.parseInt(input.nextLine());
        System.out.println("Ingrese la cantidad recibida: ");
        int cantidadRecibida = Integer.parseInt(input.nextLine());
        
        int NuevoStock = actualizarStock(stockActual,cantidadVendida , cantidadRecibida);
        
        System.out.println("El nuevo stock del prodcuto es: " + NuevoStock);
        
               
    } // Cirre del main
    
    public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
     
        return stockActual - cantidadVendida + cantidadRecibida;
        
    }
    
}
