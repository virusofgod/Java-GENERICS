package ru.virusofgod.sixth_example;

public class Main {
    public static void main(String[] args) {

        Account acc1 = new Account(12345, 500);
        System.out.println(acc1.getId());

        Account acc2 = new Account("124563", 5000);
        System.out.println(acc2.getId());

        int a = ((Integer)acc2.getId()) + 10;
        System.out.println(a);

    }
}
