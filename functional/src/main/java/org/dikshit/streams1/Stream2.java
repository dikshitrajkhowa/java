package org.dikshit.streams1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class Stream2 {

    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();

        books.add(new Book("The Alchemist", "Paulo Coelho", "Adventure", 4.408789797));
        books.add(new Book("The Notebook", "Nicholas Sparks", "Romance", 4.10));
        books.add(new Book("Horror Cocktail", "Robert Bloch", "Horror", 2.67));
        books.add(new Book("House of Leaves", "Mark Z. Danielewski", "Horror", 4.10908908));

        Stream<Book> stream = books.stream();

        List<Book> popularHorrorBooks = stream
                .filter((book) -> book.getGenre().equalsIgnoreCase("Horror"))
                .filter((book) -> book.getRating() > 3)
                .collect(Collectors.toList());

        popularHorrorBooks.forEach(System.out::println);

        //Streams can be used only once, hence defining new stream

        Stream<Book> stream1 = books.stream();
        List<Book> popularRomanticBooks = stream1
                .filter((book) -> book.getGenre().equalsIgnoreCase("Romance"))
                .filter((book) -> book.getRating() > 3)
                .collect(Collectors.toList());

//        popularRomanticBooks.forEach(book -> System.out.println(book));
        popularRomanticBooks.forEach(System.out::println); // method reference


    }

}
