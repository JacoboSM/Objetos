package Examen;

import java.util.ArrayList;
import java.util.Scanner;

public class Expediente {

    Scanner read = new Scanner(System.in);
    private ArrayList<TipoSer> listaSeres;
    private EstadoTramite estado;
    private Ciudadano ciudadano;

    public Expediente(EstadoTramite estado, Ciudadano ciudadano) {

        this.listaSeres = new ArrayList<>();
        this.estado = estado;
        this.ciudadano = ciudadano;

    }

    public void insertarSeres (){

        boolean bucle = true;
        double suma = 0;

        while (bucle){

            System.out.println("Inserta el tipo de ser que quieres censar [THERIAN, DOMESTICO, EXOTICO] : ");
            TipoSer tiposer = TipoSer.valueOf(read.next());

            if (tiposer == TipoSer.DOMESTICO || tiposer == TipoSer.EXOTICO || tiposer == TipoSer.THERIAN) {

                System.out.println("Tipo no contemplado");
            }else {

                listaSeres.add(tiposer);
                suma = suma + tiposer.getPrecio();

                System.out.println("Importe tasas actual : " + suma );

                System.out.println("Quieres añadir otro tipo de ser? [S/N]");
                String verificar = read.next();

                if (verificar.equals("N") ){

                    bucle = false;

                }

            }


        }


    }

    public void verTasas(){



    }

    public ArrayList<TipoSer> getListaSeres() {
        return listaSeres;
    }

    public void setListaSeres(ArrayList<TipoSer> listaSeres) {
        this.listaSeres = listaSeres;
    }

    public EstadoTramite getEstado() {
        return estado;
    }

    public void setEstado(EstadoTramite estado) {
        this.estado = estado;
    }

    public Ciudadano getCiudadano() {
        return ciudadano;
    }

    public void setCiudadano(Ciudadano ciudadano) {
        this.ciudadano = ciudadano;
    }

    @Override
    public String toString() {
        return "Expediente{" +
                "listaSeres=" + listaSeres +
                ", estado=" + estado +
                ", ciudadano=" + ciudadano +
                '}';
    }
}
