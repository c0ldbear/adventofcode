import java.io.*;
import java.util.Scanner;

class main {

    public static void main(String[] args) {
        System.out.println("Hello!");
        Tester01();
        Assignment01();

        Tester02();

    }
    
    public static void Tester02() {
       double[] masses = {14, 1969, 100756};
       double[] fuelAnswers = {2, 966, 50346};

       double fuelTest;
       double fuelAnswer;
       double totalFuel = 0.0;
       
       for(int i = 0; i < masses.length; i++)
       {
           fuelAnswer = fuelAnswers[i];
           fuelTest = TotalFuelCalculations(masses[i]);

           System.out.printf("Testing mass: %.0f\n", masses[i]);

           if(fuelTest == fuelAnswer)
           {
               System.out.println("Test pass.");
               System.out.printf("Answer: %.0f\n", fuelTest);
           }
           else
           {
               System.out.println("Test fail!");
               System.out.printf("\tCorrect answer is %.0f NOT %.0f\n", fuelAnswer, fuelTest);
               return;
           }

           totalFuel += fuelTest;
           System.out.println();

       }

       System.out.printf("Total fuel needed: %.0f\n", totalFuel);

   }
    public static void Assignment01() {

        File inputFile = new File("input.txt");

        try {

            Scanner inputFileScanner = new Scanner(inputFile);

            double mass = 0;
            double totalFuel = 0.0;

            while (inputFileScanner.hasNextDouble())
            {
               mass = inputFileScanner.nextDouble(); 
               totalFuel += FuelCalculations(mass);
            }

            inputFileScanner.close();
            System.out.printf("Required fuel: %.0f\n", totalFuel);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        
   }

   public static void Tester01() {
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

           if(fuelTest == fuelAnswer)
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


    private static double FuelCalculations(double mass) {
        double fuel = 0;
        double containerVolume = 3.0;
        double fuelLoss = 2.0;

        fuel = mass / containerVolume;
        fuel = Math.floor(fuel);
        fuel -= fuelLoss;

        return fuel;
    }

    private static double TotalFuelCalculations(double mass) {

    }