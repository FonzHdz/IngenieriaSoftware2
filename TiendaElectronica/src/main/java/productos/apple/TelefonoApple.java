package productos.apple;

import productos.TelefonoMovil;

public class TelefonoApple implements TelefonoMovil {

    @Override
    public void imprimirInfo() {
        System.out.println("Teléfono iPhone de Apple con sistema operativo iOS");
    }
}
