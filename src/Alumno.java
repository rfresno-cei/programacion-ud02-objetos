public class Alumno {
    private String nombre;
    private String apellidos;
    private double nota1;
    private double nota2;
    private double nota3;

    public Alumno(String nombre, String apellidos, double nota1, double nota2, double nota3) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public Alumno(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }
    
    public double getMedia() {
        return (nota1 + nota2 + nota3) / 3;
    }
    
    public boolean getAprobado() {
        boolean aprobado = getMedia() >= 5;
        return aprobado;
    }
    
    public String toString() {
        return this.nombre + " " + this.apellidos + " ha aprobado: " + getAprobado();
    }
}
