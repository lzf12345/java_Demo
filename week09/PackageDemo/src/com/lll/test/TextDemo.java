package com.lll.test;

import com.lll.util.Person;

public class TextDemo {
    public static void main(String[] args) {
        Person p = new Person("小明",'男',27);

        p.drive("宾利");
        p.buyFruit("榴莲");

        p.doing(); //某人正在干嘛呢……
    }


}
