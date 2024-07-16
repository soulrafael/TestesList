import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class TesteSupplier {
    public static void main(String[] args) {
        Supplier <String> saudacao = () -> "Teste";
        List <String> listaDeSaudacao = Stream.generate(saudacao)
        .limit(4)
        .toList();
        listaDeSaudacao.forEach(n->System.out.println(n));
    }
}
