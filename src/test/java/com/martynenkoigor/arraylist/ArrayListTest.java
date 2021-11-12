package com.martynenkoigor.arraylist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;

import static org.junit.jupiter.api.Assertions.*;


class ArrayListTest {

    private ArrayList<Integer> list;

    @BeforeEach
    public void setup() {
        list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
    }

    /**
     * Appends the specified element to the end of this list.
     * Params:
     * e – element to be appended to this list
     * Returns:
     * true (as specified by Collection.add)
     */
    @Test
    void testAdd() {
        assertTrue(list.add(70));

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

    /**
     * Inserts the specified element at the specified position in this list. Shifts the element currently at that position (if any) and any subsequent elements to the right (adds one to their indices).
     * Params:
     * index – index at which the specified element is to be inserted
     * element – element to be inserted
     * Throws:
     * IndexOutOfBoundsException –
     */
    @Test
    void testAddByIndex() {
        assertEquals(7, list.size());

        list.add(4, 70);

        assertEquals(8, list.size());
        assertEquals(70, list.get(4));
    }

    @Test
    void addByIndexShouldThrowException() {
        assertThrows(IndexOutOfBoundsException.class, () -> list.add(100, 70));
    }

    /**
     * Replaces the element at the specified position in this list with the specified element.
     * Params:
     * index – index of the element to replace
     * element – element to be stored at the specified position
     * Returns:
     * the element previously at the specified position
     * Throws:
     * IndexOutOfBoundsException –
     */
    @Test
    void testSet() {
        assertEquals(7, list.size());
        assertEquals(1, list.set(0, 70));

        assertEquals(7, list.size());
        assertEquals(70, list.get(0));
    }

    @Test
    void setShouldThrowException() {
        assertThrows(IndexOutOfBoundsException.class, () -> list.set(10, 70));
    }

    /**
     * Removes the element at the specified position in this list. Shifts any subsequent elements to the left (subtracts one from their indices).
     * Params:
     * index – the index of the element to be removed
     * Returns:
     * the element that was removed from the list
     * Throws:
     * IndexOutOfBoundsException –
     */
    @Test
    void testRemoveByIndex() {
        Integer[] expected = {1, 2, 3, 4, 5, 6};

        assertEquals(7, list.size());

        assertEquals(7, list.remove( 6));

        assertEquals(6, list.size());

        assertArrayEquals(expected, list.toArray());
    }

    @Test
    void removeShouldThrowException(){
        assertThrows(IndexOutOfBoundsException.class, () -> list.remove(100));
    }

    /**
     * Returns the element at the specified position in this list.
     * Params:
     * index – index of the element to return
     * Returns:
     * the element at the specified position in this list
     * Throws:
     * IndexOutOfBoundsException –
     */
    @Test
    void testGet(){
        assertEquals(1, list.get(0));
    }

    @Test
    void getShouldThrowException() {
        assertThrows(IndexOutOfBoundsException.class, () -> list.get(100));
    }

    /*@Test
    void testRemoveObject() {
        Integer[] expected = {1, 2, 3, 4, 5};

        list.remove((Integer) 6);
        list.remove((Integer) 7);

        assertArrayEquals(expected, list.toArray());
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
        Integer[] expected = {1, 2, 3, 4, 5, 6, 7, 70, 70, 70, 70};

        ArrayList<Integer> arrayList = new ArrayList(Arrays.asList(70, 70, 70, 70));

        list.addAll(arrayList);

        assertArrayEquals(expected, list.toArray());
    }

    @Test
    void testAddAllByIndex() {
        Integer[] expected = {1, 2, 3, 70, 70, 70, 70, 4, 5, 6, 7};

        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(70, 70, 70, 70));

        list.addAll(3, arrayList);

        assertArrayEquals(expected, list.toArray());
    }

    @Test
    void testContains() {
        assertTrue(list.contains(5));
    }

    @Test
    void testIsEmptyReturnsTrue() {
        list = new ArrayList();

        assertTrue(list.isEmpty());
    }

    @Test
    void testIsEmptyReturnsFalse() {
        assertFalse(list.isEmpty());
    }

    @Test
    void testToArray() {
        Integer[] expected = {1, 2, 3, 4, 5, 6, 7};

        assertArrayEquals(expected, list.toArray());
    }

    @Test
    void testIterator() {
        Iterator iterator = list.iterator();
        String actual = "";
        String expected = "1, 2, 3, 4, 5, 6, 7, ";

        while (iterator.hasNext()){
            actual += iterator.next() + ", ";
        }
        assertEquals(expected, actual);
    }

    @Test
    void testListIterator() {
        ListIterator listIterator = list.listIterator(4);
        String expected = "5, 6, 7, ";
        String actual = "";

        while(listIterator.hasNext())
            actual+= listIterator.next() + ", ";

        assertEquals(expected, actual);
    }
*/
}