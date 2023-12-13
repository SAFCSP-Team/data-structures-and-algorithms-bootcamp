public class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String personName, int personAge) {
        name = personName;
        age = personAge;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Setter methods
    public void setName(String newName) {
        name = newName;
    }

    public void setAge(int newAge) {
        age = newAge;
    }
}
