/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Tsehai Boucaud
 */
package ex41;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class inputFileTest {

    @Test
    void constructReader_returns_new_reader_given_valid_file() throws FileNotFoundException {
        //given
        inputFile reader = new inputFile();
        //when
        File input = new File("src/main/java/ex41/exercise42_input.txt");
        Scanner expected = new Scanner(input);
        Scanner actual = reader.constructReader();
        //then
        assertEquals(expected.toString(), actual.toString());
    }
    @Test
    void storeInStringArray_returns_complete_arrayList_given_valid_reader() {
        //given
        inputFile reader = new inputFile();
        //when
        Scanner read = reader.constructReader();
        ArrayList<String> expected = new ArrayList<String>();
        expected.add("Ling, Mai");
        expected.add("Johnson, Jim");
        expected.add("Zarnecki, Sabrina");
        expected.add("Jones, Chris");
        expected.add("Jones, Aaron");
        expected.add("Swift, Geoffrey");
        expected.add("Xiong, Fong");
        ArrayList<String> actual = reader.storeInStringArray(read);

        //then
        assertEquals(expected.toString(), actual.toString());
    }
    @Test
    void storeInStringArray_returns_empty_arrayList_given_invalid_reader() throws FileNotFoundException {
        //given
        inputFile reader = new inputFile();
        //when
        Scanner read = new Scanner(new File("src/test/java/ex41/empty.txt"));
        ArrayList<String> actual = reader.storeInStringArray(read);

        //then
        assertTrue(actual.isEmpty());
    }
}