package colegio;

public class Estudiantes {

    private String nombre;
    private String correo;
    private String carrera;
    private String edad;
    private String solvencia;

    //Metodo constructor
    public Estudiantes(String nombre, String correo, String carrera, String edad, String solvencia){

        this.nombre = nombre;
        this.correo = correo;
        this.carrera = carrera;
        this.edad = edad;
        this.solvencia = solvencia;

    }

    //metodos get
    public String getNombre(){
        return "Nombre: " + nombre;
    }

    public String getCorreo(){
        return "Correo: " + correo;
    }

    public String getCarrera(){
        return  carrera;
    }

    public String getEdad(){
        return edad;
    }

    public String getSolvecia(){
        return solvencia;
    }

    //metodos set
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setCorreo(String correo){
        this.correo = correo;
    }

    public void setCarrera(String carrera){
        this.carrera = carrera;
    }

    public void setEdad(String edad){
        this.edad = edad;
    }

    public void setSolvencia(String solvencia){
        this.solvencia = solvencia;
    }

    public String toString(){
        return "Nombre: " + nombre + ", Correo: " + correo + ", Carrera: " + carrera + ", Edad: " + edad + ", Solvencia: " + solvencia;
    }
}

