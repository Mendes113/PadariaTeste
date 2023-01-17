public class Peso extends Produto{
    private double precoG;
   

   

    public Peso(int codigo, String nome, String descricao, double precoG ) {
        super(codigo, nome, descricao);
        this.precoG = precoG;
       
        
    }
    
    public double getPrecoG() {
        return precoG;
    }

    public void setPrecoG(double precoG) {
        this.precoG = precoG;
    }

    public double getPrecoKG() {
        return precoG * 1000;
    }
    
   
}
