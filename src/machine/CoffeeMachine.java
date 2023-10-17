package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {

        int water = 400; // ml
        int milk = 540; // ml
        int coffeeBeans = 120; // g
        int cups = 9;
        int money = 550;
        String action = "";

        while (!(action.equals("exit"))) {
            // amount of products currently in coffee machine

            Scanner scanner = new Scanner(System.in);

            System.out.println("Write action (buy, fill, take, remaining, exit):");
            action = scanner.nextLine();

            if (action.equals("exit")) {
                break;
            }

            switch (action) {
                case "buy":
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
                    String choice = scanner.nextLine();

                    if (choice.equals("back")) {
                        break;
                    }

                    if (Integer.parseInt(choice) == 1) {
                        int waterEspresso = 250;
                        int beansEspresso = 16;
                        int costEspresso = 4;

                        if (water >= waterEspresso && coffeeBeans >= beansEspresso && cups > 0) {
                            System.out.println("I have enough resources, making you a coffee!");
                            System.out.println();
                            water -= waterEspresso;
                            coffeeBeans -= beansEspresso;
                            money += costEspresso;
                            cups--;
                        } else if (water < waterEspresso && coffeeBeans >= beansEspresso && cups > 0) {
                            System.out.println("Sorry, not enough water!");
                            System.out.println();
                        } else if (water >= waterEspresso && coffeeBeans < beansEspresso && cups > 0) {
                            System.out.println("Sorry, not enough coffee beans!");
                            System.out.println();
                        } else if (water >= waterEspresso && coffeeBeans >= beansEspresso && cups == 0) {
                            System.out.println("Sorry, not enough disposable cups!");
                            System.out.println();
                        } else {
                            System.out.println("Sorry, not enough resources in coffee machine, for details check the remaining");
                            System.out.println();
                        }

                    } else if (Integer.parseInt(choice) == 2) {
                        int waterLatte = 350;
                        int milkLatte = 75;
                        int beansLatte = 20;
                        int costLatte = 7;

                        if (water >= waterLatte && milk >= milkLatte && coffeeBeans >= beansLatte && cups > 0) {
                            System.out.println("I have enough resources, making you a coffee!");
                            System.out.println();
                            water -= waterLatte;
                            milk -= milkLatte;
                            coffeeBeans -= beansLatte;
                            money += costLatte;
                            cups--;
                        } else if (water < waterLatte && milk >= milkLatte && coffeeBeans >= beansLatte && cups > 0) {
                            System.out.println("Sorry, not enough water!");
                            System.out.println();
                        } else if (water >= waterLatte && milk < milkLatte && coffeeBeans >= beansLatte && cups > 0) {
                 ]           System.out.println("Sorry, not enough milk!");
                            System.out.println();
                        } else if (water >= waterLatte && milk >= milkLatte && coffeeBeans < beansLatte && cups > 0) {
                            System.out.println("Sorry, not enough coffee beans!");
                            System.out.println();
                        } else if (water >= waterLatte && milk >= milkLatte && coffeeBeans >= beansLatte && cups == 0) {
                            System.out.println("Sorry, not enough disposable cups!");
                            System.out.println();
                        } else {
                            System.out.println("Sorry, not enough resources in coffee machine, for details check the remaining");
                            System.out.println();
                        }


                    } else if (Integer.parseInt(choice) == 3) {
                        int waterCappuccino = 200;
                        int milkCappuccino = 100;
                        int beansCappuccino = 12;
                        int costCappuccino = 6;

                        if (water >= waterCappuccino && milk >= milkCappuccino && coffeeBeans >= beansCappuccino && cups > 0) {
                            System.out.println("I have enough resources, making you a coffee!");
                            System.out.println();
                            water -= waterCappuccino;
                            milk -= milkCappuccino;
                            coffeeBeans -= beansCappuccino;
                            money += costCappuccino;
                            cups--;
                        } else if (water < waterCappuccino && milk >= milkCappuccino && coffeeBeans >= beansCappuccino && cups > 0) {
                            System.out.println("Sorry, not enough water!");
                            System.out.println();
                        } else if (water >= waterCappuccino && milk < milkCappuccino && coffeeBeans >= beansCappuccino && cups > 0) {
                            System.out.println("Sorry, not enough milk!");
                            System.out.println();
                        } else if (water >= waterCappuccino && milk >= milkCappuccino && coffeeBeans < beansCappuccino && cups > 0) {
                            System.out.println("Sorry, not enough coffee beans!");
                            System.out.println();
                        } else if (water >= waterCappuccino && milk >= milkCappuccino && coffeeBeans >= beansCappuccino && cups == 0) {
                            System.out.println("Sorry, not enough disposable cups!");
                            System.out.println();
                        } else {
                            System.out.println("Sorry, not enough resources in coffee machine, for details check the remaining");
                            System.out.println();
                        }


                    } else {
                        System.out.println("Please select between 1 and 3.");
                    }
                    break;

                case "fill":
                    System.out.println("Write how many ml of water you want to add:");
                    int fillWater = scanner.nextInt();

                    System.out.println("Write how many ml of milk you want to add:");
                    int fillMilk = scanner.nextInt();

                    System.out.println("Write how many grams of coffee beans you want to add:");
                    int fillBeans = scanner.nextInt();

                    System.out.println("Write how many disposable cups you want to add:");
                    int fillCups = scanner.nextInt();
                    System.out.println();

                    water += fillWater;
                    milk += fillMilk;
                    coffeeBeans += fillBeans;
                    cups += fillCups;
                    break;

                case "take":
                    System.out.printf("I gave you $%d", money);
                    System.out.println();
                    money = 0;
                    break;

                case "remaining":
                    System.out.println("The coffee machine has:");
                    System.out.printf("%d ml of water\n", water);
                    System.out.printf("%d ml of milk\n", milk);
                    System.out.printf("%d g of coffee beans\n", coffeeBeans);
                    System.out.printf("%d disposable cups\n", cups);
                    System.out.printf("$%d of money\n", money);
                    System.out.println();
                    break;

                default:
                    System.out.println("Please choose correct operation.");
                    System.out.println();
            }
        }
    }
}

