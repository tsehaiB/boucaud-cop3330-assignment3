/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Tsehai Boucaud
 */
package ex45;

import ex45.input;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class inputFileTest {

    @Test
    void constructReader_returns_new_reader_given_valid_file() throws FileNotFoundException {
        //given
        ex45.input reader = new ex45.input();
        //when
        File input = new File("src/main/java/ex45/exercise45_input.txt");
        Scanner expected = new Scanner(input);
        Scanner actual = reader.constructReader();
        //then
        assertEquals(expected.toString(), actual.toString());
    }
    @Test
    void storeInStringArray_returns_complete_arrayList_given_valid_reader() {
        //given
        ex45.input reader = new input();
        //when
        Scanner read = reader.constructReader();
        ArrayList<String> expected = new ArrayList<>();
        expected.add("One should never utilize the word \"utilize\" in writing. Use \"use\" instead.");
        expected.add("For example, \"She uses an IDE to write her Java programs\" instead of \"She");
        expected.add("utilizes an IDE to write her Java programs\".");

        ArrayList<String> actual = reader.storeInStringArray(read);

        //then
        assertEquals(expected.toString(), actual.toString());
    }
    @Test
    void storeInStringArray_returns_empty_arrayList_given_invalid_reader() throws FileNotFoundException {
        //given
        input reader = new input();
        //when
        Scanner read = new Scanner(new File("src/test/java/ex45/empty.txt"));
        ArrayList<String> actual = reader.storeInStringArray(read);

        //then
        assertTrue(actual.isEmpty());
    }
}