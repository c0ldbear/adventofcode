class main {

   public static void main(String[] args){
      System.out.println("Hello!"); 
      Tester();

   }

   public static void Tester()
   {
       double[] masses = {12, 14, 1969, 100756};
       double[] fuelAnswers = {2, 2, 654, 33583};
       double mass;
       double fuelTest;
       double fuelAnswer;
       double totalFuel = 0.0;
       
       for(int i = 0; i < masses.length; i++)
       {
           mass = masses[i];
           fuelAnswer = fuelAnswers[i];
           fuelTest = FuelCalculations(mass);

           System.out.printf("Testing mass: %.0f\n", mass);

           if(TestMasses(mass, fuelAnswer))
           {
               System.out.println("Test pass.");
               System.out.printf("Answer: %.0f\n", fuelTest);
           }
           else
           {
               System.out.println("Test fail!");
               System.out.printf("\tCorrect answer is %.0f NOT %.0f\n", fuelAnswer, fuelTest);
               break;
           }

           totalFuel += fuelTest;
           System.out.println();

       }

       System.out.printf("Total fuel needed: %.0f\n", totalFuel);

   }

   public static boolean TestMasses(double mass, double fuelAnswer)
   {
       double fuel = FuelCalculations(mass);
       if (fuel == fuelAnswer)
       {
           return true;
       }
       else
       {
           return false;
       }
   }

    private static double FuelCalculations(double mass) {
        double fuel = 0;
        double containerVolume = 3.0;
        double fuelLoss = 2.0;

        fuel = mass / containerVolume;
        fuel = Math.floor(fuel);
        fuel -= fuelLoss;

        return fuel;
    }

    private static double FuelRequirements(double[] masses)
    {
        double totalFuel = 0.0;

        for(double mass : masses)
        {
            totalFuel += FuelCalculations(mass);
        }
        
        return totalFuel;
    }

} 