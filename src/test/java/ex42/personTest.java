/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Tsehai Boucaud
 */
package ex42;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class personTest {

    @Test
    void newPerson_returns_person_object_with_default_instance_values() {//also tests get and set methods.
        //given
        person expected = new person();
        person actual = new person();
        //when
        expected.setSalary("");
        expected.setFirst("");
        expected.setLast("");
        actual = actual.newPerson();
        //then
        assertEquals(expected.getFirst(), actual.getFirst());
        assertEquals(expected.getLast(), actual.getLast());
        assertEquals(expected.getSalary(), actual.getSalary());
    }


    @Test
    void splitString_returns_string_array_of_lastName_firstName_Salary() {
        //given
        person test = new person();
        //when
        String[] expected = {"Ling", "Mai", "55900"};
        String[] actual = test.splitString("Ling,Mai,55900");
        //then
        assertEquals(expected[0], actual[0]);
        assertEquals(expected[1], actual[1]);
        assertEquals(expected[2], actual[2]);
    }
    @Test
    void splitString_returns_empty_string_array_given_empty_string() {
        //given
        person test = new person();
        //when
        String[] expected = {""};
        String[] actual = test.splitString("");
        //then
        assertEquals(expected.length, actual.length);
    }
    @Test
    void assignSplit() {
        //given
        person expected = new person();
        person actual = new person();
        //when
        expected.setFirst("Ling");
        expected.setLast("Mai");
        expected.setSalary("55900");
        String[] categories = actual.splitString("Ling,Mai,55900");
        actual.assignSplit(categories);
        //then
        assertEquals(expected.getFirst(), actual.getFirst());
        assertEquals(expected.getLast(), actual.getLast());
        assertEquals(expected.getSalary(), actual.getSalary());
    }
}