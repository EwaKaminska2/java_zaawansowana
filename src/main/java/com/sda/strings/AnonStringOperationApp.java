package com.sda.strings;

public class AnonStringOperationApp {

    public static void main(String[] args) {

        StringOperation modifyOpreation = new StringOperation() {

            private final String modification="Modified: ";
            @Override
            public String modify(String text) {
                return modification +text;
            }
        };


        StringOperation truncateText = new StringOperation() {
            @Override
            public String modify(String text) {
                if (text.length() < 5) {
                    return text;
                }
                return text.substring(0, 5);
            }
        };
        System.out.println(truncateText.modify("alan"));
        System.out.println(truncateText.modify("karol koltun"));
        System.out.println(modifyOpreation.modify("blabla"));
    }
}
