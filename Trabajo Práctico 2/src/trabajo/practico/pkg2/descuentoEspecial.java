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

public class descuentoEspecial{

  static double DESCUENTO_ESPECIAL = 0.10;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el monto del producto: ");
        double monto = Double.parseDouble(input.nextLine());


calcularDescuentoEspecial(monto);
 
    
}
    
  

        public static void calcularDescuentoEspecial(double precio) {
        double descuentoAplicado = precio * DESCUENTO_ESPECIAL; // uso de la global
        double precioFinal = precio - descuentoAplicado;
        System.out.println("El descuento aplicado es de : $" + descuentoAplicado);
        System.out.println("Precio final con descuento: $" + precioFinal);
    
        
    }
}   


