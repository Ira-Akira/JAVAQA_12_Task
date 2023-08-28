package ru.netology.stats;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class MoviesManagerTest {
    @Test
    public void testFindAll() {
        MoviesManager manager = new MoviesManager();
        String movie1 = "Пила.Игра на выживание";
        String movie2 = "Пила 2";
        String movie3 = "Пила 3";
        String movie4 = "Пила 4";
        String movie5 = "Пила 5";
        String movie6 = "Пила 6";
        String movie7 = "Пила 3D";
        String movie8 = "Пила 8";
        String movie9 = "Пила.Спираль";

        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        String[] actual = manager.findAll();
        String[] expected = {movie1, movie2, movie3};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastWhenLimitEqualsSize() {
        MoviesManager manager = new MoviesManager();
        String movie1 = "Пила.Игра на выживание";
        String movie2 = "Пила 2";
        String movie3 = "Пила 3";
        String movie4 = "Пила 4";
        String movie5 = "Пила 5";

        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        String[] actual = manager.findLast();
        String[] expected = {movie5, movie4, movie3, movie2, movie1};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastWhenLimitMoreSize() {
        MoviesManager manager = new MoviesManager(3);
        String movie1 = "Пила.Игра на выживание";
        String movie2 = "Пила 2";
        String movie3 = "Пила 3";
        String movie4 = "Пила 4";
        String movie5 = "Пила 5";

        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        String[] actual = manager.findLast();
        String[] expected = {movie3, movie2, movie1};

        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void testFindLastWhenLimitLessSize() {
        MoviesManager manager = new MoviesManager(3);
        String movie1 = "Пила.Игра на выживание";
        String movie2 = "Пила 2";
        String movie3 = "Пила 3";
        String movie4 = "Пила 4";
        String movie5 = "Пила 5";

        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        String[] actual = manager.findLast();
        String[] expected = {movie3, movie2, movie1};

        Assertions.assertArrayEquals(expected, actual);
    }
}
