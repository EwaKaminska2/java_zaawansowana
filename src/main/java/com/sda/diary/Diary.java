package com.sda.diary;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Diary {


    private List<Entry> entries = new ArrayList<>();

    private class Entry {
        String text;
        LocalDate data;
    }

    public void writeEntry(String text){
        Entry entry=new Entry();
        entry.text=text;
        entry.data=LocalDate.now();
        entries.add(entry);
    };

   // public List<String > getEntriesFrom(LocalDate date){};

    private class EntryPrinter{
        void print(){
            for(Entry entry:entries){
                System.out.println(entry.text);
            }
        }
    }
}
