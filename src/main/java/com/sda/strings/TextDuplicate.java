package com.sda.strings;

import java.util.Locale;

public class  TextDuplicate implements StringOperation{
    @Override
    public String modify(String text){
        return text.repeat(2);

    }
}
