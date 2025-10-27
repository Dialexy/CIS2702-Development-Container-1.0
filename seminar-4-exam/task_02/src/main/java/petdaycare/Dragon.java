package petdaycare;

// Write your code below!

public class Dragon extends Pet {

    private int fireBreathIntensity;

   public Dragon(String name, int age, double baseFee, int fireBreathIntensity) {
    super(name, age, baseFee);
    if (fireBreathIntensity > 10 || fireBreathIntensity < 0 ) {
        throw new IllegalArgumentException("Must be between 0 - 10");
    } else {
        this.fireBreathIntensity = fireBreathIntensity;
    }
   }

   @Override
   public double calculateDailyCost() {
    return (super.getBaseFee() + (this.fireBreathIntensity * 50));
   }

   @Override
   public void makeSound() {
       System.out.print("ROAAAAR! 🔥");
   }

   public int getFireBreathIntensity() {
    return this.fireBreathIntensity;
   }
}