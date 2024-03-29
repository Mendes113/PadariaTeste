import java.util.Scanner;
public class MenuProdutos {
    private boolean sair = false;

    Produtos produtos = new Produtos();
 
    Menu menu = new Menu();
    public MenuProdutos(Produtos produtos){
        this.produtos = produtos;
    }
 
    Scanner sc = new Scanner(System.in);
    public void menu() throws Exception{
        do { 
        System.out.println("Menu de Produtos");
        System.out.println("Digite o número da opção desejada");
        System.out.println("1 - Cadastrar Produto");
        System.out.println("2 - Listar Produtos");
        System.out.println("3 - Editar Produto");
        System.out.println("4 - Excluir Produto");        
        System.out.println("5 - Voltar");
        int opcao = sc.nextInt();
        clearBuffer(sc);
        
        if(opcao == 5){
            sair = true;
        }
        switch(opcao){
            case 1:
                cadastrarProduto();
                break;
                case 3:
                    editarProduto();
                    break;
                    case 4:
                        removerProduto();
                        break;
                        case 5:
                         menu.menu();
                            break;
                default:
                    System.out.println("Opção inválida");

                    break;
          
        }
    }
    while(sair == false);
    }
    
    public void cadastrarProduto() throws Exception{
        System.out.println("O produto é por peso ou unidade? \n1- Peso; \n2- Unidade.");
        int opt = sc.nextInt();
        clearBuffer(sc);
        switch (opt){
            case 1:
                try {
                    System.out.println("Digite o nome do produto");
                    String nome = sc.nextLine();
              
                    System.out.println("Digite a descrição do produto");
                    String descricao = sc.nextLine();
                    
                    System.out.println("Digite a quantidade do produto");
                    double quantidade = sc.nextDouble();
                

                    System.out.println("Digite o preço do produto");
                    double preco = sc.nextDouble();
                  

                    Produto produto = new Produto(nome, descricao, quantidade, preco);
                    produtos.addProduto(produto);
                } catch (Exception e) {
                    throw new Exception("Erro ao cadastrar produto por peso");
            }
         
                

            break;
            case 2:
                
                    System.out.println("Digite o nome do produto");
                    String nome = sc.nextLine();
                    System.out.println("Digite a descrição do produto");
                    String descricao = sc.nextLine();
                    System.out.println("Digite a quantidade do produto");
                    double quantidade = sc.nextDouble();
                    System.out.println("Digite o preço do produto");
                    double preco = sc.nextDouble();
                    Produto produto = new ProdutoUnidade(nome, descricao, quantidade, preco);
                    produtos.addProduto(produto);
               
            break;


}
    

}public void removerProduto(){
    System.out.println("Digite o código do produto que deseja remover");
    int codigo = sc.nextInt();
    try {
            produtos.removeProduto(codigo);
    } catch (Exception  e) {
        // TODO Au            ated catch block
        e.printStackTrace();
}}


    public         
    void editarProduto() throws Exception{
      
        System.out.println("Digite o código do produto que deseja editar");
        int codigo = sc.nextInt();
        Produto produto = produtos.getProduto(codigo);
        System.out.println("Digite o que deseja alterar:");
        System.out.println("A - Nome; \nB - Descrição; \nC - Quantidade; \nD - Preço.");
        switch(sc.next().charAt(0)){
            case 'A': case 'a':
                clearBuffer(sc);
                editaNome(produto);
            break;
            case 'B': case 'b':
                clearBuffer(sc);
                editaDescricao(produto);
            break;
            case 'C': case 'c':
                clearBuffer(sc);
                editaQuantidade(produto);
            break;
            case 'D': case 'd':
                clearBuffer(sc);
                editaPreco(produto);
            break;
            default:
                System.out.println("Opção inválida");
            break;
        }
       
    }
    public void editaNome(Produto produto){
        System.out.println("Digite o novo nome do produto");
        String nome = sc.nextLine();
        produto.setNome(nome);
    }


    public void editaDescricao(Produto produto){
        System.out.println("Digite a nova descrição do produto");
        String descricao = sc.nextLine();
        produto.setDescricao(descricao);
    }

    public void editaQuantidade(Produto produto){
        System.out.println("Digite a nova quantidade do produto");
            double quantidade = sc.nextDouble();
        produto.setQuantidade(quantidade);
    }
    
    public void editaPreco(Produto produto){
        System.out.println("Digite o novo preço do produto");
        double preco = sc.nextDouble();
        produto.setPreco(preco);
        
    }
    private static void clearBuffer(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }
    
}