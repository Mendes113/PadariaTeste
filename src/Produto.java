import java.util.Date;

public class Produto  {
    private int codigo;
    private String nome;
    private String descricao;
    private double quantidade;
    private double preco;
    public int codeCounter = 1;

  

    public Produto(String nome, String descricao, double quantidade, double preco) {
        codigo = codeCounter;
        codeCounter++;
        this.nome = nome;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.preco = preco;
        System.out.println("Produto criado com sucesso! \n"+toString()+"\n");
    }

    /**
     * This function returns the value of the variable codigo
     * 
     * @return The value of the variable codigo.
     */
    public int getCodigo() {
        return codigo;
    }
/**
 * This function returns the name of the person
 * 
 * @return The name of the person.
 */
/**
 * This function returns the value of the variable nome
 * 
 * @return The name of the person.
 */

    public String getNome() {
        return nome;
    }

    /**
     * // Java
     * public void setNome(String nome) {
     *         this.nome = nome;
     *     }
     * 
     * @param nome name of the person
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
/**
 * This function returns the description of the object
 * 
 * @return The description of the product.
 */

    public String getDescricao() {
        return descricao;
    }

   /**
    * This function sets the description of the object
    * 
    * @param descricao String
    */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    

    /**
     * @return double return the quantidade
     */
    public double getQuantidade() {
        return quantidade;
    }

    /**
     * @param quantidade the quantidade to set
     */
    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * @return double return the preco
     */
    public double getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public String toString(){
        String s = "Codigo: " + codigo + " Nome: " + nome + " Descrição: " + descricao + " Quantidade: " + quantidade + " Preço: " + preco;
        return s;
    }
}
