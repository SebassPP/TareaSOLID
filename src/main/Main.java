package main;

import envio.Material;
import envio.MaterialAdministracion;
import envio.MaterialIndustrial;
import envio.MaterialInformatica;
import modelo.Estudiante;
import modelo.Informatica;
import modelo.Administracion;
import modelo.Industrial;
import service.EmailOutlook;
import service.EnvioMaterial;

public class Main {
    public static void main(String[] args) {
        Estudiante[] listadoEstudiantes = {
                new Informatica("Daniel"),
                new Administracion("Monica"),
                new Industrial("Liliana")
        };
        verInfoEstudiantes(listadoEstudiantes);
        EmailOutlook.enviarEmail();
        Material[] materiales = {
                new MaterialInformatica(""),
                new MaterialAdministracion(""),
                new MaterialIndustrial("")
        };
        enviarCorreo(materiales);
    }

    public static void verInfoEstudiantes(Estudiante[] estudiantes) {
        for (Estudiante estudiante : estudiantes) {
            System.out.println(estudiante.nombre);
            estudiante.guardarEstudiante();
            System.out.println("Materias: ");
            estudiante.verMaterias();
        }
    }

    public static void enviarCorreo(Material[] materiales) {
        EnvioMaterial envio = new EnvioMaterial();
        for (Material material : materiales) {
            material.agregarMaterial();
        }
    }
}

//EL envio de correo depende de la clase envio, esto se puede simplificar
