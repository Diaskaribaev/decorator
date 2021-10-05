package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("---------Nutty ice cream-----------");
        Icecream icecream = new NuttyDecorator(new Simpleicecream());
        System.out.println(icecream.makeIcecream());

        System.out.println("----------------------------------");
        System.out.println("---------Honey ice cream-----------");


        Icecream icecream1 = new HoneyDecorator(new Simpleicecream());
        System.out.println(icecream1.makeIcecream());

    }
}
