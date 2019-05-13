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
public class Aviones_C implements Serializable {
   public String N_Avion;
   public String N_Presicion;
   public String N_Ataque;
   public String N_Defensa;
   public String N_Velocidad;
   public String N_Precio;

   
      public String getAvion() {
        return N_Avion;
    }

    public void setAvion(String N_Avion) {
        this.N_Avion = N_Avion;
    }
    
    public String getAtaque() {
        return N_Ataque;
    }

    public void setAtaque(String N_Ataque) {
        this.N_Ataque = N_Ataque;
    }

    public String getDefensa() {
        return N_Defensa;
    }

    public void setDefensa(String N_Defensa) {
        this.N_Defensa = N_Defensa;
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

    
    public Aviones_C(String N_Avion, String N_Ataque, String N_Defensa, String N_Presicion, String N_Velocidad , String N_Precio) {
        this.N_Avion = N_Avion;
        this.N_Ataque = N_Ataque;
        this.N_Defensa = N_Defensa;
        this.N_Presicion = N_Presicion;
        this.N_Velocidad = N_Velocidad;
        this.N_Precio = N_Precio;

    }

        
}
