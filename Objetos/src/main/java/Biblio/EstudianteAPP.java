package Biblio;

public class EstudianteAPP {

    public static void main(String[] args) {

        Estudiante joaquin = new Estudiante("Joaquin", "1DAM", "joaquinelchileno@gmail.chile");

        System.out.println(joaquin.getNia());

        Estudiante david = new Estudiante("David");

        System.out.println(david.getNia());

        Estudiante adrian = new Estudiante("Adrian");

        System.out.println("Hay " + Estudiante.obtenerestudiantes() + " estudiantes.");

        System.out.println(Estudiante.validarCorreo("joaquinelchileno@gmail.chile"));
        System.out.println(Estudiante.validarCorreo("joaquinelchileno@alu.edu.gva.es"));

        Editorial millenium = new Editorial("Millenium", "España");

        Libro divina_comedia = new Libro("divina comedia", "dante alieri", millenium);

        System.out.println(divina_comedia);

        Prestamo p1 = divina_comedia.prestar(joaquin);

        System.out.println(joaquin);

        System.out.println("Fecha prestamo " + p1.getFecha());

        System.out.println(divina_comedia.estaDisponible());

        System.out.println(divina_comedia);

        System.out.println("Estos son los libros que hay " + Libro.getTotalLibros());

        System.out.println("Estos son los libros que hay disponibles " + Libro.getlibrosDisponibles());

        divina_comedia.devolver();
        divina_comedia.devolver();

        divina_comedia.prestar(joaquin);

        System.out.println(divina_comedia.estaDisponible());

        System.out.println(divina_comedia);


    }

}
