import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {

    Pessoa pessoa1 = new Pessoa("Douglas", 39);
    Pessoa pessoa2 = new Pessoa("Talita", 35);
    Pessoa pessoa3 = new Pessoa("Ana Luiza", 6);

    ArrayList<Pessoa> listaDePessoa = new ArrayList<>();
    listaDePessoa.add(pessoa1);
    listaDePessoa.add(pessoa2);
    listaDePessoa.add(pessoa3);

    System.out.println(listaDePessoa.size());
    System.out.println(listaDePessoa.get(0));
    System.out.println(listaDePessoa);

    //Código com a revisão da IA

    var pessoa4 = new Pessoa("João", 28);
    var pessoa5 = new Pessoa("Maria", 32);
    var pessoa6 = new Pessoa("Pedro", 25);

    List<Pessoa> pessoas = new ArrayList<>(List.of(pessoa4, pessoa5, pessoa6));

    System.out.println("Número de pessoas na lista: " + pessoas.size());
    System.out.println("Primeira pessoa na lista: " + pessoas.get(0));
    pessoas.forEach(System.out::println);



    }
}
