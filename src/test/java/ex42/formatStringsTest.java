/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Tsehai Boucaud
 */
package ex42;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class formatStringsTest {

    @Test
    void createPeople_returns_arraylist_of_people() {
        //given
        formatStrings formatter = new formatStrings();
        ArrayList<String> unformatted = new ArrayList<String>();

        //when
        unformatted.add("Ling,Mai,55900");
        unformatted.add("Johnson,Jim,56500");
        unformatted.add("Jones,Aaron,46000");
        unformatted.add("Jones,Chris,34500");
        unformatted.add("Swift,Geoffrey,14200");
        unformatted.add("Xiong,Fong,65000");
        unformatted.add("Zarnecki,Sabrina,51500");

        //then
        assertTrue(formatter.people.size() == 7);
        assertTrue(formatter.people.get(2).getSalary().equalsIgnoreCase("46000"));
    }

    @Test
    void formatAll_returns_complete_output_as_string() {//also tests formatPerson
        //given
        formatStrings formatter = new formatStrings();
        ArrayList<String> unformatted = new ArrayList<String>();
        unformatted.add("Ling,Mai,55900");
        unformatted.add("Johnson,Jim,56500");
        unformatted.add("Jones,Aaron,46000");
        unformatted.add("Jones,Chris,34500");
        unformatted.add("Swift,Geoffrey,14200");
        unformatted.add("Xiong,Fong,65000");
        unformatted.add("Zarnecki,Sabrina,51500");
        formatter.createPeople(unformatted);
        //when
        String expected = "Ling      Mai       55900\n" +
                "Johnson   Jim       56500\n" +
                "Jones     Aaron     46000\n" +
                "Jones     Chris     34500\n" +
                "Swift     Geoffrey  14200\n" +
                "Xiong     Fong      65000\n" +
                "Zarnecki  Sabrina   51500\n";
        String actual = formatter.formatAll();
        //then
        assertEquals(expected, actual);
    }
    @Test
    void formatAll_returns_empty_given_empty_ArrayList() {
        //given
        formatStrings formatter = new formatStrings();
        ArrayList<String> unformatted = new ArrayList<String>();
        formatter.createPeople(unformatted);
        //when
        String expected = "";
        String actual = formatter.formatAll();
        //then
        assertEquals(expected, actual);
    }
    @Test
    void addHeader_returns_header_given_empty_formatted_out() {
        //given
        formatStrings formatter = new formatStrings();
        ArrayList<String> unformatted = new ArrayList<String>();
        formatter.createPeople(unformatted);
        //when
        String expected = "Last      First     Salary\n" +
                "--------------------------\n";
        String actual = formatter.addHeader("");
        //then
        assertEquals(expected, actual);
    }
    @Test
    void addHeader_returns_complete_output_given_complete_formatted_out() {
        //given
        formatStrings formatter = new formatStrings();
        ArrayList<String> unformatted = new ArrayList<String>();
        formatter.createPeople(unformatted);
        //when
        String expected = "Last      First     Salary\n" +
                "--------------------------\n" +
                "Ling      Mai       55900\n" +
                "Johnson   Jim       56500\n" +
                "Jones     Aaron     46000\n" +
                "Jones     Chris     34500\n" +
                "Swift     Geoffrey  14200\n" +
                "Xiong     Fong      65000\n" +
                "Zarnecki  Sabrina   51500\n";
        String actual = formatter.addHeader(formatter.formatAll());
        //then
        assertEquals(expected, actual);
    }
}