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
public class NumeroMayorDe3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese un primer número entero: ");
        int num1 = Integer.parseInt(input.nextLine());

        System.out.println("Ingrese un segundo número entero: ");
        int num2 = Integer.parseInt(input.nextLine());

        System.out.println("Ingrese un tercer número entero: ");
        int num3 = Integer.parseInt(input.nextLine());

        int mayor = num1; // Asumimos que num1 es el mayor

        if (num2 > mayor){
            mayor = num2;         
        }
        if (num3 > mayor){
            mayor = num3;
        }            

        System.out.println("De los números ingresados, el mayor es el " + mayor);

            }
}
             