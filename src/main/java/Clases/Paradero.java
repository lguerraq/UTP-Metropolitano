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
public  class Paradero {
    
    private String nombreParadero;
    private String idParadero;
    private String idRuta;
     int longitudParadero=0;
    

    

    public String getNombreParadero() {
        return nombreParadero;
    }

    public void setNombreParadero(String nombreParadero) {
        this.nombreParadero = nombreParadero;
    }

    public String getIdParadero() {
        return idParadero;
    }

    public void setIdParadero(String idParadero) {
        this.idParadero = idParadero;
    }

    public String getIdRuta() {
        return idRuta;
    }

    public void setIdRuta(String idRuta) {
        this.idRuta = idRuta;
    }
    
    public void obtenerLongitud(){
            switch(nombreParadero){
                case "NARANJAL":longitudParadero=0;break;
                case "IZAGUIRRE":longitudParadero=800;break;
                case "PACIFICO":longitudParadero=1500;break;
                case "INDEPENDENCIA":longitudParadero=2300;break;
                case "LOS JAZMINES":longitudParadero=3000;break;
                case "TOMAS VALLE":longitudParadero=3800;break;
                case "EL MILAGRO":longitudParadero=4500;break;
                case "HONORIO DELGADO":longitudParadero=5200;break;
                case "UNI":longitudParadero=6000;break;
                case "PARQUE DEL TRABAJO":longitudParadero=6700;break;
                case "CAQUETA":longitudParadero=7400;break;
                case "RAMON CASTILLA":longitudParadero=9200;break;
                case "TACNA":longitudParadero=10000;break;
                case "JIRON DE LA UNION":longitudParadero=10800;break;
                case "COLMENA":longitudParadero=11500;break;
                case "DOS DE MAYO":longitudParadero=12200;break;
                case "QUILCA":longitudParadero=12900;break;
                case "ESPAÑA":longitudParadero=13700;break;
                case "ESTACION CENTRAL":longitudParadero=14400;break;
                case "ESTADIO NACIONAL":longitudParadero=15200;break;
                case "MEXICO":longitudParadero=16000;break;
                case "CANADA":longitudParadero=16700;break;
                case "JAVIER PRADO":longitudParadero=17400;break;
                case "CANAVAL MOREYRA":longitudParadero=18200;break;
                case "ARAMBURU":longitudParadero=19000;break;
                case "DOMINGO ORUE":longitudParadero=19700;break;
                case "ANGAMOS":longitudParadero=20400;break;
                case "RICARDO PALMA":longitudParadero=21200;break;
                case "BENAVIDES":longitudParadero=22000;break;
                case "28 DE JULIO":longitudParadero=22700;break;
                case "PLAZA DE FLORES":longitudParadero=23400;break;
                case "BALTA":longitudParadero=24200;break;
                case "BULEVAR":longitudParadero=25000;break;
                case "ESTADIO UNION":longitudParadero=25800;break;
                case "ESCUELA MILITAR":longitudParadero=26600;break;
                case "TERAN":longitudParadero=27300;break;
                case "ROSARIO DE VILLA":longitudParadero=30000;break;
                case "MATELLINI":longitudParadero=30800;break;
                
            }
    }
    
   
    

    public int getLongitudParadero() {
        return longitudParadero;
    }

    public void setLongitudParadero(int longitudParadero) {
        this.longitudParadero = longitudParadero;
    }
}
