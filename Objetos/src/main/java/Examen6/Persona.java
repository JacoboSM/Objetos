package Examen;

public abstract class Persona {

    private String nombre;
    private  String poblacion;

    public Persona(String nombre, String poblacion) {
        this.nombre = nombre;
        this.poblacion = poblacion;
    }

    protected Persona() {
    }

    public abstract void mostrarTipoPersona ();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", poblacion='" + poblacion + '\'' +
                '}';
    }



}
