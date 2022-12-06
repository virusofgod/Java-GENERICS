package ru.virusofgod.fourth_example;

import java.util.ArrayList;
import java.util.HashMap;

public class main {
    public static void main(String[] args) {


        // ОсновнойТип<ТипПараметр>
        // ОсновнойТип<ТипПараметр, ТипПараметр2, ТипПараметр3>



        ArrayList<Integer> numbers = new ArrayList(); // сохраняет Object

        for (int i = 0; i < 10; i++) { //Сохраняет в коллекцию числа 10, 20 и. т. д. до 100
            numbers.add(i * 10);
            // numbers.add(i * 10.4f); нужно удалить быдлокод

        }

        int sum = 0;


        for (Object o : numbers) {

            sum = sum + (Integer) o;
        }
        System.out.println(sum);


    /*

      То что мы пишем в коде                               |       То как отработает компилятор
      ________________________________________________________________________________________________
      ArrayList<Integer> list = new ArrayList<Integer>();  |       ArrayList list = new ArrayList();
      ________________________________________________________________________________________________
      list.add(1);                                         |       list.add((Integer) 1);
      ________________________________________________________________________________________________
      int x = list.get(0);                                 |       int x = (Integer)list.get(0);
      ________________________________________________________________________________________________
      list.set(0, 10);                                     |        list.set(0,  (Integer)10);


     */


    }
}
