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
public class costoEnvio {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el peso del paquete: ");
        double peso = Double.parseDouble(input.nextLine());

        System.out.println("Ingrese la zona de envío (Nacional o Internacional) : ");
        String zona = input.nextLine();

        System.out.println("Ingrese el precio del producto: ");
        double precio = Double.parseDouble(input.nextLine());

        double costo = calcularCostoEnvio(peso, zona);
        double totalCompra = calcularTotalCompra(precio, costo);
        

        System.out.println("El costto de envio es de: $" + costo);
        System.out.println("El total a pagar es : $" + totalCompra);

    } // cierre del main

    public static double calcularCostoEnvio(double peso, String zona) {
        double costo = 0;

        if (zona.equalsIgnoreCase("Nacional")) {
            costo = peso * 5;
        } else if (zona.equalsIgnoreCase("Internacional")) {
            costo = peso * 10;
        }

        return costo;

    }

    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }
}
