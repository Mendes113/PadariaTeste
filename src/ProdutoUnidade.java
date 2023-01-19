
public class ProdutoUnidade extends Produto {
    public ProdutoUnidade(String nome, String descricao, double quantidade, double preco) {
        super(nome, descricao, quantidade, preco);
        try{
            int var1 = (int) quantidade;
        }catch(RuntimeException e){
           throw new RuntimeException("Quantidade não é um número inteiro");
        }
        try {
            if (quantidade < 0) {
                throw new Exception("Quantidade inválida");
            }
        } catch (Exception e) {
          throw new RuntimeException("");
        }
    }
    public boolean testaInt(double quantidade){
        try{
            int var1 = (int) quantidade;
            if (quantidade > 0) {
                return true;
            }else {
                return false;
            }
        }catch(RuntimeException e){
            return false;
        }
    }
    public String toString(){
        return "Produto Unidade: "+super.toString();
    }
}
