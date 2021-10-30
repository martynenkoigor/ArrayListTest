package com.martynenkoigor.arraylist;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ArrayListTest {

    /**
     * Check that ArrayList.add(element) appends the specified element to the end of this list.
     */
    @Test
    void assertThatElementIsBeingAppendedToTheEnd() {
        List<Integer> list = new ArrayList<>();

        list.add(0);
        final int elementAtTheEnd = 32;
        list.add(elementAtTheEnd);

        final int lastElementIndex = list.size() - 1;
        assertEquals(elementAtTheEnd, list.get(lastElementIndex));
    }

    /**
     * Check that ArrayList.set(index, element) replaces the element at the specified position in this list with the
     * specified element.
     */
    @Test
    void assertThatOldElementIsBeingReplacedByNewElement() {
        List<Integer> list = new ArrayList<>();

        final int elementIndex = 0;

        final int oldElement = 10;
        list.add(oldElement);

        assertEquals(oldElement, list.get(elementIndex));

        final int newElement = 11;
        list.set(elementIndex, newElement);

        assertEquals(newElement, list.get(elementIndex));
    }


    /**
     * Check that ArrayList.remove(index) removes the element at the specified position in this list.
     */
    @Test
    void assertThatElementIsBeingRemovedAtSpecifiedPosition() {
        List<Integer> list = new ArrayList<>();

        final int firstElement = 1;
        final int secondElement = 2;
        final int thirdElement = 3;

        list.add(firstElement);
        list.add(secondElement);
        list.add(thirdElement);

        assertEquals(firstElement, list.get(0));
        assertEquals(secondElement, list.get(1));
        assertEquals(thirdElement, list.get(2));
        assertEquals(3, list.size());

        list.remove(1);

        assertEquals(firstElement, list.get(0));
        assertEquals(thirdElement, list.get(1));
        assertEquals(2, list.size());
    }

    /**
     * Check that ArrayList.clear() removes all the elements from this list.
     */
    @Test
    void assertThatAllElementsAreBeingRemoved() {
        List<Integer> list = new ArrayList<>();

        final int firstElement = 1;
        final int secondElement = 2;
        final int thirdElement = 3;

        list.add(firstElement);
        list.add(secondElement);
        list.add(thirdElement);

        assertEquals(3, list.size());

        list.clear();

        assertEquals(0, list.size());
    }

    /**
     * Check that ArrayList.isEmpty() returns true if this list contains no elements.
     */
    @Test
    void assertThatListIsEmpty() {
        List<Integer> list = new ArrayList<>();

        final int element = 1;

        list.add(element);

        assertTrue(!list.isEmpty());

        list.clear();

        assertTrue(list.isEmpty());
    }

    /**
     * Check that ArrayList.get(index) returns the element at the specified position in this list.
     */
    @Test
    void assertThatValidElementIsBeingReturned() {
        List<Integer> list = new ArrayList<>();

        final int firstElement = 1;
        final int secondElement = 2;

        list.add(firstElement);
        list.add(secondElement);

        assertEquals(firstElement, list.get(0));
        assertEquals(secondElement, list.get(1));
    }
}