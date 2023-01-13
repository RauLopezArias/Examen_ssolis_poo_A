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
public class Empleado extends Persona{
    private double sueldo;

    public Empleado() {
        
    }
    
    public Empleado (Double sueldo){
        this.sueldo = sueldo;
    }

    @Override
    public void setCedula(Integer cedula) {
        super.setCedula(cedula); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setEdad(Integer edad) {
        super.setEdad(edad); //To change body of generated methods, choose Tools | Templates.
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
        
    @Override
    public Integer getCedula() {
        return super.getCedula(); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String getNombre() {
        return super.getNombre(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Integer getEdad() {
        return super.getEdad(); //To change body of generated methods, choose Tools | Templates.
    }

    public double getSueldo() {
        return sueldo;
    }
    
    @Override
  public String toString() {
      return "Datos del Empleado: \n"
              +"nombre:" +getNombre()+"\n"
              +"cedula: " +getCedula()+"\n"
              +"edad: " +getEdad()+"\n"
             + "sueldo: " +getSueldo();
  }
      
  }
