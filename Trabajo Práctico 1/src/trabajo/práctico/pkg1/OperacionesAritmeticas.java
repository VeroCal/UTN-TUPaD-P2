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
public class OperacionesAritmeticas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2;
        
        System.out.print("Ingrese un número entero: ");
        num1 = input.nextInt();
        
        System.out.print("Por favor, ingrese otro número entero: ");
        num2 = input.nextInt();
        
        System.out.println(num1 + " + " + num2 + " = " +(num1+num2));
        System.out.println(num1 + " - " + num2 + " = " +(num1-num2));
        System.out.println(num1 + " x " + num2 + " = " +(num1*num2));
        System.out.println(num1 + " / " + num2 + " = " +(num1/num2));
        
        
    }
    
}
