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
public class Tanques_C implements Serializable{
    String N_Tanque;
    String N_Presicion;
    String N_Ataque;
    String N_Defensa;
    String N_Velocidad;
    String N_Precio;

   
      public String getTanque() {
        return N_Tanque;
    }

    public void setTanque(String N_Tanque) {
        this.N_Tanque = N_Tanque;
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

    
    public Tanques_C(String N_Tanque, String N_Ataque, String N_Defensa, String N_Presicion, String N_Velocidad , String N_Precio) {
        this.N_Tanque = N_Tanque;
        this.N_Ataque = N_Ataque;
        this.N_Defensa = N_Defensa;
        this.N_Presicion = N_Presicion;
        this.N_Velocidad = N_Velocidad;
        this.N_Precio = N_Precio;

    }
        
}
