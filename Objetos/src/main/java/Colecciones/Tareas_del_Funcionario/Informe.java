package Colecciones.Tareas_del_Funcionario;

import java.util.Stack;

public class Informe {

    private int codigo;
    private Descripcion_tipo descripcion;
    private static Stack<Informe> listaInformes = new Stack<>();

    public Informe(int codigo, Descripcion_tipo descripcion) {
        this.codigo = codigo;
        this.descripcion = descripcion;

        if (descripcion == null){

            throw new  Dispositivo_mal();

        }

        listaInformes.push(this);

        System.out.println("Informe con codigo " + getCodigo() + " añadido");

    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Descripcion_tipo getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(Descripcion_tipo descripcion) {
        this.descripcion = descripcion;
    }

    public static Stack<Informe> getListaInformes() {
        return listaInformes;
    }

    public static void setListaInformes(Stack<Informe> listaInformes) {
        Informe.listaInformes = listaInformes;
    }

    @Override
    public String toString() {
        return "Informe{" +
                "codigo=" + codigo +
                ", descripcion=" + descripcion + '}';
    }

}
