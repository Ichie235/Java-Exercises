package EnumExercise;

public class EnumsExample {
    public static void main(String[] args) {
        for (Weekday day: Weekday.values()){
            System.out.println(day);
        }
        for(Planet planet: Planet.values()){
            System.out.printf("%s is %.2f AU from the Sun%n",planet.getName(),planet.getDistanceFromSun());
        }
        for(GameStatus gameStatus: GameStatus.values()){
            System.out.println(gameStatus);
        }
        GameStatus gameStatus = GameStatus.PAUSED;
        System.out.printf("This is the current game status => %s",gameStatus);
    }
}
