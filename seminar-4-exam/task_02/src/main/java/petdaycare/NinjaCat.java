package petdaycare;

// Write your code below!

public class NinjaCat extends Pet{
    private int stealthLevel;

    public NinjaCat(String name, int age, double baseFee, int stealthLevel) {
    super(name, age, baseFee);
    if (stealthLevel > 10 || stealthLevel < 0 ) {
        throw new IllegalArgumentException("Must be between 0 - 10");
    } else {
        this.stealthLevel = stealthLevel;
    }
   }

   @Override
   public double calculateDailyCost() {
    return (super.getBaseFee() - (this.stealthLevel * 10));
   }

   @Override
   public void makeSound() {
       System.out.print("...");
   }

   public int getStealthLevel() {
    return this.stealthLevel;
   }
}