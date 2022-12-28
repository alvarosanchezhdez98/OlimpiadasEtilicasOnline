package com.example.olimpiadasetilicas.Juego;

public class Jugador {

    private String nombreJugador;
    private int puntuacion;

    public Jugador(){
        this.nombreJugador="";
        this.puntuacion=0;
    }

    public Jugador(String nombreJugador,int puntuacion){
        this.nombreJugador = nombreJugador;
        this.puntuacion= puntuacion;
    }

    public String getNombreJugador() {
        return nombreJugador;
    }

    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }
}
