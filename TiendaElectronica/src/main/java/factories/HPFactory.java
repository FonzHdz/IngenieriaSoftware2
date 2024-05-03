package factories;

import productos.Laptop;
import productos.Tablet;
import productos.TelefonoMovil;
import productos.hp.LaptopHP;
import productos.hp.TabletHP;
import productos.hp.TelefonoHP;

public class HPFactory implements ProductosFactory {
    @Override
    public TelefonoMovil crearTelefonoMovil() {
        return new TelefonoHP();
    }

    @Override
    public Tablet crearTablet() {
        return new TabletHP();
    }

    @Override
    public Laptop crearLaptop() {
        return new LaptopHP();
    }
}
