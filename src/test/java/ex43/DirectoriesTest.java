package ex43;

import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

class DirectoriesTest {

    @Test
    void makeRootDir() {
        //given
        String name = "awesomeco";
        Directories myDirs = new Directories();
        //when
        String expected = "C:\\Users\\Art3mis\\IdeaProjects\\boucaud-cop3330-assignment3\\website\\awesomeco";
        String actual = myDirs.makeRootDir(name);
        //then
        assertEquals(expected, actual);
    }
    @Test
    void makeDir_given_js() {
        //given
        String name = "testingJs";
        String newDir = "css";
        Directories myDirs = new Directories();
        String root = myDirs.makeRootDir(name);
        //when
        boolean actual = myDirs.makeDir(root, newDir, name);
        //then
        assertTrue(actual);

    }
    @Test
    void makeDir_given_js_and_css() {
        //given
        String name = "testingJs-and-Css";
        String newDir1 = "js";
        String newDir2 = "css";
        Directories myDirs = new Directories();
        String root = myDirs.makeRootDir(name);
        //when
        boolean actual1 = myDirs.makeDir(root, newDir1, name);
        boolean actual2 = myDirs.makeDir(root, newDir2, name);
        //then
        assertTrue(actual1);
        assertTrue(actual2);
    }
}