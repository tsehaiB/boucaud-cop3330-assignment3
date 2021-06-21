/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Tsehai Boucaud
 */
package ex42;

import ex41.inputFile;
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
        inputFile reader = new inputFile();
        //when
        File input = new File("src/main/java/ex42/exercise42_input.txt");
        Scanner expected = new Scanner(input);
        Scanner actual = reader.constructReader();
        //then
        assertEquals(expected.toString(), actual.toString());
    }
    @Test
    void storeInStringArray_returns_complete_arrayList_given_valid_reader() {
        //given
        inpFile reader = new inpFile();
        //when
        Scanner read = reader.constructReader();
        ArrayList<String> expected = new ArrayList<String>();
        expected.add("Ling,Mai,55900");
        expected.add("Johnson,Jim,56500");
        expected.add("Jones,Aaron,46000");
        expected.add("Jones,Chris,34500");
        expected.add("Swift,Geoffrey,14200");
        expected.add("Xiong,Fong,65000");
        expected.add("Zarnecki,Sabrina,51500");
        ArrayList<String> actual = reader.storeInStringArray(read);

        //then
        assertEquals(expected.toString(), actual.toString());
    }
    @Test
    void storeInStringArray_returns_empty_arrayList_given_invalid_reader() throws FileNotFoundException {
        //given
        inpFile reader = new inpFile();
        //when
        Scanner read = new Scanner(new File("src/test/java/ex42/empty.txt"));
        ArrayList<String> actual = reader.storeInStringArray(read);
        //then
        assertTrue(actual.isEmpty());
    }
}