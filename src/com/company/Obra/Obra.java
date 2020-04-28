package com.company.Obra;

import com.company.Empleado.Arquitecto;
import com.company.Empleado.Empleado;
import com.company.Empleado.MaestroMayorDeObra;

import java.util.ArrayList;

public class Obra {

    protected String direccion;
    protected double cantidadMts;
    protected int cantidadDias;
    protected double costoPorMt;
    protected ArrayList<Empleado> arregloDeEmpleados;
    protected double precioTotal;

    public Obra() {
        this.direccion = null;
        this.cantidadMts = 0;
        this.cantidadDias = 0;
        this.costoPorMt = 0;
        this.arregloDeEmpleados = null;
        this.precioTotal = 0;
    }

    public Obra(String direccion, double cantidadMts, int cantidadDias, double costoPorMt, ArrayList<Empleado> arregloDeEmpleados, double precioTotal) {
        this.direccion = direccion;
        this.cantidadMts = cantidadMts;
        this.cantidadDias = cantidadDias;
        this.costoPorMt = costoPorMt;
        this.arregloDeEmpleados = arregloDeEmpleados;
        this.precioTotal = precioTotal;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public double getCantidadMts() {
        return this.cantidadMts;
    }

    public int getCantidadDias() {
        return this.cantidadDias;
    }

    public double getCostoPorMt() {
        return this.costoPorMt;
    }

    public ArrayList<Empleado> getArregloDeEmpleados() {
        return this.arregloDeEmpleados;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setCantidadMts(double mts) {
        this.cantidadMts = mts;
    }

    public void setCantidadDias(int dias) {
        this.cantidadDias = dias;
    }

    public void setCostoPorMt(double costoPorMt) {
        this.costoPorMt = costoPorMt;
    }

    public void setArregloDeEmpleados(ArrayList<Empleado> arreglo) {
        this.arregloDeEmpleados = arreglo;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    @Override
    public String toString() {
        return "\n Direccion: " + this.direccion + " Cantidad Metros Cuadrados: " + this.cantidadMts +
                " Cantidad de Días: " + this.cantidadDias + " Costo Por Metro Cuadrado: " + this.costoPorMt +
                " Precio Total: " + this.precioTotal + "\nEmpleados: " + arregloDeEmpleados.toString();
    }

    public double calcularCostoDeEmpleados() {
        int i;
        double suma = 0;
        if (!arregloDeEmpleados.isEmpty()) {
            for (i = 0; i < arregloDeEmpleados.size(); i++) {
                suma += arregloDeEmpleados.get(i).getCosto();
            }
        }
        return suma;
    }

    public double calcularPrecioTotal() {
        double costoDeEmpleados = calcularCostoDeEmpleados();

        if (cantidadMts > 0 && costoDeEmpleados >0)
            return (costoPorMt * cantidadMts) + (costoDeEmpleados * cantidadDias);
        else
            return 0;
    }

    public StringBuilder verificarEmpleados() {
        StringBuilder rta = new StringBuilder();
        if (!arregloDeEmpleados.isEmpty()) {
            int contadorArquitectos = 0;
            int contadorMaestros = 0;
            int contadorObrero = 0;
            int i;

            for (i = 0; i < arregloDeEmpleados.size(); i++) {
                if (arregloDeEmpleados.get(i) instanceof Arquitecto)
                    contadorArquitectos++;
                else {
                    if (arregloDeEmpleados.get(i) instanceof MaestroMayorDeObra)
                        contadorMaestros++;
                    else
                        contadorObrero++;
                }
            }

            if (contadorArquitectos == 1 && (contadorMaestros >0 && contadorMaestros<3) && contadorObrero >= 2)
                rta.append("Empleados cargados con éxito");
            else {
                if (contadorArquitectos == 0) {
                    rta.append("No se cargaron los empleados. No hay arquitecto asignado a la obra.");
                    arregloDeEmpleados.clear();
                } else if (contadorArquitectos > 1) {
                    rta.append("No se cargaron los empleados. No puede haber más de un arquitecto en una obra.");
                    arregloDeEmpleados.clear();
                }

                if (contadorMaestros == 0) {
                    rta.append("No se cargaron los empleados. No hay un maestro mayor de obra asignado a la obra.");
                    arregloDeEmpleados.clear();
                } else if (contadorMaestros > 3) {
                    rta.append("No se cargaron los empleados. No puede haber más de tres maestros mayor de obra en una obra. ");
                    arregloDeEmpleados.clear();
                }
                if (contadorObrero < 2) {
                    rta.append("No se cargaron los empleados. No puede haber menos de dos obreros en una obra.");
                    arregloDeEmpleados.clear();
                }
            }
        }
        return rta;
    }
}
