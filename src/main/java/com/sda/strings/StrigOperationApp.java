package com.sda.strings;

public class StrigOperationApp {

    public static void main(String[] args) {
       UpperCase textUpperCase = new UpperCase();
       String before = "karol";
       String after = textUpperCase.modify(before);

        System.out.println(
                String.format("Before:%s;after:%s",before,after));

        System.out.println();
        StringOperation stringOperation= new UpperCase();
        System.out.println(stringOperation.modify("karol"));

        stringOperation=new TextDuplicate();
        System.out.println(stringOperation.modify("karol"));


       // System.out.println(printBeforeAndAfter("karol",));
    }

    public static void printBeforeAndAfter(String text,StringOperation operation){
        String modified = operation.modify(text);
        String message = String.format("Before:[%s];after:[%s]",text,modified);
        System.out.println(message);
    }
}
