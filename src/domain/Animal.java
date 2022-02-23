package domain;

public class Animal {

    protected String name;

    protected  int weight;

    protected  int age;

    protected  Object untitledField;

    public Animal() {
        name="generic animal"; 
        weight=70;
        age=12;
    }

    public void eat() {
        System.out.println("Animal is eating...");
    }

    public void speak() {
        System.out.println("Animal is speaking...");
    }

    @Override
    public String toString() {
        return "Animal:" + "\nName:\t" + name + "\nWeight:\t" + weight + " kg" + "\nAge:\t" + age ;
    }

}