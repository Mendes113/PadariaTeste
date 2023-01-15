package Bebida;

import java.util.List;

public class CocaCola   extends Bebida {


    public static char[] ingredients;
	public CocaCola(float preco, String description, int quantity, List<String> ingredientes, double calories) {
        super(preco, description, quantity, ingredientes, calories);
        //TODO Auto-generated constructor stub
    }
    public void ingredientes(){
   



    }

    public String toString(){
       
        for (int i = 0; i < ingredientes.size(); i++) {
            System.out.println(ingredientes.get(i));
        }

        return ingredientes.toString();
    }

}
