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
       double fuelAnswer;
       
       for(int i = 0; i < masses.length; i++)
       {
           mass = masses[i];
           fuelAnswer = fuelAnswers[i];

           System.out.printf("Testing mass: %.0f\n", mass);

           if(TestMasses(mass, fuelAnswer))
           {
               System.out.println("Test pass.");
           }
           else
           {
               System.out.println("Test fail!");
               System.out.printf("\tCorrect answer is %.0f NOT %.0f\n", fuelAnswer, FuelCalculations(mass));
               break;
           }

           System.out.println();

       }
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

} 