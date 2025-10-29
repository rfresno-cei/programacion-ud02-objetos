public class Producto {
    private String nombre;
    private double precio;
    private int stock;

    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public Producto() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrecioConImpuesto(double impuesto) {
        return this.precio + this.precio * impuesto / 100;
    }

    public double getPrecioTotalStock() {
        return this.precio * this.stock;
    }

    public int aumentarStock(int cantidad) {
        this.stock = this.stock + cantidad;
        return this.stock;
    }

    public int disminuirStock(int cantidad) {
        this.stock = this.stock - cantidad;
        return this.stock;
    }

    public String toString() {
        return this.nombre + ", " + this.precio + " €, total en almacén: " + this.stock;
    }
}
