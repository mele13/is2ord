package model;

/**
 * @author Mele13
 * v1.0.0
 * created at 07/02/2022
 */
public class OrderItem {

    private int cantidad;
    
    public OrderItem(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
}
