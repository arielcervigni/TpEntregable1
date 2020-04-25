package com.company.Empleado;

public class Obrero extends Empleado implements Trabajo {

    private int edad;

    public Obrero ()
    {
        super();
        this.edad = 0;
    }
    public Obrero (String nombre, int DNI, Float tel, int edad)
    {
        super(nombre,DNI,tel,1500);
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
        return "Soy un obrero y construyo";
    }
}
