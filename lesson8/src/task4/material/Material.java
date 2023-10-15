package task4.material;

public abstract class Material {
    String kindOfMaterial;


    public Material(String kindOfMaterial) {
        this.kindOfMaterial = kindOfMaterial;
    }

    @Override
    public String toString() {
        return kindOfMaterial;
    }
}
