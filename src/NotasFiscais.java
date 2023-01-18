/**
 * This class implements the interface INotasFiscais and has the methods addNotaFiscal,
 * removeNotaFiscal, getNotaFiscal, getTotal, addItem and removeItem
 */
import java.util.ArrayList;

public class NotasFiscais implements INotasFiscais {

     ArrayList<NotaFiscal> notasFiscais = new ArrayList<NotaFiscal>();
     

    @Override
    public void addNotaFiscal(NotaFiscal nf) throws Exception {
       notasFiscais.add(nf);
        
    }

    @Override
    public void removeNotaFiscal(int codigo) throws Exception {
        notasFiscais.remove(getNotaFiscal(codigo));
        
    }

    @Override
    public NotaFiscal getNotaFiscal(int codigo) throws Exception {
       try {
              for (NotaFiscal nf : notasFiscais) {
                   if (nf.getCodigo() == codigo) {
                        return nf;
                   }
              }
         } catch (Exception e) {
              throw new Exception("Nota Fiscal não encontrada");
       }
       
        throw new Exception("Erro ao buscar nota fiscal");
    }
 
    @Override
    public double getTotal(int codigo) throws Exception {
        try {
            return getNotaFiscal(codigo).calculaTotal();
        } catch (Exception e) {
            throw new Exception("Erro ao calcular total");
        }
        
    }

    @Override
    public void addItem(int codigo, Item item) throws Exception {
        getNotaFiscal(codigo).addItem(item);
    }

    @Override
    public void removeItem(int codigo, Item item) throws Exception {
        getNotaFiscal(codigo).removeItem(item);        
    }
}


