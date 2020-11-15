package ru.geekbrains.java3.ht1;

import java.util.ArrayList;
import java.util.Arrays;

public class ht1 {

    public static void main(String[] args){

   //Задача 1. Меняем 2 элемента местами

        String[] strings = new String[2];

        strings[0] = "firstElement";
        strings[1] = "secondElement";

        resend(strings, 0, 1);
       // проверка
        System.out.println(Arrays.deepToString(strings));

        // Задача 2 массив в коллекцию эррейлист

        ArrayList<String> arrayList = toArrayList(strings);
        //проверка
         System.out.println(arrayList.toString());

         // задача 3 проверка
        //создаем яблочки
        Apple f1 = new Apple();
        Apple f2 = new Apple();
        //создаем апельсины
        Orange f3 = new Orange();
        Orange f4 = new Orange();
        Orange f5 = new Orange();

        Box<Apple> appleBox = new Box<>(f1, f2); //создаем коробку с яблоками
        Box<Orange> orangeBox = new Box<>(f3, f4, f5); //создаем коробку с апельсинами
        //создаем дополнительную коробку с яблоками, в нее потом будем пересыпать
        Box<Apple> appleBox2 = new Box<>();

        //сравниваем 2 коробки
        System.out.println(appleBox.compare(orangeBox));
        //пересыпаем из одной коробки в другую
        appleBox.resend(appleBox2);
    }
//метод по задаче 1
    public static void resend(Object[] array, int item1, int item2) {
        Object temp = array[item1];
        array[item1] = array[item2];
        array[item2] = temp;
    }

    //метод по задаче 2
    public static <T> ArrayList<T> toArrayList(T[] array) {
        return new ArrayList<T>(Arrays.asList(array));
    }
}
