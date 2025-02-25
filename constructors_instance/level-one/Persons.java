public class Persons {
    String name;
    int age;

    // Parameterized constructor
    public Persons(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // copy constructor (used other which allowed us to copy Persons constructor)
    public Persons(Persons other) {
        this.name = other.name;
        this.age = other.age;
    }

    // displayed the method
    void details() {
        System.out.println("Name of the person is: " + name);
        System.out.println("Age of that person is: " + age);
    }

    public static void main(String[] args) {

        // created obj for original
        Persons p1 = new Persons("Aditi", 21);
        System.out.println("Original Person");
        p1.details();

        // created another obj for copied
        Persons p2 = new Persons(p1);
        System.out.println("Copied Persons");
        p2.details();

    }

}
