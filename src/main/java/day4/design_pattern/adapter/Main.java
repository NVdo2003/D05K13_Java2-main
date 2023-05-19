package day4.design_pattern.adapter;

public class Main {
    public static void main(String[] args) {
        libraryBook book = new libraryBook();
        book b = new bookAdapter(book);
        b.openBook("Lap Trinh");
    }
}
