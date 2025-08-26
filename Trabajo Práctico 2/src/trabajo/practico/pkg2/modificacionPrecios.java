/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo.practico.pkg2;

/**
 *
 * @author vcalcerano
 */
public class modificacionPrecios {
    public static void main(String[] args) {
        double[] precios = {199.99, 205.55, 305.29, 204.57, 529.10, 458.50};
        System.out.println("Precios originales:");
        for (int i = 0; i < precios.length; i++) {
            double valor = precios[i];
            System.out.println(valor);
            
        }
            
        precios[4] = 578.29; // llamada al elemento, recordar que empieza en 0.
        
        System.out.println("Precios actualizados:");
        
         for (int i = 0; i < precios.length; i++) {
            double valor = precios[i];
            System.out.println(valor);
         
         }
        
        
    }
    
}
