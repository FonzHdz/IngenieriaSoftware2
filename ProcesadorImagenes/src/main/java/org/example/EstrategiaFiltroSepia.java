package org.example;

public class EstrategiaFiltroSepia implements EstrategiaFiltroImagenes {
    @Override
    public String añadirFiltro(String imagen) {
        return "Filtro Sepia correctamente aplicado a la imagen: " + imagen;
    }
}
