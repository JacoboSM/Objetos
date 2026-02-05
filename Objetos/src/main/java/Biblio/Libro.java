package Biblio;

public class Libro {

    private static int cantidadlibros = 0 ;
    private static int librosDisponibles = 0;

    private String titulo;
    private String id;
    private boolean disponible;
    private String autor;
    private Estudiante estudiantePrestado;
    private Editorial editorial;

    public Libro (String titulo, String autor, Editorial editorial){

        this.titulo = titulo;
        this.autor = autor;
        disponible = true;
        this.id = calcularid();
        estudiantePrestado = null;
        librosDisponibles++;
        cantidadlibros++;
        this.editorial = editorial;

    }

    private String calcularid () {

        return String.format("LIB%03d", cantidadlibros );

    }
    public Prestamo prestar  (Estudiante estudiante){

        Prestamo prestamo = null;

        if (disponible && estudiante.getLibro() == null){

            disponible = false;

            librosDisponibles--;

            System.out.println("El libro " + titulo + " ha sido prestado con éxito. Ha sido prestado a " + estudiante.getNombre() + " de " + estudiante.getCurso());

            estudiantePrestado = estudiante;

            estudiante.setLibro(this);

            prestamo = new Prestamo(this,estudiante);

            System.out.println("Prestamo realizado con exito!");

        } else if (estudiante.getLibro() != null) {

            System.out.println("El estudiante " + estudiante + " ya tiene un libro prestado");

        } else{

            System.out.println("El libro " + titulo + " ya ha sido prestado");

        }

        return prestamo;

    }

    public void devolver (){

        if (!disponible){

            disponible = true;

            librosDisponibles++;

            System.out.println("El libro " + titulo + " ha sido devuelto con éxito. Ha sido devuelto por " + estudiantePrestado.getNombre() + " de " + estudiantePrestado.getCurso());
            estudiantePrestado.setLibro(null);
            estudiantePrestado = null;


        }else{

            System.out.println("El libro " + titulo + " ya ha sido devuelto. No se puede devolver");

        }

    }

    public boolean estaDisponible (){

        return disponible;

    }

    public static int getTotalLibros (){

        return cantidadlibros;

    }

    public static int getlibrosDisponibles (){

        return librosDisponibles;

    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    public Estudiante getEstudiantePrestado() {
        return estudiantePrestado;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public static int getLibrosDisponibles() {
        return librosDisponibles;
    }

    public static void setLibrosDisponibles(int librosDisponibles) {
        Libro.librosDisponibles = librosDisponibles;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", id='" + id + '\'' +
                ", disponible=" + disponible +
                ", autor='" + autor + '\'' +
                ", estudiantePrestado=" + estudiantePrestado +
                ", editorial=" + editorial +
                '}';
    }

}
