package com.company.Obra;

import com.company.Empleado.Empleado;

import java.util.ArrayList;

public class Hotel extends Comercial {

        private int pisos;

        public Hotel ()
        {
            this.pisos = 0;
        }
        public Hotel (String direccion, double cantidadMts, int cantidadDias, double costoPorMt, ArrayList<Empleado> arregloDeEmpleados, double precioTotal, String nombre, int pisos)
        {
            super(direccion,cantidadMts,cantidadDias, costoPorMt, arregloDeEmpleados, precioTotal, nombre);
            this.pisos = pisos;
        }

        public int getPisos () { return this.pisos; }
        public void setRubro (int pisos) { this.pisos = pisos; }

        public String toString ()
        {
            return super.toString() + "\nCantidad de Pisos: " + this.pisos;
        }
}
