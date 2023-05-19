package day4.design_pattern.adapter;

public class bookAdapter implements book{
    private libraryBook book;

    public bookAdapter(libraryBook book) {
        this.book = book;
    }

    @Override
    public void openBook(String bookTitle) {
        book.displayBook(bookTitle);
    }

}
