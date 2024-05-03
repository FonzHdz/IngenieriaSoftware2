package org.example;

public class EstrategiaFiltroAltoContraste implements EstrategiaFiltroImagenes{
    @Override
    public String añadirFiltro(String imagen) {
        return "Filtro de Alto contraste correctamente aplicado a la imagen: " + imagen;
    }
}
