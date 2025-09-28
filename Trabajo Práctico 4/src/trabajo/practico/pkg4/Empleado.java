/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo.practico.pkg4;

/**
 *
 * @author vcalcerano
 */
public class Empleado {

    private int id;
    private String nombre;
    private String puesto;
    private double salario;

    //metodo static
    private static int totalEmpleados = 0;

    //constructor
    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;
    }

    public Empleado(String nombre, String puesto) {
        this.nombre = nombre;
        this.puesto = puesto;
        totalEmpleados++;
        this.id = totalEmpleados;
        this.salario = 785256.90;

    }

    // metodos
    public void actualizarSalario(double monto) {
        salario = salario + monto;

    }

    public void actualizarSalario(int porcentaje) {
        salario += (salario * porcentaje) / 100;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public static int getTotalEmpleados() {
        return totalEmpleados;
    }

    public static void setTotalEmpleados(int totalEmpleados) {
        Empleado.totalEmpleados = totalEmpleados;
    }

    // toString
    @Override
    public String toString() {

        return "Id: " + id + ", nombre: " + nombre + ", puesto: " + puesto + ", salario: $" + salario + ".";

    }

}
