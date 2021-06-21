package ex45;

import ex42.person;

import java.util.ArrayList;
import java.util.Arrays;

public class processor {
    
    //use split function on line in passage to create arraylist of all words
    public String[] splitString(String passageLine){
        //return the string array all of the words in the line
        return passageLine.split("utilize");
    }

    //Method to turn a string array that represents a line into a single string with a newline at the end
    public String makeString(String[] line){
        //return single string with new line
        return String.join("use", line);
    }
    //method that loops through of the lines and processes them
    public String processAll(ArrayList<String> unprocessed){
        //create output variable
        String output = "";
        //loop for each person in people
        for(int i = 0; i < unprocessed.size(); i++){
            //add processed line to total passage
            output += makeString(splitString(unprocessed.get(i))) + "\n";
        }
        //return modified passage
        return output;
    }
}
