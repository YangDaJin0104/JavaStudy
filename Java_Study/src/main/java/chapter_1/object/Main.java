package chapter_1.object;

import chapter_1.object.Motorcycle;
import chapter_1.object.Vehicle;

public class Main {
    public static void main(String[] args) {
        System.out.println("캡슐화");
        Person person = new Person();
        person.setName("다진마늘");
        person.setAge(25);
        System.out.println("Name : " + person.getName());
        System.out.println("Age : " + person.getAge());

        System.out.println("\n상속 + 다형성");
        Animal myDog = new Dog();
        Animal myCat = new Cat();
        myDog.sound();
        myCat.sound();

        System.out.println("\n추상화");
        Vehicle myCar = new Car();
        Vehicle myMotorcycle = new Motorcycle();
        myCar.displayType();
        myCar.startEngine();
        myMotorcycle.displayType();
        myMotorcycle.startEngine();
    }
}
