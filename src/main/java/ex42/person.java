/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Tsehai Boucaud
 */
package ex42;

public class person {
    //INSTANCE VARIABLES
    //instance variable: First
    private String first;
    //instance variable: Last
    private String last;
    //instance variable: Salary
    private String salary;

    //Create Person with default values
    public person newPerson(){
        person temp = new person();
        temp.setSalary("");
        temp.setLast("");
        temp.setFirst("");
        return temp;
    }
    //SETTER METHODS
    //Set this person's first name to equal newFirst
    public void setFirst(String newFirst){
        this.first = newFirst;
    }
    //Set this person's last name to equal newLast
    public void setLast(String newLast){
        this.last = newLast;
    }
    //Set this person's salary to equal newSalary
    public void setSalary(String newSalary){
        this.salary = newSalary;
    }

    //GETTER METHODS
    //return this person's first name
    public String getFirst(){
        return first;
    }
    //return this person's last name
    public String getLast(){
        return last;
    }
    //return this person's salary
    public String getSalary(){
        return salary;
    }

    //ACTION METHODS
    //use split function on salary to split first name, last name, and salary into a string array
    public String[] splitString(String firstLastSalary){
        //return the string array of first name, last name, and salary
        return firstLastSalary.split(",");
    }
    //use setter methods to set instance variables equal to the first name, last name, and salary
    public void assignSplit(String[] categories){
        //set first name to the first category, first name
        setFirst(categories[0]);
        //set last name to the second category, last name
        setLast(categories[1]);
        //set salary to the third category, salary
        setSalary(categories[2]);
    }
}
