package FactoryDesignPatternExample;

/** IMPLEMENTATION */
public class INOXCinema implements Movie {
    public INOXCinema() {
        System.out.println("INOXCinema.INOXCinema()");
    }

    @Override
    public void selectMovie() {
        System.out.println("INOXCinema.selectMovie()");
        System.out.println("Welcome to INOXCinema");
        System.out.println("Thanks for visiting INOXCinema");
    }
}
