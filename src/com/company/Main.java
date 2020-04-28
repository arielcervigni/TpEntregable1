package com.company;

import com.company.Empleado.Arquitecto;
import com.company.Empleado.Empleado;
import com.company.Empleado.MaestroMayorDeObra;
import com.company.Empleado.Obrero;
import com.company.Obra.Comercio;
import com.company.Obra.Domestica;
import com.company.Obra.Hotel;
import com.company.Obra.Obra;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // write your code here

        /// Instacion 4 Arquitectos.
        Arquitecto arquitecto1 = new Arquitecto("Lionel Messi", 24879585, 223.59089f, 102345);
        Arquitecto arquitecto2 = new Arquitecto("Eden Hazard", 14976579, 654.65784f, 70808);

        /// Instancio 4 Maestros Mayor de Obra
        MaestroMayorDeObra maestro1 = new MaestroMayorDeObra("Xavi Hernandez", 19489654, 789.4625f, 40);
        MaestroMayorDeObra maestro2 = new MaestroMayorDeObra("Andres Iniesta", 16498548, 589.4989f, 41);
        MaestroMayorDeObra maestro3 = new MaestroMayorDeObra("Luca Modric", 14596785, 574.6659f, 30);
        MaestroMayorDeObra maestro4 = new MaestroMayorDeObra("Marcelo el lateral", 17945655, 489.55461f, 29);

        /// Instancio 4 Obreros
        Obrero obrero1 = new Obrero("Sergio Busquets", 14589246, 475.88896f, 35);
        Obrero obrero2 = new Obrero("Dani Alves", 18648764, 471.16895f, 36);
        Obrero obrero3 = new Obrero("Vinicius Jr", 38746516, 418.75961f, 20);
        Obrero obrero4 = new Obrero("Sergio Ramos", 154984654, 419.8792f, 33);

        /// Lista con todos los empleados
        ArrayList<Empleado> listaDeEmpleados = new ArrayList<>();
        listaDeEmpleados.add(arquitecto1);
        listaDeEmpleados.add(arquitecto2);
        listaDeEmpleados.add(maestro1);
        listaDeEmpleados.add(maestro2);
        listaDeEmpleados.add(maestro3);
        listaDeEmpleados.add(maestro4);
        listaDeEmpleados.add(obrero1);
        listaDeEmpleados.add(obrero2);
        listaDeEmpleados.add(obrero3);
        listaDeEmpleados.add(obrero4);


        ArrayList<Empleado> empleadosHotel = new ArrayList<>();
        empleadosHotel.add(arquitecto1);
        empleadosHotel.add(maestro1);
        empleadosHotel.add(obrero2);
        empleadosHotel.add(obrero1);
        ArrayList<Empleado> empleadosComercio = new ArrayList<>();
        empleadosComercio.add(arquitecto2);
        empleadosComercio.add(maestro3);
        empleadosComercio.add(obrero3);
        empleadosComercio.add(obrero4);
        ArrayList<Empleado> empleadosCasa = new ArrayList<>();
        empleadosCasa.add(arquitecto1);
        empleadosCasa.add(maestro2);
        empleadosCasa.add(maestro1);
        empleadosCasa.add(obrero1);
        empleadosCasa.add(obrero2);
        empleadosCasa.add(obrero3);


        /// Ejercicio A
        System.out.println("---------------------- Ejercicio A: ----------------------");
        System.out.println("Arquitecto: " + arquitecto1.crearPlanos());
        System.out.println("Maestro Mayor de Obra: " + maestro1.construir());
        System.out.println("Obrero: " + obrero1.construir());

        /// Ejercicio B
        ArrayList<Obra> arregloDeObras = new ArrayList<>();
        Empresa arielConstruye = new Empresa("Ariel Construye", arregloDeObras, listaDeEmpleados);

        // Ejercicio C
        // Instancio 3 Obras (un hotel, un comercio y uno domestico)
        Hotel unHotel = new Hotel("Buenos Aires 4675", 1588, 60, 800, empleadosHotel, 0, "Hotel de Ariel", 10);
        Comercio unComercio = new Comercio("Chile 1816", 150, 45, 980, empleadosComercio, 0, "Maker Electronica", "Electronica");
        Domestica unaCasa = new Domestica("Garay 6478", 50, 15, 400, empleadosCasa, 0, 2);
        /// Verifico que los empleados estén cargados correctamente
        System.out.println("Empleados casa: " + unaCasa.verificarEmpleados());
        System.out.println("Empleados hotel: " + unHotel.verificarEmpleados());
        System.out.println("Empleados casa:" + unaCasa.verificarEmpleados());
        /// Seteo el total de la obra.
        unHotel.setPrecioTotal(unHotel.calcularPrecioTotal());
        unComercio.setPrecioTotal(unComercio.calcularPrecioTotal());
        unaCasa.setPrecioTotal(unaCasa.calcularPrecioTotal());

        /// Agrego las 3 obras a la empresa
        arregloDeObras.add(unHotel);
        arregloDeObras.add(unComercio);
        arregloDeObras.add(unaCasa);

        /// Ejercicio D
        arielConstruye.setArregloDeObras(arregloDeObras);

        /// Ejercicio E
        System.out.println("\n---------------------- Ejercicio E: ----------------------");
        ArrayList <Empleado> listaDeEmpleadosDeUnaObra = arielConstruye.empleadoDeUnaObra("Garay 6478");
        int i = 0;
        for (i=0;i<listaDeEmpleadosDeUnaObra.size();i++)
        {
            System.out.println(listaDeEmpleadosDeUnaObra.get(i));
        }

        /// Ejercicio F
        System.out.println("\n---------------------- Ejercicio F: ----------------------");
        System.out.println(arielConstruye.mostrarObrasYMonto());
    }

}


