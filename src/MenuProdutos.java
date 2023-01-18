import java.util.Scanner;
public class MenuProdutos {
    private boolean sair = false;

    Produtos produtos = new Produtos();

    public MenuProdutos(Produtos produtos){
        this.produtos = produtos;
    }
 
    Scanner sc = new Scanner(System.in);
    public void menu(){
        do { 
        System.out.println("Menu de Produtos");
        System.out.println("Digite o número da opção desejada");
        System.out.println("1 - Cadastrar Produto");
        int opcao = sc.nextInt();
        System.out.println("2 - Listar Produtos");
        System.out.println("3 - Editar Produto");
        opcao = sc.nextInt();
        System.out.println("4 - Excluir Produto");
        System.out.println("5 - Voltar");
        int voltar = sc.nextInt();
        if(voltar == 5){
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
                            sair = true;
                            break;
                default:
                    System.out.println("Opção inválida");

                    break;
          
        }
    }
    while(sair == false);
    }
    
    public void cadastrarProduto(){
        try {
      
        System.out.println("Digite o nome do produto");
        String nome = sc.nextLine();
        System.out.println("Digite a descrição do produto");
        String descricao = sc.nextLine();
        System.out.println("Digite a quantidade do produto");
        double quantidade = sc.nextDouble();
        System.out.println("Digite o preço do produto");
        double preco = sc.nextDouble();
        System.out.print("Digite o codigo do produto");
        int codigo = sc.nextInt();
        Produto produto = new Produto(codigo,nome, descricao, quantidade, preco);
       
            produtos.addProduto(produto);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }


    public void removerProduto(){
        System.out.println("Digite o código do produto que deseja remover");
        int codigo = sc.nextInt();
        try {
            produtos.removeProduto(codigo);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
    }
}


    public void editarProduto(){
      
        System.out.println("Digite o código do produto que deseja editar");
        int codigo = sc.nextInt();
        try {
            Produto produto = produtos.getProduto(codigo);
            System.out.println("Digite o novo nome do produto");
            String nome = sc.nextLine();
            System.out.println("Digite a nova descrição do produto");
            String descricao = sc.nextLine();
            System.out.println("Digite a nova quantidade do produto");
            double quantidade = sc.nextDouble();
            System.out.println("Digite o novo preço do produto");
            double preco = sc.nextDouble();
            produto.setNome(nome);
            produto.setDescricao(descricao);
            produto.setQuantidade(quantidade);
            produto.setPreco(preco);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
}
    }
}