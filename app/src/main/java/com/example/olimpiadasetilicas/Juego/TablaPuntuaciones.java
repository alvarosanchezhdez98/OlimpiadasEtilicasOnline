package com.example.olimpiadasetilicas.Juego;

import java.util.ArrayList;
import java.util.List;

public class TablaPuntuaciones {

    private List<Jugador> listaJugadores;

    public TablaPuntuaciones() {
        this.listaJugadores = new ArrayList<Jugador>();
    }

    public TablaPuntuaciones(List<Jugador> listaJugadores){
        this.listaJugadores= listaJugadores;
    }

    public void añadirJugador(Jugador jugador){
        listaJugadores.add(jugador);
    }

    public void eliminarJugador(Jugador jugador){
        listaJugadores.remove(jugador);
    }
}
