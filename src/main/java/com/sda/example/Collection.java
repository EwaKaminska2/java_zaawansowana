package com.sda.example;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class Collection {

    public static void main(String[] args) {
        String []texts = new String[]{"ala","ma","kota"};

        //LIST
        Arrays.asList(texts)
        .stream()
.filter(s->s.length()>2)
                .map(String::toUpperCase)
                .forEach(System.out::println);

        List<String > textList = new ArrayList<>();
        textList.add("ala");
        textList.add("ma");
        textList.add("kota");

        for (int i = 0; i <textList.size() ; i++) {
            System.out.println(textList.get(i));

        }
        for(String text:textList){
            System.out.println(text);
        }


        //MAP
        Map<String ,String > phoneBook = new HashMap<>();
        phoneBook.put("Karol Koltun","1234");
        phoneBook.put("Wiktoria Kaminska","5678");

        System.out.println("Before");
        System.out.println( phoneBook.get("Karol Koltun"));
        System.out.println( phoneBook.get("Wiktoria Kaminska"));

        System.out.println("After");
        phoneBook.put("Karol Koltun","9012");
        System.out.println( phoneBook.get("Karol Koltun"));
        System.out.println( phoneBook.get("Wiktoria Kaminska"));


        //SET OF ENTRIES
        Set<Map.Entry<String ,String >> entries= phoneBook.entrySet();
        for(Map.Entry<String ,String > entry: entries){
            System.out.println(entry.getKey()+" : " +entry.getValue());
        }
    }
}
