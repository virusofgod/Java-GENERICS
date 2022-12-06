package ru.virusofgod.seventh_example;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer();
        String[] strings = {"Tom", "Alex", "Alice", "Sam", "Kate", "Bob", "Helen"};
        Integer[] integers ={1, 52, 110, 76,123};
        printer.<String>print(strings);
        printer.<Integer>print(integers);

    }
}
