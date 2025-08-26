package trabajo.practico.pkg2;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vcalcerano
 */
public class ClasificacionEdad {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese su edad: ");
        int edad = Integer.parseInt(input.nextLine());
        if (edad < 12){
            System.out.println("Eres un Niño");
        }else if (edad >= 12 && edad < 18){
        System.out.println("Eres un Adolescente");
        } else if (edad >= 18 && edad < 60){
            System.out.println("Eres un Adulto");
        }else {
            System.out.println("Eres un Adulto Mayor");
        }
        
        
    }
    
}
