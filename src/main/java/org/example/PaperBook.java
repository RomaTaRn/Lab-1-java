package org.example;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)
public class PaperBook extends book {
    private int pageCount;
    private int widthInMm;
    private int heightInMm;
    private String publisher;
    private String author;

    public PaperBook(String title, String author, String publisher, int year, String genre, int pageCount, int widthInMm, int heightInMm) {
        super(title, author, publisher, year, genre);
        setTitle(title);
        setAuthor(author);
        setPublisher(publisher);
        setYear(year);
        setGenre(genre);
        setPageCount(pageCount);
        setWidthInMm(widthInMm);
        setHeightInMm(heightInMm);
    }

    private void setGenre(String ignoredGenre) {
    }

    private void setYear(int ignoredYear) {
    }

    private void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    private void setAuthor(String author) {
        this.author = author;
    }

    private void setTitle(String ignoredTitle) {
    }

}
