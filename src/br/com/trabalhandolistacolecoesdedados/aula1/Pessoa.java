package br.com.trabalhandolistacolecoesdedados.aula1;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String toString() {
        return "br.com.trabalhandolistacolecoesdedados.aula1.Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
