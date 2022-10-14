package FactoryDesignPatternExample;

/** IMPLEMENTATION */
public class BIGCinema implements Movie {
    public BIGCinema() {
        System.out.println("BigCinema.BigCinema()");
    }

    @Override
    public void selectMovie() {
        System.out.println("BigCinema.selectMovie()");
        System.out.println("welcome to big cinema");
        System.out.println("Thanks for visiting, Have a nice day.");
    }
}
