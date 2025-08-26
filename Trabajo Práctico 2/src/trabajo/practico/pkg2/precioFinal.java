/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo.practico.pkg2;

import java.util.Scanner;

public class precioFinal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el precio base del producto: ");
        double precio_base = Double.parseDouble(input.nextLine());

        System.out.print("Ingrese el impuesto en porcentaje: ");
        double impuesto = Double.parseDouble(input.nextLine()) / 100; // lo pasamos a decimal

        System.out.print("Ingrese el porcentaje de descuento: ");
        double descuento = Double.parseDouble(input.nextLine()) / 100; // lo pasamos a decimal

        double precioFinal = calcularPrecioFinal(precio_base, impuesto, descuento);

        System.out.println("El monto final del producto es: $" + precioFinal);
    }

    // Método que aplica la fórmula: PrecioFinal = PrecioBase + (PrecioBase×Impuesto) − (PrecioBase×Descuento)
    public static double calcularPrecioFinal(double precio_base, double impuesto, double descuento) {
        return precio_base + (precio_base * impuesto) - (precio_base * descuento);


    }
}
