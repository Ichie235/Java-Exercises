package structure;

public class PassObjectToMethod {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "obi calistus";
        person.age = 55;
        System.out.println("Value of person before: " + person.name + " " + person.age);
        modifyPerson(person);
        System.out.println("Value of person after: " + person.name + " " + person.age);
    }

    public static void modifyPerson(Person person) {
        person.age = 40;
        person.name = "ogechi choice";
    }
}
