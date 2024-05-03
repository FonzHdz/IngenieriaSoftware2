package productos.hp;

import productos.Tablet;

public class TabletHP implements Tablet {

    @Override
    public void imprimirInfo() {
        System.out.println("Tablet de HP con sistema operativo Android");
    }
}
