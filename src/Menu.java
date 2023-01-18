
import java.util.Scanner;
public class Menu{
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("Digite o número da opção desejada");
        System.out.println("1 - Produtos");
        System.out.println("2 - Notas Fiscais");
        int opcao = sc.nextInt();
        switch(opcao) {
            case 1:
              System.out.println("Menu de Produtos");
                System.out.println("Digite o número da opção desejada");
                System.out.println("1 - Adicionar Produto");
                System.out.println("2 - Remover Produto");
                System.out.println("3 - Listar Produtos");
                System.out.println("4 - Buscar Produto");

                break;
            case 2:
                System.out.println("Menu de Notas Fiscais");
                

                break;
        }
    }
}
