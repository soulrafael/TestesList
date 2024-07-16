import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class TesteConsumer {

    public static void main(String[] args) {
        //Definido uma class Pacote como  tipo generico que vai receber um ArrayList
        List<Pacotes> pacotes = new ArrayList<>();
Consumer <Pacotes> conteudo = conteud -> pacotes.add(1,new Pacotes("h"));



    pacotes.forEach(conteudo);
       
    }

}
