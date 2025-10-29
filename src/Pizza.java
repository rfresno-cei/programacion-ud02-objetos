public class Pizza {
    private String masa;
    private String base;
    private String borde;
    private double perimetro;
    private double precio;
    private String sabor;
    private String ing1;
    private String ing2;
    private String ing3;

    public Pizza(String masa, String base, String borde, double perimetro, double precio, String sabor, String ing1, String ing2, String ing3) {
        this.masa = masa;
        this.base = base;
        this.borde = borde;
        this.perimetro = perimetro;
        this.precio = precio;
        this.sabor = sabor;
        this.ing1 = ing1;
        this.ing2 = ing2;
        this.ing3 = ing3;
    }

    public Pizza(String masa, String base, String borde, double perimetro, double precio) {
        this.masa = masa;
        this.base = base;
        this.borde = borde;
        this.perimetro = perimetro;
        this.precio = precio;
    }

    public String getMasa() {
        return masa;
    }

    public void setMasa(String masa) {
        this.masa = masa;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getBorde() {
        return borde;
    }

    public void setBorde(String borde) {
        this.borde = borde;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public String getIng1() {
        return ing1;
    }

    public void setIng1(String ing1) {
        this.ing1 = ing1;
    }

    public String getIng2() {
        return ing2;
    }

    public void setIng2(String ing2) {
        this.ing2 = ing2;
    }

    public String getIng3() {
        return ing3;
    }

    public void setIng3(String ing3) {
        this.ing3 = ing3;
    }

    public double divide(int trozos) {
        return this.perimetro / trozos;
    }

    public double getPrecioPedido(int numero) {
        return this.precio * numero;
    }

    public double getPrecioConDescuento(double descuento) {
        double desc = this.precio * descuento / 100;
        return this.precio - desc;
    }

    public double getRadio() {
        return this.perimetro / (2 * Math.PI);
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "masa='" + masa + '\'' +
                ", base='" + base + '\'' +
                ", borde='" + borde + '\'' +
                ", perimetro=" + perimetro +
                ", precio=" + precio +
                ", sabor='" + sabor + '\'' +
                ", ing1='" + ing1 + '\'' +
                ", ing2='" + ing2 + '\'' +
                ", ing3='" + ing3 + '\'' +
                '}';
    }
}
