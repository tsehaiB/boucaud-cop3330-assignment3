package ex46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class counter {
    
    //use split function on line in passage to create arraylist of all words
    public String[] splitString(String passageLine, String word){
        //return the string array all of the words in the line
        passageLine = String.join("", passageLine.split(" |\n"));
        return passageLine.split(word);
    }

    //Method to turn a string array that represents a line into a single string with a newline at the end
    public int countDifference(int wordLen, String[] difference, String total){
        String diff = String.join("", difference);
        //return single string with new line
        return (total.length() - diff.length())/wordLen;
    }
    //method that loops through of the words and counts occurrences of them
    public String[] countAll(ArrayList<String> uniqueWords, String content){
        for(String word : uniqueWords){
            int num = countDifference(word.length(), splitString(content, word), content);
            System.out.println(word + " " + num);
        }
        return null;
    }
    public String turnToString(ArrayList<String> unprocessed) {
        //create string variable
        String content = "";
        //loop for each person in people
        for (String s : unprocessed) {
            content += s;
        }
        return content;
    }
    //method that creates an arraylist of all of the unique words in the input
    public ArrayList<String> unique(String content){
        Set<String> set = new HashSet<>(Arrays.stream(content.split(" ")).toList());
        ArrayList<String> uniqueWords = new ArrayList<String>();
        uniqueWords.addAll(set);
        //return list of unique words
        return uniqueWords;
    }
}
