/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo.práctico.pkg1;

import java.util.Scanner;

/**
 *
 * @author vcalcerano
 */
public class division {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1,num2;
        double div;
        
        System.out.print("Ingrese un número entero: ");
        num1 = Integer.parseInt(input.nextLine());
        
        System.out.print("Ingrese otro númer entero: ");
        num2 = Integer.parseInt(input.nextLine());
        
        div = (double) num1 / num2; 
              
        System.out.println(num1 + " / " + num2 + " = " + div);
        
        
        
        
    }
    
}
