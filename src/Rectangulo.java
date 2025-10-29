public class Rectangulo {
    private double largo;
    private double ancho;
    private String color;
    private String colorBorde;
    private int anchoBorde;

    public Rectangulo(double largo, double ancho, String color, String colorBorde, int anchoBorde) {
        this.largo = largo;
        this.ancho = ancho;
        this.color = color;
        this.colorBorde = colorBorde;
        this.anchoBorde = anchoBorde;
    }

    public Rectangulo(double largo, double ancho) {
        this.largo = largo;
        this.ancho = ancho;
        this.color = "Blanco";
        this.colorBorde = "Negro";
        this.anchoBorde = 2;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColorBorde() {
        return colorBorde;
    }

    public void setColorBorde(String colorBorde) {
        this.colorBorde = colorBorde;
    }

    public int getAnchoBorde() {
        return anchoBorde;
    }

    public void setAnchoBorde(int anchoBorde) {
        this.anchoBorde = anchoBorde;
    }

    public double getArea() {
        return this.largo * this.ancho;
    }

    public double getPerimetro() {
        return (this.largo + this.ancho)*2;
    }

    @Override
    public String toString() {
        return "Rectangulo{" +
                "largo=" + largo +
                ", ancho=" + ancho +
                ", color='" + color + '\'' +
                ", colorBorde='" + colorBorde + '\'' +
                ", anchoBorde=" + anchoBorde +
                '}';
    }
}
