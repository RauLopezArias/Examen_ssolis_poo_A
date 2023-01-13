/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.modelo;

/**
 *
 * @author dlopez
 */
public class Persona {
    private Integer cedula;
    private String nombre;
    private Integer edad;   

    public Persona() {
    }

    public Persona(Integer cedula, String nombre, Integer edad) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.edad = edad;
    }

    public void setCedula(Integer cedula) {
        this.cedula = cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return "Datos de la Persona :  \n" 
            +"nombre: " + getNombre()+"\n"
            +"cedula: " + getCedula()+"\n"
            +"edad:" + getEdad();
    }         
     
}
