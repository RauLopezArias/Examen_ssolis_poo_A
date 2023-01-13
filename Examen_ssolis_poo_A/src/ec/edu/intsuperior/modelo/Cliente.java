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
public class Cliente extends Persona{
    private Integer telefono;

    public Cliente() {
    }

    public Cliente(Integer telefono) {
        this.telefono = telefono;
    }

    @Override
    public void setCedula(Integer cedula) {
        super.setCedula(cedula); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setEdad(Integer edad) {
        super.setEdad(edad); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre); //To change body of generated methods, choose Tools | Templates.
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
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

    public Integer getTelefono() {
        return telefono;
    }

       @Override
  public String toString() {
      return "Datos del Cliente: \n"
              +"nombre:" +getNombre()+"\n"
              +"cedula: " +getCedula()+"\n"
              +"edad: " +getEdad()+"\n"
              +"telefono"+getTelefono();
  }
}
