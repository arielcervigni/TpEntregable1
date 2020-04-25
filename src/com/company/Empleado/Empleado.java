package com.company.Empleado;

import com.company.Obra.Obra;

import javax.xml.stream.events.StartElement;

public class Empleado {

    protected String nombre;
    protected int DNI;
    protected Float telefono;
    protected double costo;

    public Empleado (){
        this.nombre = null;
        this.DNI = 0;
        this.telefono = 0f;
        this.costo = 0;
    }

    public Empleado (String nombre, int DNI, Float tel, double costo)
    {
        this.nombre = nombre;
        this.DNI = DNI;
        this.telefono = tel;
        this.costo = costo;
    }

    public String getNombre () { return this.nombre; }
    public int getDNI () { return this.DNI; }
    public Float getTelefono () { return this.telefono; }
    public double getCosto () { return this.costo; }

    public void setNombre (String nombre) { this.nombre = nombre; }
    public void setDNI (int dni) { this.DNI = dni; }
    public void setTelefono (Float tel) { this.telefono = tel; }
    public void setCosto (double costo) { this.costo = costo; }

    public String toString () {
        return "\nNombre: " + this.nombre + " DNI: " + this.DNI +
                " Tel: " + this.telefono + " Costo: " + this.costo;
    }

}
