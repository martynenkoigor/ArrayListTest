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
    void indexOf() {
    }

    @Test
    void lastIndexOf() {
    }

    @Test
    void clear() {
    }

    @Test
    void addAll() {
    }

    @Test
    void iterator() {
    }

    @Test
    void listIterator() {
    }

    @Test
    void testListIterator() {
    }

    @Test
    void subList() {
    }

    @Test
    void testEquals() {
    }

    @Test
    void testHashCode() {
    }

    @Test
    void removeRange() {
    }

    @Test
    void isEmpty() {
    }

    @Test
    void contains() {
    }

    @Test
    void toArray() {
    }

    @Test
    void testToArray() {
    }

    @Test
    void testAdd1() {
    }

    @Test
    void containsAll() {
    }

    @Test
    void testAddAll() {
    }

    @Test
    void removeAll() {
    }

    @Test
    void retainAll() {
    }

    @Test
    void testClear() {
    }

    @Test
    void testToString() {
    }

    @Test
    void removeIf() {
    }

    @Test
    void spliterator() {
    }

    @Test
    void stream() {
    }

    @Test
    void parallelStream() {
    }

    @Test
    void forEach() {
    }

    @Test
    void testSpliterator() {
    }

    @Test
    void replaceAll() {
    }

    @Test
    void sort() {
    }

    @Test
    void testSpliterator1() {
    }

    @Test
    void trimToSize() {
    }

    @Test
    void ensureCapacity() {
    }

    @Test
    void size() {
    }

    @Test
    void testIsEmpty() {
    }

    @Test
    void testContains() {
    }

    @Test
    void testIndexOf() {
    }

    @Test
    void testLastIndexOf() {
    }

    @Test
    void testClone() {
    }

    @Test
    void testToArray1() {
    }

    @Test
    void testToArray2() {
    }

    @Test
    void get() {
    }



    @Test
    void testAdd2() {
    }

    @Test
    void testAdd3() {
    }

    @Test
    void testRemove1() {
    }

    @Test
    void testRemove2() {
    }

    @Test
    void testClear1() {
    }

    @Test
    void testAddAll1() {
    }

    @Test
    void testAddAll2() {
    }

    @Test
    void testRemoveAll() {
    }

    @Test
    void testRetainAll() {
    }

    @Test
    void testListIterator1() {
    }

    @Test
    void testListIterator2() {
    }

    @Test
    void testIterator() {
    }

    @Test
    void testSubList() {
    }

    @Test
    void testForEach() {
    }

    @Test
    void testSpliterator2() {
    }

    @Test
    void testRemoveIf() {
    }

    @Test
    void testReplaceAll() {
    }

    @Test
    void testSort() {
    }
}