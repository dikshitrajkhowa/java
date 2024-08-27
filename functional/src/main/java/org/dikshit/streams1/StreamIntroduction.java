package org.dikshit.streams1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamIntroduction {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();

        List<Book> popularHorrorBooks1 = new ArrayList<>();

        for (Book book : books) {
            if(book.getGenre().equalsIgnoreCase("Horror")  && book.getRating() > 3) {

                popularHorrorBooks1.add(book);

            }
        }

        //after java 8

        //Stream Pipeline
        List<Book> popularHorrorBooks = books.stream()    //Source
                .filter((book) -> book.getGenre().equalsIgnoreCase("Horror")) //Intermediate Op
                .filter((book) -> book.getRating() > 3) //Intermediate Op
                .collect(Collectors.toList());  //Terminal Op


        //1.Source
        Stream<Book> stream = books.stream();


        //2. Intermediate Operation
        Stream<Book> horrorBooks = stream.filter((book) -> book.getGenre().equalsIgnoreCase("Horror"));


        //3. Intermediate Operation
        Stream<Book> pHorrorBooks = horrorBooks.filter((book) -> book.getRating() > 3);

        //4. Terminal operation
        List<Book> collect = pHorrorBooks.collect(Collectors.toList());
    }
}
