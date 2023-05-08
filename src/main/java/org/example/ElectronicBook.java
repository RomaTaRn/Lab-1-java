package org.example;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)
public class ElectronicBook extends book {
    private String format;
    private long fileSizeInBytes;
    private static final int BYTES_PER_PAGE_COUNT = 2048;
    private int year;
    private String author;

    public ElectronicBook(String title, String author, String publisher, int year, String genre, String format, long fileSizeInBytes) {
        super(title, author, publisher, year, genre);
        setTitle(title);
        setAuthor(author);
        setPublisher(publisher);
        setYear(year);
        setGenre(genre);
        setFormat(format);
        setFileSizeInBytes(fileSizeInBytes);
    }

    private void setGenre(String ignoredGenre) {
    }

    private void setYear(int year) {
        this.year = year;
    }

    private void setPublisher(String ignoredPublisher) {
    }

    private void setAuthor(String author) {
        this.author = author;
    }

    private void setTitle(String ignoredTitle) {
    }

}
