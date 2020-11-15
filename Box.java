package ru.geekbrains.java3.ht1;

import java.util.ArrayList;
import java.util.Arrays;

public class Box<T extends Fruit> { // такой способ наследования подгуглил, пытался наследовать сам класс, но это не то
    private ArrayList<T> fruits;


    public Box(T... fruits) {
        this.fruits = new ArrayList<T>(Arrays.asList(fruits));
    }

    public void put(T... fruits) {
        this.fruits.addAll(Arrays.asList(fruits));
    }

    public void clear() {
        fruits.clear();
    }

    public float getBoxWeight() {
        if (fruits.size() == 0) return 0;
        float weight = 0;
        for (T item: fruits) weight += item.getFruitWeight();
        return weight;
    }

    public boolean compare(Box box) {
        return this.getBoxWeight() == box.getBoxWeight();
    }

    public void resend(Box<? super T> box) {
        box.fruits.addAll(this.fruits);
        clear();
    }
}



