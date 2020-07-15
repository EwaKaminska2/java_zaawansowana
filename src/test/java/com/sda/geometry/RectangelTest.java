package com.sda.geometry;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangelTest {
    @Test
    void shouldGetValidArea(){
        //Given

        double x=5;
        double y=7;
        double expectedArea = 35;
        Rectangel rectangle = new Rectangel(x,y);

        //When

        double actualArea = rectangle.getArea();

        //Then
        assertEquals(expectedArea,actualArea);


    }

}