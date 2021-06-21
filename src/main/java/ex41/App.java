/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Tsehai Boucaud
 */
package ex41;

import java.io.FileWriter;
import java.util.Scanner;
import java.util.ArrayList;

public class App 
{
    public static void main( String[] args ) {
        //CONSTRUCTORS
        //Construct App Instance
        App myApp = new App();
        //Construct InputFile Instance
        inputFile reader = new inputFile();
        //Construct OutputFile Instance
        outputFile writer = new outputFile();
        //Construct NameSort Instance
        nameSort sorter = new nameSort();

        //Create ArrayList unsorted names to process the file input into
        ArrayList<String> unsorted = myApp.readFile(reader);
        //Create ArrayList of sorted names to process the name sorter into
        ArrayList<String> sortedNames = myApp.sortNames(unsorted, sorter);
        //Write output file using ArrayList of sorted names as input.
        myApp.writeFile(sortedNames, writer);
    }
    //Method to call the inputFile functions and return the unsorted list of names
    private ArrayList<String> readFile(inputFile reader){
        //create a scanner for the file
        Scanner read = reader.constructReader();
        //return the arraylist of unsorted names from the file
        return reader.storeInStringArray(read);
    }
    //Method to call the NameSorter functions and return the sorted list of names
    private ArrayList<String> sortNames(ArrayList<String> unsorted, nameSort sorter){
        //return sorted list of names from the originally unsorted list
        return sorter.addAllNames(unsorted);
    }
    //Method to call the outputFile functions to write the sorted list of names to the output file
    private void writeFile(ArrayList<String> sortedNames, outputFile writer) {
        //create a filewriter for the output
        FileWriter write = writer.constructWriter();
        //write the entire ArrayList of sorted nam
        writer.printToFile(sortedNames, write);
    }

}
