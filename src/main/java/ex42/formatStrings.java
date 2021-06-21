/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Tsehai Boucaud
 */
package ex42;
import java.util.ArrayList;
public class formatStrings {
    //create arraylist of people
    ArrayList<person> people = new ArrayList<person>();
    //Method to turn an ArrayList of unformatted strings into an ArrayList of people
    public void createPeople(ArrayList<String> unformatted)
    {
        //loop through all of the strings in the ArrayList of unformatted strings
        for(int i = 0; i < unformatted.size(); i++){
            //for each string, create a new person
            person myPerson = new person();
            myPerson = myPerson.newPerson();
            //get the data from the unformatted strings: first name, last name, salary
            String[] categories = myPerson.splitString(unformatted.get(i));
            //use the data to set these instance values for each person
            myPerson.assignSplit(categories);
            //add person to the arraylist of people
            people.add(myPerson);
        }
    }
    //Method to format a person's categorical attributes into a correctly spaced string
    public String formatPerson(person one){
        //return string with each attribute getting 10 spaces for formatting and a new line
        return String.format("%-10s%-10s%s\n", one.getFirst(), one.getLast(), one.getSalary());
    }
    //method that loops through all people and runs the formatPerson method
    public String formatAll(){
        //create output variable
        String output = "";
        //loop for each person in people
        for(person next : people){
            //add person's formatted data to the total output variable
            output += formatPerson(next);
        }
        //return complete output
        return output;
    }
    public String addHeader(String formatted){
        //return composite of header, line break, and formatted output
        return ("Last      First     Salary\n" + "--------------------------\n" + formatted);
    }
}
