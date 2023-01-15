package Comida;
import java.util.Date;

public class Pao extends Comida{
    String type;
    Date expirationDate;
    Date productionDate;
    float weight;


   

    public Pao(float preco,String description, int quantity, String type, Date expirationDate, Date productionDate, float weight) {
        super( preco, description, quantity);
        this.type = type;
        this.expirationDate = expirationDate;
        this.productionDate = productionDate;
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

    public float getWeight() {
        return weight;
    }


    public void setWeight(float weight) {
        this.weight = weight;
    }

    
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pao: ");
        sb.append(super.toString());
        return sb.toString();
    }
    
    public boolean equals(Object o) {
        if (this == o) return true;
        if ((o == null) || (this.getClass() != o.getClass())) return false;
        Pao p = (Pao) o;
        return super.equals(p);
    }
}
