package org.example;

public class PorcesadorImagen {

    private EstrategiaFiltroImagenes estrategia;

    public void setEstrategia(EstrategiaFiltroImagenes estrategia) {
        this.estrategia = estrategia;
    }

    public String ejecutarEstrategia(String imagen){
        return estrategia.añadirFiltro(imagen);
    }


}
