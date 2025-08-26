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
public class contadorNumeros {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int positivos = 0;
        int negativos = 0;
        int ceros = 0;
        int num;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Ingresa el número " + i + ":");
            num = Integer.parseInt(input.nextLine());

            if (num < 0) {
                negativos++;
            } else if (num > 0) {
                positivos++;
            } else {
                ceros++;
            }
        }

        System.out.println("Positivos: " + positivos);     
        System.out.println("Negativos: " + negativos);
        System.out.println("Ceros: " + ceros);
    }
}
        
        
                
                
   