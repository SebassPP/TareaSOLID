package modelo;

public class Industrial extends Estudiante {

    public Industrial(String nombre) {
        super(nombre);
    }

    @Override
    public void guardarEstudiante() {
        System.out.println("Guardando estudiante de ingenieria industrial en base de datos");
    }
    @Override
    public void verMaterias() {
        System.out.println("Procesos, Analitica de datos, Gestion de Calidad ");
    }
}

