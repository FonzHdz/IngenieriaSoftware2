package factories;

import productos.Laptop;
import productos.Tablet;
import productos.TelefonoMovil;

public interface ProductosFactory {
    TelefonoMovil crearTelefonoMovil();
    Tablet crearTablet();
    Laptop crearLaptop();
}
