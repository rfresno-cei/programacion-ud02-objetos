public class Coche {
    private int caballos;
    private Integer pasajeros;
    private String marca;
    private String modelo;
    private String color;
    private int anyo;
    private Boolean nuevo;
    private Double presion;
    private String matricula;
    private int ultimaItv;
    private int totalKm;

    Coche(String marquita, String modelo) {
        this.marca = marquita;
        this.modelo = modelo;
    }

    public Coche(int caballos, Integer pasajeros, String marca, String modelo, String color, int anyo, Boolean nuevo, Double presion, String matricula, int ultimaItv, int totalKm) {
        this.caballos = caballos;
        this.pasajeros = pasajeros;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.anyo = anyo;
        this.nuevo = nuevo;
        this.presion = presion;
        this.matricula = matricula;
        this.ultimaItv = ultimaItv;
        this.totalKm = totalKm;
    }

    public Integer getPasajeros() {
        return this.pasajeros;
    }

    public int getCaballos() {
        return caballos;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public int getAnyo() {
        return anyo;
    }

    public Boolean getNuevo() {
        return nuevo;
    }

    public Double getPresion() {
        return presion;
    }

    public String getMatricula() {
        return matricula;
    }

    public int getUltimaItv() {
        return ultimaItv;
    }

    public int getTotalKm() {
        return totalKm;
    }

    public void setPasajeros(Integer pasajeros) {
        this.pasajeros = pasajeros;
    }

    public void setCaballos(int caballos) {
        this.caballos = caballos;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }

    public void setNuevo(Boolean nuevo) {
        this.nuevo = nuevo;
    }

    public void setPresion(Double presion) {
        this.presion = presion;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setUltimaItv(int ultimaItv) {
        this.ultimaItv = ultimaItv;
    }

    public void setTotalKm(int totalKm) {
        this.totalKm = totalKm;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }

    public void aumentarKm(int km) {
        this.totalKm += km;
    }

    public int obtenerAntiguedad() {
        return 2025 - this.anyo;
    }
}
