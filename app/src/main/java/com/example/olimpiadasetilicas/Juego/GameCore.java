package com.example.olimpiadasetilicas.Juego;

public class GameCore {

    private static final String rutaFichero = "";
    private static final String rutaFTP = "";

    private String nombrePartida;
    private ModoJuego modalidadSeleccionada;
    private TablaPuntuaciones tablaPuntuaciones;

    public GameCore(){
        this.nombrePartida = "";
        this.modalidadSeleccionada = new ModoJuego();
        this.tablaPuntuaciones = new TablaPuntuaciones();
    }

    public GameCore(String nombrePartida, ModoJuego modalidadSeleccionada,TablaPuntuaciones tablaPuntuaciones){
        this.nombrePartida=nombrePartida;
        this.modalidadSeleccionada=modalidadSeleccionada;
        this.tablaPuntuaciones=tablaPuntuaciones;
    }

    public String getNombrePartida() {
        return nombrePartida;
    }

    public void setNombrePartida(String nombrePartida) {
        this.nombrePartida = nombrePartida;
    }
}
