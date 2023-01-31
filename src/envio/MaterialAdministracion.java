package envio;

import java.util.Collections;
import java.util.List;

public class MaterialAdministracion extends Material{


    public MaterialAdministracion(String material) {
        super(material);
    }

    @Override
    public void agregarMaterial() {
        System.out.println("Materiales Administración:Lapiz, papel, calculadora");
        saludoDirector = "Juan envia saludos";
        System.out.println("Saludo del director: " + saludoDirector);
    }

}
