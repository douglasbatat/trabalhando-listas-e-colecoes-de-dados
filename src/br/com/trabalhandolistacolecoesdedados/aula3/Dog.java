package br.com.trabalhandolistacolecoesdedados.aula3;

public class Dog extends Animal {
    private String breed;
    private String name;
    private int age;

    public Dog(String family, String genus, String species, String  breed, String name, int age) {
        super(family, genus, species);
        this.breed = breed;
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "br.com.trabalhandolistacolecoesdedados.aula3.Dog{" +
                "breed='" + breed + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
