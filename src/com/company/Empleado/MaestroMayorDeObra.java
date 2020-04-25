package com.company.Empleado;

public class MaestroMayorDeObra extends Empleado implements Trabajo {

    private int edad;

    public MaestroMayorDeObra ()
    {
        super();
        this.edad = 0;
    }
    public MaestroMayorDeObra (String nombre, int DNI, Float tel, int edad)
    {
        super(nombre,DNI,tel,1800);
        this.edad = edad;
    }

    public int getEdad () { return this.edad; }
    public void setEdad (int edad) { this.edad = edad; }

    public String toString ()
    {
        return super.toString() + " Edad: " + this.edad;
    }

    public String construir ()
    {
        return "Soy maestro mayor de obra y superviso las construcciones";
    }
}
