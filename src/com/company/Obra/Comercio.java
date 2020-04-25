package com.company.Obra;

import com.company.Empleado.Empleado;

import java.util.ArrayList;

public class Comercio extends Comercial {

    private String rubro;

    public Comercio ()
    {
        this.rubro = null;
    }
    public Comercio (String direccion, double cantidadMts, int cantidadDias, double costoPorMt, ArrayList<Empleado> arregloDeEmpleados, double precioTotal, String nombre, String rubro)
    {
        super(direccion,cantidadMts,cantidadDias, costoPorMt, arregloDeEmpleados, precioTotal, nombre);
        this.rubro = rubro;
    }

    public String getRubro () { return this.rubro; }
    public void setRubro (String rubro) { this.rubro = rubro; }

    public String toString ()
    {
        return super.toString() + "\nRubro: " + rubro;
    }
}
