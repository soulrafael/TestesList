import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class TestePredicate {
    public static void main(String[] args) {
        List <String> listaDeFrutas = Arrays.asList("Manga","Maracujá","Goiaba","Abacaxi");
        Predicate <String> frutas = nir -> nir.length()>5;
         listaDeFrutas.stream()
        //.filter(frutas)
        .filter(frutas)
        .forEach(System.out::println);
    

    }
}
