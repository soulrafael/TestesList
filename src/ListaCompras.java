import java.util.ArrayList;
import java.util.List;


public class ListaCompras {
    List <Compras> itens= new ArrayList<>();


    public void adicionaItem(String listaDeCompras){
        itens.add(new Compras(listaDeCompras));
        System.out.println(itens.size());
        System.out.println(itens);
    }
    public void removerItem(String listaDeCompras){
        itens.remove(2);
        System.out.println(itens);
        
    }


    public static void main(String[] args)  {
        ListaCompras novoItem = new ListaCompras();
            novoItem.adicionaItem("Salada");
            novoItem.adicionaItem("Manga");
            novoItem.adicionaItem("Arroz");
            novoItem.removerItem("Salada");


    }
}
