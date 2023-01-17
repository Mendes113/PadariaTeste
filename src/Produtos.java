import java.util.ArrayList;

public class Produtos  implements IProdutos{ 
    ArrayList<Produto> produtos = new ArrayList<Produto>();
    
    @Override
    public void addProduto(Produto p) throws Exception {
        produtos.add(p);
    }

    @Override
    public void removeProduto(int codigo) throws Exception {
        produtos.remove(produtos.get(codigo));
    }

    @Override
    public Produto getProduto(int codigo) throws Exception {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void updateQuantidade(int codigo, double nova) throws Exception {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void updatePreco(int codigo, double novo) throws Exception {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void addQuantidade(int codigo, double quantidade) throws Exception {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void subQuantidade(int codigo, double quantidade) throws Exception {
        // TODO Auto-generated method stub
        
    }
   
}
