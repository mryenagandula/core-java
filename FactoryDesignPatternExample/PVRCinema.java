package FactoryDesignPatternExample;

/** IMPLEMENTATION */
public class PVRCinema implements Movie {
    public PVRCinema() {
        System.out.println("PVRCinema.PVRCinema()");
    }

    @Override
    public void selectMovie() {
        System.out.println("PVRCinema.selectMovie()");
        System.out.println("Welcome to PVRCinema");
        System.out.println("Thanks for visiting PVRCinema, Have a great day.!");
    }
}
