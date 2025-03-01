package InheritanceAndThreePillarsOfOOPExercise;

public class Animal {
    private String sound;

    public Animal(String sound) {
        setSound(sound);
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public void makeSound(){
        System.out.println("This is the animal sound: "+ getSound());
    }
}
