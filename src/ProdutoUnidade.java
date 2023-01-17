public class ProdutoUnidade extends Produto {
    public ProdutoUnidade(int codigo, String nome, String descricao, double quantidade, double preco){
        super(codigo, nome, descricao, quantidade, preco);
        try{
            this.quantidade = (int) quantidade;
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        try {
            if (quantidade < 0) {
                throw new Exception("Quantidade inválida");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());//mexer
        }
    }
}
