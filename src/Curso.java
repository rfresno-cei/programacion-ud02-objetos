public class Curso {
    private String nombre;
    private int anyo;
    private Alumno alumno;
    private Profesor profesor;

    public Curso(String nombre, int anyo, Alumno alumno, Profesor profesor) {
        this.nombre = nombre;
        this.anyo = anyo;
        this.alumno = alumno;
        this.profesor = profesor;
    }

    public Curso() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnyo() {
        return anyo;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }
    
    @Override
    public String toString() {
        return this.nombre + " - Alumno: " + this.alumno.getNombre() + " - Profesor: " + this.profesor.getNombre() + " - Media: " + this.alumno.getMedia();
    }
}
