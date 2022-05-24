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
public class Buses extends Ruta{
    
    private String nombreBus;
    private String velocidad;
    private String idRuta;
    

    public String getNombreBus() {
        return nombreBus;
    }

    public void setNombreBus(String nombreBus) {
        this.nombreBus = nombreBus;
    }

  
    public String getIdRuta() {
        return idRuta;
    }

    public void setIdRuta(String idRuta) {
        this.idRuta = idRuta;
    }


    public String getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(String velocidad) {
        this.velocidad = velocidad;
    }
    
    public void obtenerVelocidad(){
            switch(nombreBus){
                case "REGULAR A":velocidad="40";break;
                case "REGULAR C":velocidad="40";break;
                case "REGULAR B":velocidad="30";break;
                case "REGULAR D":velocidad="20";break;
                case "EXPRESO 1":velocidad="50";break;
                case "EXPRESO 2":velocidad="50";break;
                case "EXPRESO 3":velocidad="50";break;
                case "EXPRESO 4 ":velocidad="50";break;
                case "EXPRESO 5":velocidad="50";break;
                case "EXPRESO 6":velocidad="50";break;
                case "EXPRESO 7":velocidad="50";break;
                case "EXPRESO 8":velocidad="50";break;
                case "EXPRESO 9":velocidad="50";break;
                case "SUPER EXPRESO":velocidad="60";break;
                
            }
        
    }
    
    
    
}
