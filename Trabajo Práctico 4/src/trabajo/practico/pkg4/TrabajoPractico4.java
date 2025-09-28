/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajo.practico.pkg4;

/**
 *
 * @author vcalcerano
 */
public class TrabajoPractico4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Empleado empleado = new Empleado(23, "Ariel", "jornalero", 659245.52);
        Empleado empleado2 = new Empleado(48, "Gimena", "jornalera", 659245.52);
        Empleado empleado3 = new Empleado("Kiara", "despachante");

        System.out.println(empleado);
        System.out.println(empleado2);
        System.out.println(empleado3);

        System.out.println("La cantidad total de empleados es de " + Empleado.getTotalEmpleados() + ".");
    }

}
