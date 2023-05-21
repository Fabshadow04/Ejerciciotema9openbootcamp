/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciotema9openbootcamp;

/**
 *
 * @author Fabshadow0404
 */
public class Ejerciciotema9openbootcamp {

   public static void main(String[] args) {
        // Crear objeto Cliente
        Cliente cliente = new Cliente(30, "Juan", "123456789", 5000.0f);

        // Mostrar propiedades del Cliente
        System.out.println("Cliente:");
        System.out.println("Edad: " + cliente.getEdad());
        System.out.println("Nombre: " + cliente.getNombre());
        System.out.println("Teléfono: " + cliente.getTelefono());
        System.out.println("Crédito: " + cliente.getCredito());

        System.out.println();

        // Crear objeto Trabajador
        Trabajador trabajador = new Trabajador(35, "María", "987654321", 3500.0f);

        // Mostrar propiedades del Trabajador
        System.out.println("Trabajador:");
        System.out.println("Edad: " + trabajador.getEdad());
        System.out.println("Nombre: " + trabajador.getNombre());
        System.out.println("Teléfono: " + trabajador.getTelefono());
        System.out.println("Salario: " + trabajador.getSalario());
    }
}


class Persona { //asignando valores a la clase y creando clase 
    private int edad;
    private String nombre;
    private String telefono;

    public Persona(int edad, String nombre, String telefono) { //constructor de la clase 
        this.edad = edad;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }
}

class Cliente extends Persona { //heredando de la clase persona a la clase cliente
    private float credito;

    public Cliente(int edad, String nombre, String telefono, float credito) {
        super(edad, nombre, telefono);
        this.credito = credito;
    }

    public float getCredito() {
        return credito;
    }
}

class Trabajador extends Persona { //heredando de la clase persona a la clase trabajador
    private float salario;

    public Trabajador(int edad, String nombre, String telefono, float salario) {
        super(edad, nombre, telefono); //pasar los parametros de la clase heredada 
        this.salario = salario;
    }

    public float getSalario() { //obtener el valor del salario  de un objeto "Trabajador"
        return salario;
    }
}
