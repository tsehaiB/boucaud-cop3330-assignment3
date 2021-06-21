package ex43;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class indexFileTest {

    @Test
    void generateIndex_returns_index_given_valid_string() {
        //given
        indexFile myIndex = new indexFile();
        //when
        String expected = "<!DOCTYPE html>\n" +
                "<html>\n" +
                "\t<head>\n" +
                "\t\t<title> \"potatoes\" </title>\n" +
                "\t\t<meta name=\"author\" content=\"James Baxter\">\n" +
                "\t</head>\n" +
                "</html>";
        String actual = myIndex.generateIndex("James Baxter", "potatoes");
        //then
        assertEquals(expected, actual);
    }

    @Test
    void makeIndex() {

    }
}