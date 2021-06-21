/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Tsehai Boucaud
 */
package ex41;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class nameSortTest {
    private ArrayList<String> sorted = new ArrayList<String>(
            Arrays.asList("Johnson, Jim", "Jones, Aaron" ,"Jones, Chris", "Ling, Mai", "Swift, Geoffrey", "Xiong, Fong", "Zarnecki, Sabrina"));
    private ArrayList<String> unsorted = new ArrayList<String>(
            Arrays.asList("Ling, Mai", "Johnson, Jim", "Swift, Geoffrey", "Xiong, Fong", "Jones, Chris", "Zarnecki, Sabrina", "Jones, Aaron"));

    @Test
    void addToSorted_appends_name_at_the_start_of_the_list() {
        //given
        nameSort sorter = new nameSort();

        //when
        sorter.sortedNames = sorted;
        sorter.addToSorted("Alex, Amber");

        //then
        assertEquals(sorter.sortedNames.get(0), "Alex, Amber");
    }
    @Test
    void addToSorted_appends_name_at_the_end_of_the_list() {
        //given
        nameSort sorter = new nameSort();

        //when
        sorter.sortedNames = sorted;
        sorter.addToSorted("Zink, Zonk");

        //then
        assertEquals(sorter.sortedNames.get(sorter.sortedNames.size()-1), "Zink, Zonk");
    }
    @Test
    void addToSorted_appends_name_in_the_middle_of_the_list() {
        //given
        nameSort sorter = new nameSort();

        //when
        sorter.sortedNames = sorted;
        sorter.addToSorted("Kelly, Kola");

        //then
        assertEquals(sorter.sortedNames.get(3), "Kelly, Kola");
    }
    @Test
    void testAddAllNames_returns_sorted_list_given_unsorted_list() {
        //given
        nameSort sorter = new nameSort();

        //when
        sorter.addAllNames(unsorted);

        //then
        assertEquals(sorter.sortedNames, sorted);
    }
    @Test
    void testAddAllNames_returns_empty_list_given_empty_list() {
        //given
        nameSort sorter = new nameSort();

        //when
        ArrayList<String> toSort = new ArrayList<String>();
        sorter.addAllNames(toSort);

        //then
        assertTrue(sorter.sortedNames.isEmpty());
    }
}