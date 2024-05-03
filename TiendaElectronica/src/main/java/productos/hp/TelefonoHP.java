package productos.hp;

import productos.TelefonoMovil;

public class TelefonoHP implements TelefonoMovil {

    @Override
    public void imprimirInfo() {
        System.out.println("Teléfono móvil de HP con sistema operativo Android");
    }
}
