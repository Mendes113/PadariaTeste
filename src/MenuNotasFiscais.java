import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.text.ParseException;
public class MenuNotasFiscais {
    Scanner sc = new Scanner(System.in);

    Produtos produtos = new Produtos();
    NotasFiscais notasFiscais = new NotasFiscais();

    public MenuNotasFiscais (Produtos produtos, NotasFiscais notasFiscais){
        this.produtos = produtos;
        this.notasFiscais = notasFiscais;
    }
    public void menu() throws Exception{

        System.out.println("Menu de Notas Fiscais");
        System.out.println("Digite o número da opção desejada");
        System.out.println("1 - Cadastrar Nota Fiscal");
        System.out.println("2 - Listar Notas Fiscais");
        System.out.println("3 - Editar Nota Fiscal");
        System.out.println("4 - Excluir Nota Fiscal");
        switch(sc.nextInt()){
            case 1:
                 cadastrarNotaFiscal();
                break;
                case 2:
                    listarNotasFiscais();
                    break;
                    case 3:
                        editarNotaFiscal();
                        break;
                        case 4:
                            removerNotaFiscal();
                            break;
                            default:
                                System.out.println("Opção inválida");
                                break;
        }
        

           

    }

    public void cadastrarNotaFiscal() throws Exception{

        System.out.println("Digite a data");
        String dateTest = sc.next();
        try{
            Date data = new SimpleDateFormat("dd/MM/yyyy").parse(dateTest);
            notasFiscais.addNotaFiscal(new NotaFiscal(data));
        }catch(ParseException e){
            System.out.println("Data incorreta");
        }
        System.out.println("Deseja adicionar um item? (S/N)");
        char rep = sc.next().charAt(0);
        clearBuffer(sc);

        if(rep == 'S' || rep == 's'){
            System.out.println("Digite o código do produto");
            int codigo = sc.nextInt();
            System.out.println("Digite a quantidade");
            int quantidade = sc.nextInt();
            Item item = new Item(produtos.getProduto(codigo), quantidade);
            notasFiscais.getNotaFiscalAtual().addItem(item);
        }
                  
    }
    public void listarNotasFiscais(){
                
    }
    public void editarNotaFiscal(){
                
    }
    public void removerNotaFiscal(){
                
    }
    private static void clearBuffer(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }
}
