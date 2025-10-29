public class Persona {
    private String nombre;
    private String apellido;
    private int anyoNacimiento;
    private Integer altura;
    private double peso;
    private String colorPelo;

    public Persona(String nombre, String apellido, int anyoNacimiento, Integer altura, double peso, String colorPelo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.anyoNacimiento = anyoNacimiento;
        this.altura = altura;
        this.peso = peso;
        this.colorPelo = colorPelo;
    }

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.colorPelo = "Negro";
    }

    public Persona(int anyoNacimiento, double peso, String colorPelo) {
        this.anyoNacimiento = anyoNacimiento;
        this.peso = peso;
        this.colorPelo = colorPelo;
    }

    public Persona() {}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getAnyoNacimiento() {
        return anyoNacimiento;
    }

    public void setAnyoNacimiento(int anyoNacimiento) {
        this.anyoNacimiento = anyoNacimiento;
    }

    public Integer getAltura() {
        return altura;
    }

    public void setAltura(Integer altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getColorPelo() {
        return colorPelo;
    }

    public void setColorPelo(String colorPelo) {
        this.colorPelo = colorPelo;
    }

    public int getEdad() {
        return 2025 - anyoNacimiento;
    }

    public double getIMC() {
        // Peso en kilos entre el cuadrado de altura en metros
        double alturaMetros = (double) this.altura / 100;
        double alturaCuadrado = alturaMetros * alturaMetros;
        double imc = this.peso / alturaCuadrado;
        return imc;
    }

    public static double getIMC(double peso, int altura) {
        // Peso en kilos entre el cuadrado de altura en metros
        double alturaMetros = (double) altura / 100;
        double alturaCuadrado = alturaMetros * alturaMetros;
        double imc = peso / alturaCuadrado;
        return imc;
    }

    @Override
    public String toString() {
        return this.nombre + " " + this.apellido;
    }
}
