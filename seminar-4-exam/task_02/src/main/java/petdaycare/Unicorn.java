package petdaycare;

// Write your code below!

public class Unicorn extends Pet{
    private int glitterLevel;

    public Unicorn(String name, int age, double baseFee, int glitterLevel) {
    super(name, age, baseFee);
    if (glitterLevel > 5 || glitterLevel < 0 ) {
        throw new IllegalArgumentException("Must be between 0 - 5");
    } else {
        this.glitterLevel = glitterLevel;
    }
   }

   @Override
   public double calculateDailyCost() {
    return (super.getBaseFee() + (this.glitterLevel * 30));
   }

   @Override
   public void makeSound() {
       System.out.print("Neigh... ✨sparkle sparkle✨");
   }

    public int getGlitterLevel() {
    return this.glitterLevel;
   }
}