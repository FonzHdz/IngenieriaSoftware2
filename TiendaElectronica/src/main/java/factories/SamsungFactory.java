package factories;

import productos.Laptop;
import productos.Tablet;
import productos.TelefonoMovil;
import productos.samsung.LaptopSamsung;
import productos.samsung.TabletSamsung;
import productos.samsung.TelefonoSamsung;

public class SamsungFactory implements ProductosFactory {
    @Override
    public TelefonoMovil crearTelefonoMovil() {
        return new TelefonoSamsung();
    }

    @Override
    public Tablet crearTablet() {
        return new TabletSamsung();
    }

    @Override
    public Laptop crearLaptop() {
        return new LaptopSamsung();
    }
}
