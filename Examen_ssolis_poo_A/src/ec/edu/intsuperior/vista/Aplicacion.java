/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.vista;

import ec.edu.intsuperior.modelo.Empleado;
import ec.edu.intsuperior.modelo.Persona;
import java.util.Scanner;

/**
 *
 * @author dlopez
 */
public class Aplicacion {
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    Persona p1 = new Persona();
    System.out.println("\n");
        System.out.println("Datos de la PERSONA");
        System.out.println("Ingrese el nombre");
        p1.setNombre(leer.next());
        System.out.println("Ingrese la cedula");
        p1.setCedula(leer.nextInt(20));
        System.out.println("Ingrese la edad");
        p1.setEdad(leer.nextInt());
        System.out.println("\n");
        
        System.out.println(p1.toString());
        
        Empleado emp1 = new Empleado();
        System.out.println("\n");
        System.out.println("Datos del EMPLEADO");
        System.out.println("Ingrese el nombre");
        emp1.setNombre(leer.next());
        System.out.println("Ingrese la cedula");
        emp1.setCedula(leer.nextInt(11)) ;
        System.out.println("Ingres la edad");
        emp1.setEdad(leer.nextInt());
       
    }  
 
}
