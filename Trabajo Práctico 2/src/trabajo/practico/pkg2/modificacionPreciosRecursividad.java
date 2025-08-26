/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo.practico.pkg2;

/**
 *
 * @author vcalcerano
 */
public class modificacionPreciosRecursividad {

    public static void main(String[] args) {

        double[] precios = {199.99, 205.55, 305.29, 204.57, 529.10, 458.50};
        System.out.println("Precios originales:");
        mostrarArrayRecursivo(precios, 0);

        precios[4] = 578.29;

        System.out.println("Precios Actualizados");
        mostrarArrayRecursivo(precios, 0);

    }

    public static void mostrarArrayRecursivo(double[] array, int indice) {

        if (indice < array.length) {
            System.out.println("Precio: $" + array[indice]);
            mostrarArrayRecursivo(array, indice + 1);
        }

    }
}
