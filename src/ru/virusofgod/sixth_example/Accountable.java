package ru.virusofgod.sixth_example;

public interface Accountable<T> {

    T getId();
    void setId(T id);
    void setSum(int sum);
    int getSum();


}
