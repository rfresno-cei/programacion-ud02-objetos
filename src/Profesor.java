public class Profesor {
    private String nombre;
    private String modulo;
    private int anyoIncorporacion;

    public Profesor(String nombre, String modulo, int anyoIncorporacion) {
        this.nombre = nombre;
        this.modulo = modulo;
        this.anyoIncorporacion = anyoIncorporacion;
    }

    public Profesor(String nombre, int anyoIncorporacion) {
        this.nombre = nombre;
        this.anyoIncorporacion = anyoIncorporacion;
        this.modulo = "Programación";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getModulo() {
        return modulo;
    }

    public void setModulo(String modulo) {
        this.modulo = modulo;
    }

    public int getAnyoIncorporacion() {
        return anyoIncorporacion;
    }

    public void setAnyoIncorporacion(int anyoIncorporacion) {
        this.anyoIncorporacion = anyoIncorporacion;
    }
    
    public int getAnyos() {
        return 2025 - this.anyoIncorporacion;
    }
    
    @Override
    public String toString() {
        return this.nombre + ", profesor de " + this.modulo;
    }
}
