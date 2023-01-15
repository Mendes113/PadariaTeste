package Comida;
public class Comida {
    long codigo;
    float preco;
    String descricao;
    int quantity;
   
    public Comida(float preco, String description, int quantity) {
        this.preco = preco;
        this.descricao = description;
        this.quantity = quantity;
       
    }
    
    public long getCodigo() {
        return codigo;
    }
    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }
    public float getPreco() {
        return preco;
    }
    public void setPreco(float preco) {
        this.preco = preco;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }



}
