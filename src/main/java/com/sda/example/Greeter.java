package com.sda.example;

public class Greeter {

    public static void main(String[] args) {
        Greeter greeter=new Greeter();
        greeter.greet();
        greeter.greet("Ola");
        greeter.greet("hej","Wiktoria");

    }

    void greet(){
        //System.out.println("Hello word!");
        greet("World");
    }
    void greet( String name){
       // System.out.println("Hello "+name);
        greet("Hello",name);
    }
    void greet(String greeting, String name){
        String massage=String.format("%s,%s",greeting,name);
        System.out.println(massage);
    }

}
