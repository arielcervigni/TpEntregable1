package com.company.Empleado;

public class Arquitecto extends Empleado {

    private int matricula;

    public Arquitecto ()
    {
        super();
        this.matricula = 0;
    }
    public Arquitecto (String nombre, int DNI, Float tel, int matricula)
    {
        super(nombre, DNI, tel, 2000 );
        this.matricula = matricula;
    }

    public int getMatricula () { return this.matricula; }
    public void setMatricula (int matricula) { this.matricula = matricula; }

    public String toString () {
        return super.toString() + " Matricula: " + matricula;
    }

    public String crearPlanos () {
        return "Creando mi próximo plano";
    }
}
