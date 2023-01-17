

public class App {
    public static void main(String[] args) throws Exception {
        Produtos produtos = new Produtos();
        NotasFiscais notasFiscais = new NotasFiscais();
       
        ProdutoPeso p1 = new ProdutoPeso(1, "Arroz", "Arroz 1kg", 5.00);
        ProdutoPeso p2 = new ProdutoPeso(2, "Feijão", "Feijão 1kg", 6.00);
        System.out.println(p1.getPrecoKG());
        
    }
}
