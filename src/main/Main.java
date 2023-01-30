package main;

import modelo.Estudiante;
import modelo.Informatica;
import modelo.Administracion;
import modelo.Industrial;
import service.EnvioMaterial;

public class Main {
    public static void main(String[] args) {
        Estudiante[] listadoEstudiantes = {
                new Informatica("Daniel"),
                new Administracion("Monica"),
                new Industrial("Liliana")
        };
        verInfoEstudiantes(listadoEstudiantes);

        //Envio de material se debe remplazar
        //EnvioMaterial material = new EnvioMaterial();
        //material.enviarMaterialEstudiante(new Estudiante("Daniel", "Informatica"));
    }

    public static void verInfoEstudiantes(Estudiante[] estudiantes) {
        for (Estudiante estudiante : estudiantes) {
            System.out.println(estudiante.nombre);
            estudiante.guardarEstudiante();
            System.out.println("Materias: ");
            estudiante.verMaterias();
        }
    }

    //Aqui hay demasiados if, se esta rompiedno la regla open/close
    public static void verMateriasEstudiantes(Estudiante[] estudiantes) {


       /*
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.carrera.equals("Informatica")) {
                System.out.println("Programacion, Arquitectura, Base de datos");
            }
            if (estudiante.carrera.equals("Administracion")) {
                System.out.println("Negocios, Administracion I, Historia de la Administracion");
            }
            if (estudiante.carrera.equals("Industrial")) {
                System.out.println("Procesos, Analitica de datos, Gestion de Calidad ");
            }
        }
        */
    }
}

//EL envio de correo depende de la clase envio, esto se puede simplificar
