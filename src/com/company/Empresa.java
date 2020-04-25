package com.company;

import com.company.Obra.Obra;

import java.util.ArrayList;

public class Empresa {

    private String nombreEmpresa;
    protected ArrayList <Obra> arregloDeObras;

    public Empresa ()
    {
        this.nombreEmpresa = null ;
        this.arregloDeObras = null;
    }
    public Empresa (String nombre, ArrayList <Obra> arreglo)
    {
        this.nombreEmpresa = nombre;
        this.arregloDeObras = arreglo;
    }

    public String getNombreEmpresa () { return this.nombreEmpresa; }
    public ArrayList <Obra> getArregloDeObras () { return this.arregloDeObras; }

    public void setNombreEmpresa (String nombre) { this.nombreEmpresa = nombre; }
    public void setArregloDeObras (ArrayList <Obra> arreglo) { this.arregloDeObras = arreglo; }

    public String toString ()
    {
        return "\nNombre Empresa: " + nombreEmpresa + "\n Obras: " + arregloDeObras.toString();
    }
}
