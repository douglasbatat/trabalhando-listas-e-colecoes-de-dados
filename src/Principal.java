import br.com.trabalhandolistacolecoesdedados.aula2.PerishableProduct;
import br.com.trabalhandolistacolecoesdedados.aula1.Pessoa;
import br.com.trabalhandolistacolecoesdedados.aula2.Product;
import br.com.trabalhandolistacolecoesdedados.aula3.*;
import br.com.trabalhandolistacolecoesdedados.aula4.Title;

import java.util.*;

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

        //Aula 03: Lista de objetos distintos

        ////Exercício 1
        List<String> listStrings = new ArrayList<>();
        listStrings.add("Cachorro");
        listStrings.add("Gato");
        listStrings.add("Papagaio");
        System.out.println("\nImprimendo resultado do exercício da aula 3\n");
        System.out.println("Resultado do Exercício 1\n");
        listStrings.forEach(System.out::println);

        ////Exercício 2 e 3
        Animal myPet1 = new Dog("Canidea", "Canis", "Canis lupus", "Poodle", "Bolinha", 14);
        Animal myPet2 = new Cat("Felidae", "Felis", "Felis catus", "Siamese", "Mia", 3);

        System.out.println("\nResultado do Exercício 2 e 3\n");
        if (myPet2 instanceof Dog) {
            var dog = (Dog) myPet2;
        } else {
            System.out.println("Não é um cachorro");
        }

        ////Exercício 4
        double sumPrices = 0;
        for (Product product : products) {
            sumPrices += product.getPrice();
        }

        double midiumPrice = sumPrices / products.size();
        System.out.println("\nResultado do Exercício 4\n");
        System.out.println("Preço médio dos produtos: " + midiumPrice);

        ////Exercício 5
        var form1 = new Circle(5);
        var form2 = new Square(4, 4);
        var form3 = new Square(3, 3);
        var form4 = new Circle(10);

        List<Form> forms = new ArrayList<>(List.of(form1, form2, form3, form4));
        System.out.println("\nResultado do Exercício 5\n");
        for (Form form : forms) {
            System.out.println("Area calculada. " + form.calcularArea());
        }

        ////Exercício 6
        System.out.println("\nResultado do Exercício 6\n");

        var account1 = new BankAccount( 123586, 1500.0);
        var account2 = new BankAccount( 965874, 2500.0);
        var account3 = new BankAccount( 315698, 500.0);

        List<BankAccount> accounts = new ArrayList<>(List.of(account1, account2, account3));

        Optional<BankAccount> accountWithHighestBalance = accounts.stream().max(Comparator.comparingDouble(BankAccount::getBalance));
        accountWithHighestBalance.ifPresent(account ->
                System.out.println("Conta com maior saldo: " + account)
        );

        //Aula 04: Lista de objetos distintos

        ////Exercício 1
        System.out.println("\nResultado do exercício da aula 4\n");
        System.out.println("Resultado do exercício 1\n");
        List<Integer> numbers = new ArrayList<>(List.of(5, 10, 3, 8, 1, 7));
        numbers.sort(null);
        System.out.println("Números ordenados: " + numbers);

        ////Exercício 2, 3, 4 e 5
        System.out.println("\nResultado do exercício 2, 3, 4 e 5\n");

        List<Title> booksList;

        booksList = new ArrayList<>(List.of(
                new Title("Senhor dos Anéis: A Sociedade do Anel"),
                new Title("Game of Thrones: A Fúria dos Reis"),
                new Title("Harry Potter - A Pedra Filosofal"),
                new Title("O Hobbit"),
                new Title("As Crônicas de Nárnia: O Leão, a Feitice e o Guarda-Roupa")
        ));

        System.out.println("Lista de livros juvenil:\n");
        Title.orderAndPrint("ArrayList", booksList);

        booksList = new LinkedList<>(List.of(
                new Title("Chapelzinho Vermelho"),
                new Title("Branca de Neve"),
                new Title("Cinderela"),
                new Title("A Bela Adormecida"),
                new Title("A Pequena Sereia")
        ));

        System.out.println("\nLista de livros infantil:\n");
        Title.orderAndPrint("LinkedList", booksList);

    }
}

