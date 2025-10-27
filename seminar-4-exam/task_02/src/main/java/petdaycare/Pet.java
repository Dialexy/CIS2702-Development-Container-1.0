package petdaycare;

// write your code below!

abstract class Pet {
    private String name;
    private int age;
    private double baseFee;

    public Pet(String name, int age, double baseFee) {
        this.name = name;
        this.age = age;
        this.baseFee = baseFee;
    }

    public double getBaseFee() {
        return this.baseFee;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public abstract double calculateDailyCost();

    public abstract void makeSound();

    public void displayInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
}