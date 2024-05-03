package tienda;

import factories.AppleFactory;
import factories.HPFactory;
import factories.SamsungFactory;

public class Main {
    public static void main(String[] args) {
        TiendaElectronica tiendaApple = new TiendaElectronica(new AppleFactory());
        tiendaApple.mostrarProductos();

        TiendaElectronica tiendaSamsung = new TiendaElectronica(new SamsungFactory());
        tiendaSamsung.mostrarProductos();

        TiendaElectronica tiendaHP = new TiendaElectronica(new HPFactory());
        tiendaHP.mostrarProductos();
    }
}