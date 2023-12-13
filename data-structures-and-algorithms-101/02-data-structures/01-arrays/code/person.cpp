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

    // Print method
    void printInfo() const {
        std::cout << "Name: " << name << std::endl;
        std::cout << "Age: " << age << std::endl;
    }
};

