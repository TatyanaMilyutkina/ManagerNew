package ru.netology.FilmManager.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmManagerTest {


    @Test
    public void managerSave(){
        FilmManager manager = new FilmManager();
        manager.add("first");

        String[] actual = manager.findAll();
        String[] expected = {"first"};
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void managerfindAll(){
        FilmManager manager = new FilmManager();
        manager.add("first");
        manager.add("second");
        manager.add("third");

        String[] actual = manager.findAll();
        String[] expected = {"first" , "second" , "third"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void managerfindLast(){
        FilmManager manager = new FilmManager();
        manager.add("first");
        manager.add("second");
        manager.add("third");
        manager.add("third");
        manager.add("third");
        manager.add("third");
        manager.add("third");
        manager.add("third");
        manager.add("third");
        manager.add("third");

        String[] actual = manager.findLast();
        String[] expected = {"third" ,"third" ,"third" ,"third" ,"third" ,"third" ,"third" ,"third" ,"second" , "first"};
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void managerfindLastCount(){
        FilmManager manager = new FilmManager(3);
        manager.add("first");
        manager.add("second");
        manager.add("third");


        String[] actual = manager.findLast();
        String[] expected = {"third" ,"second" , "first"};
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void managerfindLastCountMin(){
        FilmManager manager = new FilmManager(2);
        manager.add("first");
        manager.add("second");
        manager.add("third");

        String[] actual = manager.findLast();
        String[] expected = {"third" , "second"};
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void managerfindLastCountMax(){
        FilmManager manager = new FilmManager(3);
        manager.add("first");
        manager.add("second");

        String[] actual = manager.findLast();
        String[] expected = {"second" , "first"};
        Assertions.assertArrayEquals(expected, actual);
    }
}
