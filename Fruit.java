package ru.geekbrains.java3.ht1;

public abstract class Fruit {
    private float fruitWeight;

    public Fruit(float fruitWeight) {
        this.fruitWeight = fruitWeight;
    }

    public float getFruitWeight() {
        return fruitWeight;
    }

    public void setFruitWeight(float fruitWeight) {
        this.fruitWeight = fruitWeight;
    }
}

