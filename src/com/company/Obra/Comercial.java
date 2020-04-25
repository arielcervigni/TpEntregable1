package com.company.Obra;

import com.company.Empleado.Empleado;

import java.util.ArrayList;

public class Comercial extends Obra {

    protected String nombre;

    public Comercial ()
    {
        super();
        this.nombre = null;
    }
    public Comercial (String direccion, double cantidadMts, int cantidadDias, double costoPorMt, ArrayList<Empleado> arregloDeEmpleados, double precioTotal, String nombre)
    {
        super(direccion, cantidadMts, cantidadDias, costoPorMt, arregloDeEmpleados, precioTotal);
        this.nombre = nombre;
    }

    public String getNombre () { return this.nombre; }
    public void setNombre (String nombre) { this.nombre = nombre; }

    public String toString ()
    {
        return super.toString() + "\n Nombre de la Obra: " + this.nombre;
    }




}
