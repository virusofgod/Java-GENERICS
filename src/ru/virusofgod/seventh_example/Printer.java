package ru.virusofgod.seventh_example;

public class Printer {
public <T extends Object> void print(T[] items){
        for( T item : items){
            System.out.println(item);
        }
}
}
