
import java.util.Scanner;
public class Menu{
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);
        Produtos produtos = new Produtos();
        System.out.println("Menu");
        System.out.println("Digite o número da opção desejada");
        System.out.println("1 - Produtos");
        System.out.println("2 - Notas Fiscais");
        int opcao = sc.nextInt();
        switch(opcao) {
            case 1:
              System.out.println("Menu de Produtos");
                MenuProdutos menuProdutos = new MenuProdutos(produtos);
                menuProdutos.menu();
             
                break;
            case 2:
                System.out.println("Menu de Notas Fiscais");
                

                break;
        }
    }
}
