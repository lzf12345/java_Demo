package com.lll.util;

public class Person {
    private String name;
    private char sex;
    private int age;

    private Car car;
    private Fruit fruit;

    public Person(String name, char sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public void drive(String carType){
        this.car = new Car(carType);
    }
    public void buyFruit(String fruitName){
        this.fruit = new Fruit(fruitName);
    }

    public void doing(){
        System.out.printf("我叫%s,%c,今年%d岁！\n",name,sex,age);
        System.out.println(name+"开着"+car.type+"买"+fruit.name);
    }
}
