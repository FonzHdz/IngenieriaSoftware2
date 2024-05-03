package productos.hp;

import productos.Laptop;

public class LaptopHP implements Laptop {

    @Override
    public void imprimirInfo() {
        System.out.println("Laptop de HP con sistema operativo Windows");
    }
}
