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
        produtos.remove(get(codigo));
    }

  /**
   * It returns a product.
   * 
   * @param codigo int
   * @return Nothing.
   */
    @Override
    public Produto getProduto(int codigo) throws Exception {
        try{
            return get(codigo);
        }
        catch(Exception e){
            throw new Exception("Produto não encontrado");
        }
    }
/**
 * This function updates the quantity of a product in the database
 * 
 * @param codigo The code of the product
 * @param nova the new quantity
 */

    @Override
    public void updateQuantidade(int codigo, double nova) throws Exception {
       try{
              get(codigo).setQuantidade(nova);
       }catch(Exception e){
           throw new Exception("Erro ao atualizar quantidade");
       }
        
    }

  // A method that updates the price of a product.
    @Override
    public void updatePreco(int codigo, double novo) throws Exception {
      try {  get(codigo).setPreco(novo);}
      catch(Exception e){
          throw new Exception("Erro ao atualizar preço");
      }
        
    }

    @Override
    public void addQuantidade(int codigo, double quantidade) throws Exception {
        try{
              get(codigo).setQuantidade(produtos.get(codigo).getQuantidade()+quantidade);
       }catch(Exception e){
           throw new Exception("Erro ao adicionar quantidade");
       }
    }

    @Override
    public void subQuantidade(int codigo, double quantidade) throws Exception {
        try{
            if(get(codigo).getQuantidade()>=quantidade){
                produtos.get(codigo).setQuantidade(produtos.get(codigo).getQuantidade()-quantidade);
            }
            else{
                throw new Exception("Quantidade insuficiente");
            }
     }catch(Exception e){
         throw new Exception("Erro ao subtrair quantidade");
     }  
    }
    public Produto get(int cod){
        for (Produto produto : produtos) {
            if(produto.getCodigo()==cod){
                return produto;
            }
        }
        return null;
    }
}
