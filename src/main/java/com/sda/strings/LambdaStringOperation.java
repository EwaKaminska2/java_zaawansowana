package com.sda.strings;

public class LambdaStringOperation {

    public static void main(String[] args) {

        //StringOperation toUpperCase = text->  text.toUpperCase();// lambda

        StringOperation toUpperCase = String::toUpperCase;// referencja do metody

        StringOperation myModify = LambdaStringOperation::myModify;
        System.out.println(toUpperCase.modify("Karol"));
        System.out.println(myModify.modify("karol"));
    }
    private static String myModify(String text){
        return text+"Mod";
    }
}
