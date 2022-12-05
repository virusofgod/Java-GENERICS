package ru.virusofgod.second_example;

public class Main {
    public static void main(String[] args) {
        Object[]  objects = {10, "Привет", 3.14};// Здесь происходит автоупаковка
        for(Object o : objects){
            if(o instanceof String){
                String s = (String) o;
                System.out.println(s);
            }

        }
    }
}
