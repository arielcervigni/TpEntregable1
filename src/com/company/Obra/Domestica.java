package com.company.Obra;

import com.company.Empleado.Empleado;
import com.company.Obra.Obra;

import java.util.ArrayList;

public class Domestica extends Obra {
    private int habitaciones;

    public Domestica ()
    {
        this.habitaciones = 0;
    }
    public Domestica (String direccion, double cantidadMts, int cantidadDias, double costoPorMt, ArrayList<Empleado> arregloDeEmpleados, double precioTotal, int habitaciones)
    {
        super (direccion, cantidadMts, cantidadDias, costoPorMt, arregloDeEmpleados, precioTotal);
        this.habitaciones = habitaciones;
    }

    public int getHabitaciones () { return this.habitaciones; }
    public void setHabitaciones (int habitaciones) { this.habitaciones = habitaciones; }

    public String toString ()
    {
        return super.toString() + "\nCantidad de Habitaciones: " + this.habitaciones;
    }
}
