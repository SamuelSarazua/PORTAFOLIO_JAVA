package colegio;

public class Cursos {

    private String Curso;
    private String Categoria;
    private String Periodo;

    //Metodo Constructor
    public Cursos(String Curso, String Categoria, String Periodo){

        this.Curso = Curso;
        this.Categoria = Categoria;
        this.Periodo = Periodo;

    }

    //Metodo get
    public String getCurso(){
        return "Curso: " + Curso;
    }

    public String getCategoria(){
        return "Categoria: " + Categoria;
    }

    public String getPeriodo(){
        return "Periodo: " + Periodo;
    }

    public void setCurso(String Curso){
        this.Curso = Curso;
    }

    public void setCategoria(String Categoria){
        this.Categoria = Categoria;
    }

    public void setPeriodo(String Periodo){
        this.Periodo = Periodo;
    }

    public String toString(){
        return "Curso: " + Curso + "     Categoria: " + Categoria + "     Periodo: " + Periodo;
    }
}
