package ru.virusofgod.third_example;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {

        ArrayList numbers = new ArrayList(); // сохраняет Object

        for (int i = 0; i < 10; i++) { //Сохраняет в коллекцию числа 10, 20 и. т. д. до 100
            numbers.add(i * 10);
            numbers.add(i * 10.4f);

        }

        int sum = 0;

        // numbers.add(i * 10.4f) // сторонний разработчик привносит свою ошибочную логику
        for (Object o : numbers) {
           // if(o instanceof Integer) // без этой ошибки произойдет ошибка class exception
            sum = sum + (Integer) o;
        }
        System.out.println(sum);
    }
}
