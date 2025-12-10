import br.com.trabalhandolistacolecoesdedados.aula2.PerishableProduct;
import br.com.trabalhandolistacolecoesdedados.aula1.Pessoa;
import br.com.trabalhandolistacolecoesdedados.aula2.Product;
import br.com.trabalhandolistacolecoesdedados.aula3.*;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {

    //Aula 01: Coleção de filmes

        Pessoa pessoa1 = new Pessoa("Douglas", 39);
        Pessoa pessoa2 = new Pessoa("Talita", 35);
        Pessoa pessoa3 = new Pessoa("Ana Luiza", 6);

        ArrayList<Pessoa> listaDePessoa = new ArrayList<>();
        listaDePessoa.add(pessoa1);
        listaDePessoa.add(pessoa2);
        listaDePessoa.add(pessoa3);
        System.out.println("Imprimendo resultado do exercício da aula 1");
        System.out.println("\n" + listaDePessoa.size());
        System.out.println(listaDePessoa.get(0));
        System.out.println(listaDePessoa);

    ////Aula 01: Código revisado pela IA

        var pessoa4 = new Pessoa("João", 28);
        var pessoa5 = new Pessoa("Maria", 32);
        var pessoa6 = new Pessoa("Pedro", 25);

        List<Pessoa> pessoas = new ArrayList<>(List.of(pessoa4, pessoa5, pessoa6));

        System.out.println("\nImprimendo resultado do exercício da aula 1 revisado pela IA");
        System.out.println("\n" + "Número de pessoas na lista: " + pessoas.size());
        System.out.println("Primeira pessoa na lista: " + pessoas.get(0));
        pessoas.forEach(System.out::println);

    //Aula 02: Construindo objetos

        var product1 = new Product("Caneta", 2.5, 100);
        var product2 = new Product("Caderno", 15.0, 50);
        var product3 = new Product("Mochila", 120.0, 20);
        var perishableProduct = new PerishableProduct("Café", 38.0, 30, 2026-06-30);

        List<Product> products = new ArrayList<>(List.of(product1, product2, product3));
        System.out.println("\nImprimendo resultado do exercício da aula 2\n");
        System.out.println("Tamanho da lista: " + products.size());
        System.out.println("Primeiro produto: " + products.get(0));
        System.out.println(products);
        System.out.println(perishableProduct);



    }
}
