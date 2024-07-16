import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test2List {
    List<String> listaPessoas = new ArrayList<>();
    Scanner entrada = new Scanner(System.in);
public static void main(String[] args) {
    Test2List pessoa= new Test2List();
    pessoa.adicionarPessoa();
    pessoa.adicionarPessoa(); 


}
    public void adicionarPessoa(){
        String n;
        n = entrada.nextLine();
        listaPessoas.add(n);
        System.out.println(listaPessoas);

    }
}
