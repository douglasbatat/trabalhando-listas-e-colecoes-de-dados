import java.util.ArrayList;

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

    }
}
