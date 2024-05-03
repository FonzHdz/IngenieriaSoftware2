package factories;

import productos.Laptop;
import productos.Tablet;
import productos.TelefonoMovil;
import productos.apple.LaptopApple;
import productos.apple.TabletApple;
import productos.apple.TelefonoApple;

public class AppleFactory implements ProductosFactory {

    @Override
    public TelefonoMovil crearTelefonoMovil() {
        return new TelefonoApple();
    }

    @Override
    public Tablet crearTablet() {
        return new TabletApple();
    }

    @Override
    public Laptop crearLaptop() {
        return new LaptopApple();
    }
}
