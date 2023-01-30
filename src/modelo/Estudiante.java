package modelo;

public class Estudiante {

    public String nombre;


    public Estudiante(String nombre) {
        this.nombre = nombre;

    }

    public void guardarEstudiante() {
        System.out.println("Guardando estudiante en base de datos");
    }

    public void verMaterias() {
        System.out.println(" ");
    }

}
