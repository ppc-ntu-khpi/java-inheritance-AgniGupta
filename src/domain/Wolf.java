package domain;

public class Wolf extends Predator {

    private String kind;

    public Wolf(String name, int weight, int age, String kind) {
        this.name=name;
        this.weight=weight;
        this.age=age;
        this.kind=kind;
    }

    public Wolf() {
         this("Bob",70,12,"Arctic");
    }
    public Wolf(String name) {
        this(name,70,12, "Arctic");
    }


    @Override
    public void hunt() {
        System.out.println("Wolf is hunting for an deer...");
    }

    @Override
    public String toString() {
        return super.toString()+"\nKind:\t"+this.kind+"\n\nThis is wolf"; 
    } 
    
    @Override
    public void speak() {
         System.out.println("Owooooo");
    }

    @Override
    public void eat() {
        System.out.println("Wolf eats meat");
    }
    
    
    
}
