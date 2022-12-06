package ru.virusofgod.sixth_example;

public class Account {

    private Object id;
    private int sum;

    public Account(Object id, int sum) {
        this.id = id;
        this.sum = sum;
    }

    public Object getId() {
        return id;
    }

    public int getSum() {
        return sum;
    }

    public void setId(Object id) {
        this.id = id;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}
