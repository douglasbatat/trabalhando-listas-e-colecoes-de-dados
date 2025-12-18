package br.com.trabalhandolistacolecoesdedados.aula4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Title implements Comparable<Title> {
    private String name;

    public Title(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Title t) {
        return this.name.compareTo(t.name);
    }

    public String getName() {
        return name;
    }

    public static void orderAndPrint(String structureType, List<Title> list) {
        list.sort(Comparator.comparing(Title::getName));
        list.forEach(livro -> System.out.println(livro.getName()));

    }
}
