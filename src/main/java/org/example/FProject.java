package org.example;

import java.util.HashMap;
import java.util.HashSet;
import java.util.HashMap;

//Разработать программу, имитирующую поведение коллекции HashSet.
// В программе содать метод add добавляющий элемент,
// и метод позволяющий выводить эллементы коллекции в консоль.
// Формат данных Integer.
public class FProject{
    private static HashMap<Integer, Object> hhashMap = new HashMap<>();
    private static final Object OBJECT = new Object();
    public static void main (String[] args){
        add(65);
        add(5);
        add(75);
        add(225);
        add(789);
        add(56);
        System.out.println(hhashMap);
        System.out.println(hhashMap.keySet());
    }
    public static void add(Integer numbers){
        hhashMap.put(numbers, OBJECT);
    }




}
