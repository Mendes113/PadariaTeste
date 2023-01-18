import java.util.ArrayList;

public class Produtos  implements IProdutos{ 
    ArrayList<Produto> produtos = new ArrayList<Produto>();
    
    @Override
    public void addProduto(Produto p) throws Exception {
        produtos.add(p);
    }
/**
 * It removes a product from the list of products
 * 
 * @param codigo int
 */

    @Override
    public void removeProduto(int codigo) throws Exception {
        produtos.remove(produtos.get(codigo));
    }

  /**
   * It returns a product.
   * 
   * @param codigo int
   * @return Nothing.
   */
    @Override
    public Produto getProduto(int codigo) throws Exception {
        // TODO Auto-generated method stub
        return null;
    }
/**
 * This function updates the quantity of a product in the database
 * 
 * @param codigo The code of the product
 * @param nova the new quantity
 */

    @Override
    public void updateQuantidade(int codigo, double nova) throws Exception {
       
        
    }

  // A method that updates the price of a product.
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
