package org.example;

public class Libropatri {

    private static int cantidadLibros = 0;
    private static int librosDisponibles;

    private String titulo;
    private  String autor;
    private  String id;
    private boolean disponible;

    public Libropatri (String titulo, String autor){

        this.titulo = titulo;
        this.autor = autor;
        disponible = true;
        // id = ?
        cantidadLibros++;
        librosDisponibles++;

    }



    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
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

    @Override
    public String toString() {
        return "Libropatri{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", id='" + id + '\'' +
                ", disponible=" + disponible +
                '}';
    }

}
