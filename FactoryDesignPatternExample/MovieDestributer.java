package FactoryDesignPatternExample;

/** Factory Class */
public class MovieDestributer {
    public MovieDestributer() {
        System.out.println("MovieDestributer.MovieDestributer()");
    }

    /** Factory Method */
    public static Movie bookMyShow(String theatre) {
        if (theatre.equals(Constants.BIG_CINEMA)) {
            return new BIGCinema();
        } else if (theatre.equals(Constants.INOX_CINEMA)) {
            return new INOXCinema();
        } else if (theatre.equals(Constants.PVR_CINEMA)) {
            return new PVRCinema();
        } else {
            return null;
        }
    }
}
