package Comida;
import java.util.Date;

public class Pastel extends Comida{
    String type;
    Date expirationDate;
    Date productionDate;
    String flavor;
    float weight;
    public Pastel(float preco,String description, int quantity, String type, Date expirationDate, Date productionDate, String flavor, float weight) {
        super( preco, description, quantity);
        this.type = type;
        this.expirationDate = expirationDate;
        this.productionDate = productionDate;
        this.flavor = flavor;
        this.weight = weight;

    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }


    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public Date getProductionDate() {
        return productionDate;
    }


    public void setProductionDate(Date productionDate) {
        this.productionDate = productionDate;
    }
    
    public String getFlavor(){
        return flavor;
    }
    public void setFlavor(String flavor){
        this.flavor = flavor;
    }

    public float getWeight() {
        return weight;
    }


    public void setWeight(float weight) {
        this.weight = weight;
    }

    
}
