package ru.netology;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class MovieManagerTest {
    @Test
    public void FindZero() {
        MovieManager manager = new MovieManager();

        String[] expected = {};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void FindOneMovie() {
        MovieManager manager = new MovieManager();

        manager.addMovie("Бладшот");

        String[] expected = {"Бладшот"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void FindThreeMovies() {
        MovieManager manager = new MovieManager();

        manager.addMovie("Бладшот");
        manager.addMovie("Вперед");
        manager.addMovie("Отель Белград");

        String[] expected = {"Бладшот","Вперед", "Отель Белград"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void FindAllMovies() {
        MovieManager manager = new MovieManager();

        manager.addMovie("Бладшот");
        manager.addMovie("Вперед");
        manager.addMovie("Отель Белград");
        manager.addMovie("Джентельмены");
        manager.addMovie("Человек-невидимка");
        manager.addMovie("Тролли.Мировой тур");
        manager.addMovie("Номер один");

        String[] expected = {"Бладшот","Вперед", "Отель Белград","Джентельмены","Человек-невидимка","Тролли.Мировой тур","Номер один"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void FindAllLastMovie() {
        MovieManager manager = new MovieManager();

        manager.addMovie("Отель Белград");
        manager.addMovie("Джентельмены");
        manager.addMovie("Человек-невидимка");
        manager.addMovie("Тролли.Мировой тур");
        manager.addMovie("Номер один");

        String[] expected = {"Номер один","Тролли.Мировой тур","Человек-невидимка","Джентельмены","Отель Белград" };
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
}

