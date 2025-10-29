public class Main {
    public static void main(String[] args) {
        Alumno pepito = new Alumno("Pepito", "Pérez Álvarez", 4, 7.8, 10);
        Profesor p = new Profesor("Paloma", 2020);
        Curso c = new Curso("Java", 1, pepito, p);
        System.out.println(c);
    }
}