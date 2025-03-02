package EnumExercise;

public enum Planet {
    MERCURY("Mercury",342.89),
    VENUS("Venus",4355.37),
    EARTH("Earth",35537.38);

    private final String name;
   private final double   distanceFromSun;

    Planet( String name,double distanceFromSun) {
        this.distanceFromSun = distanceFromSun;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getDistanceFromSun() {
        return distanceFromSun;
    }
}
