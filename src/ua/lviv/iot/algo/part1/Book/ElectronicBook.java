package ua.lviv.iot.algo.part1.Book;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)
public class ElectronicBook extends Book {
    public static final double BYTES_PER_PAGE_COUNT = 2048;
    private String format;
    private long fileSizeInBytes;

    public ElectronicBook(String title, String author, String publisher, int year, String genre, String format, long fileSizeInBytes) {
        super(title, author, publisher, year, genre);
        this.format = format;
        this.fileSizeInBytes = fileSizeInBytes;
    }

    @Override
    public int getPagesCount() {
        return (int) Math.ceil((double) fileSizeInBytes / BYTES_PER_PAGE_COUNT); 
    }
}
