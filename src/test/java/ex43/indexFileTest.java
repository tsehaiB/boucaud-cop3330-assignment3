/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Tsehai Boucaud
 */
package ex43;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class indexFileTest {

    @Test
    void generateIndex_returns_index_given_valid_string() {
        //given
        indexFile myIndex = new indexFile();
        //when
        String expected = """
                <!DOCTYPE html>
                <html>
                \t<head>
                \t\t<title> "potatoes" </title>
                \t\t<meta name="author" content="James Baxter">
                \t</head>
                </html>""";
        String actual = myIndex.generateIndex("James Baxter", "potatoes");
        //then
        assertEquals(expected, actual);
    }

    @Test
    void makeIndex() {

    }
}