package tienda;

import factories.ProductosFactory;
import productos.Laptop;
import productos.Tablet;
import productos.TelefonoMovil;

public class TiendaElectronica {
    private ProductosFactory factory;

    public TiendaElectronica(ProductosFactory factory) {
        this.factory = factory;
    }

    public void mostrarProductos() {
        TelefonoMovil telefono = factory.crearTelefonoMovil();
        Tablet tablet = factory.crearTablet();
        Laptop laptop = factory.crearLaptop();

        telefono.imprimirInfo();
        tablet.imprimirInfo();
        laptop.imprimirInfo();
    }
}
