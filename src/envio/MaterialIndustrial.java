package envio;

public class MaterialIndustrial extends Material{

    public MaterialIndustrial(String material) {
        super(material);
    }

    @Override
    public void agregarMaterial() {
        System.out.println("Materiales Industrial: Martillo, casco, tornillo");
        saludoDirector = "Martha envia saludos";
        System.out.println("Saludo del director: " + saludoDirector);
    }
}
