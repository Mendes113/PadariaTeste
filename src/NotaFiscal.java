import java.util.Date;

import javax.xml.crypto.Data;

import java.util.ArrayList;

public class NotaFiscal  {
int codigo = 100;
Date data;
ArrayList<Item> items = new ArrayList<Item>();
private static int codeCounter = 100;

public NotaFiscal(Date data) {
codigo = codeCounter;

codeCounter++;
items = null;
try{   
   this.data = data;
  }
      catch(Exception e){
          throw new RuntimeException("Erro ao inserir a data");
      }

  System.out.println("Nota Fiscal criada  com sucesso! \n"+toString()+"\n");
}


public int getCodigo() {
    return codigo;
}


public Date getData() {
    return data;
}

public void setData(Date data) {
    this.data = data;
}
public void addItem(Item item) {
    items.add(item);
}
public void removeItem(Item item) {
    item.itemRemovido();
    items.remove(item);
}
public double calculaTotal() {
    double total = 0;
    for (Item item : items) {
        total += item.calculaItem();
    }
    return total;

}
public int getCodeCounter() {
    return codeCounter;
}



     @Override
     public String toString() {
        String str = " ";
        if(items != null){
            str = "Nota Fiscal [codigo=" + codigo + ", data=" + data + "";
            for (Item item : items) {
                str += item.toString();
              
            }
        }else{
            str = "Nota Fiscal [codigo=" + codigo + ", data=" + data + ", a nota fiscal ainda não possui itens]";
        } 
        
         return str;
     }
}
