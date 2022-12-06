package ru.virusofgod.fifth_example;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        // ОсновнойТип<ТипПараметр>
        // ОсновнойТип<ТипПараметр, ТипПараметр2, ТипПараметр3>

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

        HashMap<Integer, String> map =new HashMap<Integer, String>();
        map.put(7, "Привет");
        map.put(15, "Hellow");

        ArrayList<String> listHellow = new ArrayList<>();
        ArrayList<String> listBie = new ArrayList<>();
        listHellow.add("Привет");
        listHellow.add("HI");
        listBie.add("Пока");
        listBie.add("Goodbie");

        ArrayList<ArrayList<String>> list = new ArrayList();
        list.add(listHellow);
        list.add(listBie);
    }
}
