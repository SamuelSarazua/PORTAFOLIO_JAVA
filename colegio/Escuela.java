package colegio;

public class Escuela {

    public static void programa(){
        System.out.println("Estudiantes");

        Estudiantes Estudiante1 = new Estudiantes("Jorge", "Jo@scl.edu.gt", "Segundo", "8", "true");
        Estudiantes Estudiante2 = new Estudiantes("Laura", "La@scl.edu.gt", "Segundo", "7", "false");
        Estudiantes Estudiante3 = new Estudiantes("Marco", "Pa@scl.edu.gt", "Segundo", "8", "true");
        Estudiantes Estudiante4 = new Estudiantes("Maria", "Ma@scl.edu.gt", "Segundo", "7", "false");
        Estudiantes Estudiante5 = new Estudiantes("Lucia", "Jo@scl.edu.gt", "Segundo", "8", "false");

        System.out.println(Estudiante1.getNombre() + "        " + Estudiante1.getCorreo());
        System.out.println(Estudiante2.getNombre() + "        " + Estudiante2.getCorreo());
        System.out.println(Estudiante3.getNombre() + "        " + Estudiante3.getCorreo());
        System.out.println(Estudiante4.getNombre() + "        " + Estudiante4.getCorreo());
        System.out.println(Estudiante5.getNombre() + "        " + Estudiante5.getCorreo());

        System.out.println("");
        System.out.println("");

        //Cursos
        System.out.println("Cursos");
        Cursos Curso1 = new Cursos("Matematica", "Historias", "7:00 a 8:00");
        Cursos Curso2 = new Cursos("Ortografia", "Geometria", "8:00 a 9:00");
        Cursos Curso3 = new Cursos("Caligrafia", "Bacterias", "10:45 a 11:45");
        Cursos Curso4 = new Cursos("Literatura", "Predicado", "12:00 a 1:00");


        System.out.println(Curso1.getCurso());
        System.out.println(Curso2.getCurso());
        System.out.println(Curso3.getCurso());
        System.out.println(Curso4.getCurso());


        //System.out.println(Curso1.toString());
        //System.out.println(Curso2.toString());
        //System.out.println(Curso3.toString());
    }
}
