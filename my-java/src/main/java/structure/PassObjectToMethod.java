package structure;

public class PassObjectToMethod {
    public static void main(String[] args) {
        Person person = new Person("obi calistus",55);
        Person person2 = new Person();
        System.out.println("Value of person before: " + person.name + " " + person.age);
        modifyPerson(person);
        System.out.println("Value of person after: " + person.name + " " + person.age);
    }

    public static void modifyPerson(Person person) {
        person.age = 40;
        person.name = "ogechi choice";
    }
}
