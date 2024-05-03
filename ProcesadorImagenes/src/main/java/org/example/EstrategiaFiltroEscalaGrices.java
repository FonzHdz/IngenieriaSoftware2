package org.example;

public class EstrategiaFiltroEscalaGrices implements EstrategiaFiltroImagenes{
    @Override
    public String añadirFiltro(String imagen) {
        return "Filtro de Escala de grices correctamente aplicado a la imagen: " + imagen;
    }
}
