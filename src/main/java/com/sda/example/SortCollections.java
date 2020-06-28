package com.sda.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.*;

public class SortCollections {
    public static void main(String[] args) {


        List<String> texts = Arrays.asList("Ala", "10a", "Ko", "ma11");
        System.out.println(texts);
Collections.sort(texts);

        System.out.println(texts);

       // List<String> texts1 = List.of("Ala", "10a", "Ko", "ma11");

        System.out.println(texts);
        texts.sort(null);
        System.out.println(texts);
        int[] number = new int[]{1, 5, 9, 11, 2};
    }
}
