package envio;

public class MaterialInformatica extends Material {

    public MaterialInformatica(String material) {
        super(material);
    }

    @Override
    public void agregarMaterial() {
        System.out.println("Materiales informática:Monitor, mouse, teclado");
        saludoDirector = "Jenny envia saludos";
        System.out.println("Saludo del director: " + saludoDirector);
    }

}
