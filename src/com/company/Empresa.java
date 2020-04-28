package com.company;

import com.company.Empleado.Arquitecto;
import com.company.Empleado.MaestroMayorDeObra;
import com.company.Obra.Obra;
import com.company.Empleado.Empleado;

import javax.swing.*;
import java.util.ArrayList;

public class Empresa {

    private String nombreEmpresa;
    protected ArrayList<Obra> arregloDeObras;
    protected ArrayList<Empleado> arregloDeempleado;

    public Empresa() {
        this.nombreEmpresa = null;
        this.arregloDeObras = null;
        this.arregloDeempleado = null;
    }

    public Empresa(String nombre, ArrayList<Obra> arreglo, ArrayList<Empleado> arregloEmpleado) {
        this.nombreEmpresa = nombre;
        this.arregloDeObras = arreglo;
        this.arregloDeempleado = arregloEmpleado;
    }

    public String getNombreEmpresa() {
        return this.nombreEmpresa;
    }

    public ArrayList<Obra> getArregloDeObras() {
        return this.arregloDeObras;
    }

    public ArrayList<Empleado> getArregloDeempleado() {
        return this.arregloDeempleado;
    }

    public void setNombreEmpresa(String nombre) {
        this.nombreEmpresa = nombre;
    }

    public void setArregloDeObras(ArrayList<Obra> arreglo) {
        this.arregloDeObras = arreglo;
    }

    public void setArregloDeempleado(ArrayList<Empleado> arregloEmpleado) {
        this.arregloDeempleado = arregloEmpleado;
    }

    public String toString() {
        return "\nNombre Empresa: " + nombreEmpresa + "\n Obras: " + arregloDeObras.toString();
    }

    /// Ejercicio E
    // Crear un método para recorrer los empleados que trabajan en una obra.
    // Mostrando por pantalla los distintos datos particulares de cada empleado.
    public ArrayList<Empleado> empleadoDeUnaObra(String direccion) {
        ArrayList<Empleado> empleadosDeLaObra = new ArrayList<>();
        int i;
        for (i = 0; i < arregloDeObras.size(); i++) {
            if (arregloDeObras.get(i).getDireccion() == direccion) {
                empleadosDeLaObra = arregloDeObras.get(i).getArregloDeEmpleados();
            }
        }
        return empleadosDeLaObra;
    }

    /// Ejercicio F
    public StringBuilder mostrarObrasYMonto() {
        int i;
        StringBuilder obras = new StringBuilder();
        for (i = 0; i < arregloDeObras.size(); i++) {
            obras.append("Direccion: " + arregloDeObras.get(i).getDireccion() +
                    " Precio Total: " + getArregloDeObras().get(i).getPrecioTotal() + "\n");
        }
        return obras;
    }

}

