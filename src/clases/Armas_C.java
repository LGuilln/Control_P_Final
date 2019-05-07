/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.io.Serializable;

/**
 *
 * @author luedu
 */
public class Armas_C implements Serializable {
    
    
    String N_Arma;
    String N_Daño;
    String N_Presicion;
    String N_Velocidad;
    String N_Precio;

  
  //  public Armas_C(String N_Arma, String N_Presicion, String N_Daño, String N_Velocidad, String N_Precio) {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    //}

   
    public String getArma() {
        return N_Arma;
    }

    public void setArma(String N_Arma) {
        this.N_Arma = N_Arma;
    }

    public String getDaño() {
        return N_Daño;
    }

    public void setDaño(String N_Daño) {
        this.N_Daño = N_Daño;
    }

    public String getPresicion() {
        return N_Presicion;
    }

    public void setPresicion(String N_Presicion) {
        this.N_Presicion = N_Presicion;
    }
    public String getVelocidad() {
        return N_Velocidad;
    }

    public void setVelocidad(String N_Velocidad) {
        this.N_Velocidad = N_Velocidad;
    }
    public String getPrecio() {
        return N_Precio;
    }

    public void setPrecio(String N_Precio) {
        this.N_Precio = N_Precio;
    }

    
    public Armas_C(String N_Arma, String N_Daño, String N_Presicion, String N_Velocidad, String N_Precio) {
        this.N_Arma = N_Arma;
        this.N_Daño = N_Daño;
        this.N_Presicion = N_Presicion;
        this.N_Velocidad = N_Velocidad;
        this.N_Precio = N_Precio;

          
}
}