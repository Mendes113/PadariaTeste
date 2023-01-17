
public class Item {
    Produto produto;
    double quantidadeVend;
   

    public Item(Produto produto, double quantidadeVend){
        this.produto = produto;
        this.quantidadeVend = quantidadeVend;
    }
    //metodo para calcular item
    public double calculaItem() {
        return produto.getPreco() * quantidadeVend;
    }
    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public double getQuantidadeVend() {
        return quantidadeVend;
    }

    public void setQuantidadeVend(int quantidadeVend) {
        this.quantidadeVend = quantidadeVend;
    }
    //metodo para calcular item
    public double calculaItem(int quantidadeVend) {
        return produto.getPreco() * quantidadeVend;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return toString();
    }
}
