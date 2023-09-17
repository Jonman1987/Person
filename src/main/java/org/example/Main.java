package org.example;

public class Main {
    public static void main(String[] args) {
        Person evgeny = new Person("Евгений", "Андреевич", "Данилов", 35);
        System.out.println(evgeny);
        System.out.println(evgeny.calculationAge());
    }
}