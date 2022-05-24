/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author jhuam
 */
public class ParaderoxRuta extends Paradero {
    
    private String idRuta;
    private String idParadero;
    private String velocidad;
    private String tiempo;
    
 

    @Override
    public String getIdRuta() {
        return idRuta;
    }

    @Override
    public void setIdRuta(String idRuta) {
        this.idRuta = idRuta;
    }

    @Override
    public String getIdParadero() {
        return idParadero;
    }

    public void setIdParadero(String idParadero) {
        this.idParadero = idParadero;
    }

   

    public String getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(String velocidad) {
        this.velocidad = velocidad;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    
    
   
    
    
}
