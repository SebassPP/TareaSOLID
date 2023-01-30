package modelo;

public class Informatica extends Estudiante {

    public Informatica(String nombre) {
        super(nombre);
    }

    @Override
    public void guardarEstudiante() {
        System.out.println("Guardando estudiante de ingenieria informatica en base de datos");
    }

    @Override
    public void verMaterias() {
        System.out.println("Programacion, Arquitectura, Base de datos");
    }
}

