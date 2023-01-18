import java.util.Date;
import java.util.ArrayList;

public class NotaFiscal  {
int codigo = 100;
Date data;
ArrayList<Item> items = new ArrayList<Item>();
private static int codeCounter = 100;

public NotaFiscal(Date data) {
codigo = codeCounter;
this.data = data;
codeCounter++;
items = null;
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
}
