package com.martynenkoigor.arraylist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;


class ArrayListTest {

    private ArrayList<Integer> list;

    @BeforeEach
    public void setup() {
        list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
    }

    @Test
    void testAdd() {
        list.add(70);

        assertEquals(70,list.get(list.size()-1));
    }

    @Test
    void testAddMoreThanInitialCapacity() {
        list.add(8);
        list.add(9);
        list.add(10);
        list.add(11);

        assertEquals(11, list.size());
    }

    @Test
    void testAddByIndex() {
        list.add(4, 70);

        assertEquals(70, list.get(4));
    }

    @Test
    void testSet() {
        list.set(4, 70);

        assertEquals(70, list.get(4));
    }

    @Test
    void setShouldThrowException() {
        assertThrows(IndexOutOfBoundsException.class, () -> list.set(10, 70));
    }

    @Test
    void testRemoveObject() {
        String expected = "[1, 2, 3, 4, 5]";

        list.remove((Integer) 6);
        list.remove((Integer) 7);

        assertEquals(expected, Arrays.toString(list.toArray()));
    }

    @Test
    void testRemoveByIndex() {
        String expected = "[1, 2, 3, 4, 5, 6]";

        list.remove( 6);

        assertEquals(expected, Arrays.toString(list.toArray()));
    }

    @Test
    void removeShouldReturnObject() {
        assertEquals(6, list.remove(5));
    }

    @Test
    void removeShouldThrowException(){
     assertThrows(IndexOutOfBoundsException.class, () -> list.remove(100));
    }

    @Test
    void testGet(){
        assertEquals(1, list.get(0));
    }

    @Test
    void getShouldThrowException() {
        assertThrows(IndexOutOfBoundsException.class, () -> list.get(100));
    }

    @Test
    void testIndexOf() {
        assertEquals(0, list.indexOf(1));
    }

    @Test
    void indexOfNoSuchElement() {
        assertEquals(-1, list.indexOf(70));
    }

    @Test
    void testLastIndexOf() {
        assertEquals(4, list.lastIndexOf(5));
    }

    @Test
    void lastIndexOfNoSuchElement() {
        assertEquals(-1, list.indexOf(70));
    }

    @Test
    void clear() {
        list.clear();

        assertEquals(0, list.size());
    }

    @Test
    void testAddAll() {
        String expected = "[1, 2, 3, 4, 5, 6, 7, 70, 70, 70, 70]";

        ArrayList arrayList = new ArrayList();
        arrayList.add(70);
        arrayList.add(70);
        arrayList.add(70);
        arrayList.add(70);

        list.addAll(arrayList);

        assertEquals(expected, Arrays.toString(list.toArray()));
    }

    @Test
    void testAddAllByIndex() {
        String expected = "[1, 2, 3, 70, 70, 70, 70, 4, 5, 6, 7]";

        ArrayList arrayList = new ArrayList();
        arrayList.add(70);
        arrayList.add(70);
        arrayList.add(70);
        arrayList.add(70);

        list.addAll(3, arrayList);

        assertEquals(expected, Arrays.toString(list.toArray()));
    }

    @Test
    void testContains() {
        assertTrue(list.contains(5));
    }

    @Test
    void testIsEmpty() {
        list = new ArrayList();

        assertTrue(list.isEmpty());
    }

    @Test
    void testToArray() {
        String expected = "[1, 2, 3, 4, 5, 6, 7]";

        assertEquals(expected, Arrays.toString(list.toArray()));
    }

    @Test
    void iterator() {
    }

    @Test
    void listIterator() {
    }

}