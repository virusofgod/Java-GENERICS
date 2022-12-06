package ru.virusofgod.sixth_example;

public class Account<T> implements Accountable<T>{

    private T id;
    private int sum;

    public Account(T id, int sum) {
        this.id = id;
        this.sum = sum;
    }

    public T getId() {
        return id;
    }

    public int getSum() {
        return sum;
    }

    public void setId(T id) {
        this.id = id;

    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}
