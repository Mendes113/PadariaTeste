package Bebida;

import java.util.ArrayList;
import java.util.List;

public class Bebida {
    long codigo;
    float preco;
    String descricao;
    int quantity;
    double calories;
    List <String> ingredientes = new ArrayList<String>();
   
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

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public List<String> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<String> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public Bebida(float preco, String description, int quantity, List<String> ingredientes, double calories) {
        this.preco = preco;
        this.descricao = description;
        this.quantity = quantity;
        this.ingredientes = ingredientes;
        this.calories = calories;
    }
}
