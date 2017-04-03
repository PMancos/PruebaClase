/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaclasefile;

/**
 *
 * @author admin1
 */
public class empleado extends Persona{
    private double sueldo;

    public empleado(double sueldo, String dni, String nombre, int edad) {
        super(dni, nombre, edad);
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }

    @Override
    public String toString() {
        return super.toString()+"\nSueldo=" + sueldo;
    }
    
    
    
}
