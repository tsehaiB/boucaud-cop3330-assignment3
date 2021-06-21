package ex46;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class counterTest {

    @Test
    void splitString() {

    }

    @Test
    void countDifference_returns_number_of_badgers_correctly() {
        //given
        counter count = new counter();
        //when
        String word = "badger";
        String pass = "badger badger badger \n" +
                "badger mushroom \n" +
                "mushroom snake badger badger \n" +
                "badger \n";

        pass = String.join("", pass.split(" "));
        String[] newStr = count.splitString(pass, word);
        int numBadger = count.countDifference(word.length(), newStr, pass);
        assertEquals(numBadger, 7);
    }
    @Test
    void countDifference_returns_number_of_mushrooms_correctly() {
        //given
        counter count = new counter();
        //when
        String word = "mushroom";
        String pass = "badger badger badger \n" +
                "badger mushroom \n" +
                "mushroom snake badger badger \n" +
                "badger \n";

        pass = String.join("", pass.split(" "));
        String[] newStr = count.splitString(pass, word);
        int numBadger = count.countDifference(word.length(), newStr, pass);
        assertEquals(numBadger, 2);
    }
    void countDifference_returns_0_given_invalid_word(){
            //given
            counter count = new counter();
            //when
            String word = "dave";
            String pass = "badger badger badger \n" +
                    "badger mushroom \n" +
                    "mushroom snake badger badger \n" +
                    "badger \n";

            pass = String.join("", pass.split(" "));
            String[] newStr = count.splitString(pass, word);
            int numBadger = count.countDifference(word.length(), newStr, pass);
            assertEquals(numBadger, 0);
    }
}