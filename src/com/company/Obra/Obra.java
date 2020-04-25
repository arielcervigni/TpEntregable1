package com.company.Obra;

import com.company.Empleado.Empleado;

import java.util.ArrayList;

public class Obra {

    protected String direccion;
    protected double cantidadMts;
    protected int cantidadDias;
    protected double costoPorMt;
    protected ArrayList <Empleado> arregloDeEmpleados;
    protected double precioTotal;

    public Obra ()
    {
        this.direccion = null;
        this.cantidadMts = 0;
        this.cantidadDias = 0;
        this.costoPorMt = 0;
        this.arregloDeEmpleados = null;
        this.precioTotal = 0;
    }
    public Obra (String direccion, double cantidadMts, int cantidadDias, double costoPorMt, ArrayList <Empleado> arregloDeEmpleados, double precioTotal)
    {
        this.direccion = direccion;
        this.cantidadMts = cantidadMts;
        this.cantidadDias = cantidadDias;
        this.costoPorMt = costoPorMt;
        this.arregloDeEmpleados = arregloDeEmpleados;
        this.precioTotal = precioTotal;
    }

    public String getDireccion () { return this.direccion; }
    public double getCantidadMts () { return this.cantidadMts; }
    public int getCantidadDias () { return this.cantidadDias; }
    public double getCostoPorMt () { return this.costoPorMt; }
    public ArrayList <Empleado> getArregloDeEmpleados () { return this.arregloDeEmpleados; }
    public double getPrecioTotal () { return precioTotal; }

    public void setDireccion (String direccion) { this.direccion = direccion; }
    public void setCantidadMts (double mts) { this.cantidadMts = mts; }
    public void setCantidadDias (int dias) { this.cantidadDias = dias; }
    public void setCostoPorMt (double costoPorMt)  { this.costoPorMt = costoPorMt; }
    public void setArregloDeEmpleados (ArrayList <Empleado> arreglo) { this.arregloDeEmpleados = arreglo; }
    public void setPrecioTotal (double precioTotal) { this.precioTotal = precioTotal; }

    @Override
    public String toString () {
        return "\n Direccion: " + this.direccion + " Cantidad Metros Cuadrados: " + this.cantidadMts +
                " Cantidad de Días: " + this.cantidadDias + " Costo Por Metro Cuadrado: " + this.costoPorMt +
                " Precio Total: " + this.precioTotal + "\nEmpleados: " + arregloDeEmpleados.toString();
    }

    public double calcularCostoDeEmpleados ()
    {
        int i;
        double suma = 0;
        for (i=0; i<arregloDeEmpleados.size(); i++)
        {
            suma+= arregloDeEmpleados.get(i).getCosto();
        }
        return suma;
    }

    public double calcularPrecioTotal () {
        double costoDeEmpleados = calcularCostoDeEmpleados();
        return (costoPorMt*cantidadMts)+(costoDeEmpleados*cantidadDias);
    }

}
