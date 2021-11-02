package com.martynenkoigor.arraylist;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MyArrayListTest {

    @Test
    public void assertLengthAsExpected() {
        MyArrayList<Integer> list = new MyArrayList<>(20);
        assertEquals(20, list.elementData.length);
    }

    @Test
    public void assertIllegalArgumentExceptionIsThrown() {
        IllegalArgumentException theException = null;

        try {
            new MyArrayList<>(-1);
        } catch (IllegalArgumentException e) {
            theException = e;
        }

        assertNotNull(theException);
    }

    @Test
    public void assertLengthEqualsTen () {
        MyArrayList<Integer> list = new MyArrayList<>();
        assertEquals(10, list.elementData.length);
    }


    @Test
    public void assertNullPointerExceptionIsThrown() {
        NullPointerException theException = null;

        try {
            new MyArrayList<>(null);
        } catch (NullPointerException e) {
            theException = e;
        }

        assertNotNull(theException);
    }

    @Test
    public void assertSimilarListCreated() {
        List<Integer> list = new ArrayList<>();
        list.add(1);

        List<Integer> myArrayList = new MyArrayList<>(list);

        Object [] expected = list.toArray();
        Object [] actual = myArrayList.toArray();
        for (int i=0; i<expected.length; i++){
            assertEquals(expected[i], actual[i]);
        }
    }
}