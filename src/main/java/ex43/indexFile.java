/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Tsehai Boucaud
 */
package ex43;

public class indexFile {
    /*
    index.html takes name and author as input (uses getters and input class)
    index.html has method for creating a path to "website/name" directory
    index.html has a 'generate index' method that returns string*/
    //Method to create path for index.html
    //construct index maker
    private static final createIndex indexMaker = new createIndex();
    //Method to write index.html given name and author
    public String generateIndex(String author, String name){
        //create and return string that uses name and author to make a index.html file
        return "<!DOCTYPE html>\n" +
                "<html>\n" +
                "\t<head>\n" +
                "\t\t<title> \"" + name + "\" </title>\n" +
                "\t\t<meta name=\"author\" content=\""+ author + "\">\n" +
                "\t</head>\n" +
                "</html>";
    }
    //method to call createIndex functions with the index.html text generated
    public void makeIndex(String index, String path){
        indexMaker.printToFile(indexMaker.constructWriter(path), index);
    }
}
