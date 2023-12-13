#include <iostream>
#include <string>

class Person {
private:
    std::string name;
    int age;

public:
    // Constructor
    Person(const std::string& personName, int personAge) : name(personName), age(personAge) {}

    // Getter methods
    std::string getName() const {
        return name;
    }

    int getAge() const {
        return age;
    }

    // Setter methods
    void setName(const std::string& newName) {
        name = newName;
    }

    void setAge(int newAge) {
        age = newAge;
    }
};

int main() {
    // Create a Person object
    Person person("Alice", 25);

    // Get and display the person's name and age
    std::cout << "Name: " << person.getName() << std::endl;
    std::cout << "Age: " << person.getAge() << std::endl;

    // Update the person's name and age
    person.setName("Bob");
    person.setAge(30);

    // Get and display the updated information
    std::cout << "Updated Name: " << person.getName() << std::endl;
    std::cout << "Updated Age: " << person.getAge() << std::endl;

    return 0;
}
