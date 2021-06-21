/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Tsehai Boucaud
 */
package ex41;

import java.util.ArrayList;
import java.util.List;

public class nameSort {
    /*
    Function takes an ArrayList of strings (names) and sorts them alphabetically
    returns a sorted ArrayList of names
     */
    //create list to contain sorted names
    ArrayList<String> sortedNames = new ArrayList<String>();
    public void addToSorted(String newName){

        //find index of last name alphabetically
        int idx = 0;
        //loops down the list until a name after it alphabetically is found
        while(newName.compareTo(sortedNames.get(idx)) > 0){
            //increment index to traverse to the next name
            if(sortedNames.size() > (idx + 1))//break if we've reached the end of the list
                idx++;
            else {
                idx++;
                break;
            }
        }
        //add new name to the corresponding alphabetized index
        sortedNames.add(idx, newName);
    }
    public ArrayList<String> addAllNames(ArrayList<String> unsorted){
        //add temporary blank string to avoid exceptions
        sortedNames.add("");
        //call addToSorted for each name in the unsorted list to create a sorted list
        for(String name : unsorted){
            addToSorted(name);
        }
        //remove temporary blank string from the sorted list
        sortedNames.remove("");
        //return the sorted list
        return sortedNames;
    }
}
