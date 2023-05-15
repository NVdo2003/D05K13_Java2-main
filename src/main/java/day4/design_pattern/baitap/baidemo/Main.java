package day4.design_pattern.baitap.baidemo;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu.Builder()
                .setBun(1)
                .setBanhMyThapCam20k(1)
                .setCoca(1)
                .setXoi(2)
                .create();

        Menu menu1 = new Menu.Builder()
                .setCafe(2)
                .setBun(1)
                .setCoca(1)
                .setXoi(2)
                .create();

        menu.printMenu();
        menu1.printMenu();
    }
}
