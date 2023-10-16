package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
//        System.out.println("Starting to make a coffee");
//        System.out.println("Grinding coffee beans");
//        System.out.println("Boiling water");
//        System.out.println("Mixing boiled water with crushed coffee beans");
//        System.out.println("Pouring coffee into the cup");
//        System.out.println("Pouring some milk into the cup");
//        System.out.println("Coffee is ready!");



        // amount of products to make 1 coffee
        int water = 200; // ml
        int milk = 50; // ml
        int coffeeBeans = 15; // g

//        System.out.printf("For %d cups of coffee you will need:\n", coffeeAmount);
//        System.out.printf("%d ml of water\n", water * coffeeAmount);
//        System.out.printf("%d ml of milk\n", milk * coffeeAmount);
//        System.out.printf("%d g of coffee beans\n", coffeeBeans * coffeeAmount);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many ml of water the coffee machine has:");
        int inputWater = scanner.nextInt();

        System.out.println("Write how many ml of milk the coffee machine has:");
        int inputMilk = scanner.nextInt();

        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        int inputCoffeeBeans = scanner.nextInt();

        System.out.println("Write how many cups of coffee you will need: ");
        int coffeeAmount = scanner.nextInt();

        int coffeeCounter = 0;

        while ((inputWater >= water) && (inputMilk >= milk) && (inputCoffeeBeans >= coffeeBeans)) {
            inputWater -= water;
            inputMilk -= milk;
            inputCoffeeBeans -= coffeeBeans;
            coffeeCounter++;
        }
        if (coffeeCounter == coffeeAmount) {
            System.out.println("Yes, I can make that amount of coffee");
        } else if (coffeeCounter > coffeeAmount) {
            System.out.printf("Yes, I can make that amount of coffee (and even %d more than that)", coffeeCounter - coffeeAmount);
        } else {
            System.out.printf("No, I can make only %d cup(s) of coffee", coffeeCounter);
        }
    }
}

//Заметка - мейби сделать while loop, который будет за каждую итерацию отнимать из inputWater-a значение water, от inputMilk-a milk итд.