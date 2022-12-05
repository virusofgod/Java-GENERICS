package ru.virusofgod.first_example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Object o = new Scanner(System.in);
        //((Scanner)o).nextInt();
        Scanner scanner = null;
        if (o instanceof Scanner) {
            scanner = ((Scanner) o);
        }
        System.out.println("Введите число");
        if (scanner != null){
            scanner.nextInt();

        }


    }
}
