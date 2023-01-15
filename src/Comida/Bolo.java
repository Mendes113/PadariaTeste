package Comida;

public class Bolo extends Comida{

    String type;
    String flavor;
    float weight;

    public Bolo(float preco, String description, int quantity, String type, String flavor, float weight) {
        super(preco, description, quantity);
        this.type = type;
        this.flavor = flavor;
        this.weight = weight;
    }

    
   
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getFlavor() {
        return flavor;
    }
    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }
    public float getWeight() {
        return weight;
    }
    public void setWeight(float weight) {
        this.weight = weight;
    }

    
}
