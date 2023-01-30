package modelo;

public class Administracion extends Estudiante {

    public Administracion(String nombre) {
        super(nombre);
    }

    @Override
    public void guardarEstudiante() {
        System.out.println("Guardando estudiante de administracion en base de datos");
    }

    @Override
    public void verMaterias() {
        System.out.println("Negocios, Administracion I, Historia de la Administracion");
    }
}

