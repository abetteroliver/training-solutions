package com.wirecard.examples;

public class Java {

    public static void main(String[] args) {
        System.out.println(Util.sayHello("Joe"));

        System.out.println(Greeter.INSTANCE.sayHello("Joe"));

        Util.printList(1,10);
    }
}
