package machine;

import java.util.Scanner;

public class CoffeeMachine {

    enum State {
        WORKING, BUY, FILL, TAKE, REMAINING, EXIT
    }

    static State state = State.WORKING;
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        while (state != State.EXIT) {
            CoffeeMachineActions.userActionInput();
            CoffeeMachineActions.checkState(state);
            if (state == State.EXIT) {
                break;
            }


        }
    }

    static class CoffeeMachineActions {

        static int water = 400; // ml
        static int milk = 540; // ml
        static int coffeeBeans = 120; // g
        static int cups = 9;
        static int money = 550;


        public static void userActionInput() {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String action = scanner.nextLine();
            switch (action) {
                case "buy":
                    state = State.BUY;
                    break;

                case "fill":
                    state = State.FILL;
                    break;

                case "take":
                    state = State.TAKE;
                    break;

                case "remaining":
                    state = State.REMAINING;
                    break;

                case "exit":
                    state = State.EXIT;
                    break;

                default:
                    System.out.println("USER ACTION INPUT   Please choose correct option");
                    state = State.EXIT;
                    break;
            }
        }

        public static void checkState(State state) {
            switch (state) {
                case BUY:
                    buy();
                    break;
                case FILL:
                    fill();
                    break;
                case TAKE:
                    take();
                    break;
                case REMAINING:
                    remaining();
                    break;
                case EXIT:
                    break;
                default:
                    System.out.println("COFFEE MACHINE STATE      Please choose correct option");
                    break;
            }
        }

        public static void buy() {

            System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
            String choice = scanner.nextLine();

            if (choice.equals("back")) {
                return;
            }

            if (Integer.parseInt(choice) == 1) {
                int waterEspresso = 250;
                int beansEspresso = 16;
                int costEspresso = 4;

                if (water >= waterEspresso && coffeeBeans >= beansEspresso && cups > 0) {
                    water -= waterEspresso;
                    coffeeBeans -= beansEspresso;
                    money += costEspresso;
                    cups--;
                    System.out.println("I have enough resources, making you a coffee!");
                } else if (water < waterEspresso && coffeeBeans >= beansEspresso && cups > 0) {
                    System.out.println("Sorry, not enough water!");
                } else if (water >= waterEspresso && coffeeBeans < beansEspresso && cups > 0) {
                    System.out.println("Sorry, not enough coffee beans!");
                } else if (water >= waterEspresso && coffeeBeans >= beansEspresso && cups == 0) {
                    System.out.println("Sorry, not enough disposable cups!");
                } else {
                    System.out.println("Sorry, not enough resources in coffee machine, for details check the remaining");
                }

            } else if (Integer.parseInt(choice) == 2) {
                int waterLatte = 350;
                int milkLatte = 75;
                int beansLatte = 20;
                int costLatte = 7;

                if (water >= waterLatte && milk >= milkLatte && coffeeBeans >= beansLatte && cups > 0) {
                    water -= waterLatte;
                    milk -= milkLatte;
                    coffeeBeans -= beansLatte;
                    money += costLatte;
                    cups--;
                    System.out.println("I have enough resources, making you a coffee!");
                } else if (water < waterLatte && milk >= milkLatte && coffeeBeans >= beansLatte && cups > 0) {
                    System.out.println("Sorry, not enough water!");
                } else if (water >= waterLatte && milk < milkLatte && coffeeBeans >= beansLatte && cups > 0) {
                    System.out.println("Sorry, not enough milk!");
                } else if (water >= waterLatte && milk >= milkLatte && coffeeBeans < beansLatte && cups > 0) {
                    System.out.println("Sorry, not enough coffee beans!");
                } else if (water >= waterLatte && milk >= milkLatte && coffeeBeans >= beansLatte && cups == 0) {
                    System.out.println("Sorry, not enough disposable cups!");
                } else {
                    System.out.println("Sorry, not enough resources in coffee machine, for details check the remaining");
                }


            } else if (Integer.parseInt(choice) == 3) {
                int waterCappuccino = 200;
                int milkCappuccino = 100;
                int beansCappuccino = 12;
                int costCappuccino = 6;

                if (water >= waterCappuccino && milk >= milkCappuccino && coffeeBeans >= beansCappuccino && cups > 0) {
                    water -= waterCappuccino;
                    milk -= milkCappuccino;
                    coffeeBeans -= beansCappuccino;
                    money += costCappuccino;
                    cups--;
                    System.out.println("I have enough resources, making you a coffee!");
                } else if (water < waterCappuccino && milk >= milkCappuccino && coffeeBeans >= beansCappuccino && cups > 0) {
                    System.out.println("Sorry, not enough water!");
                } else if (water >= waterCappuccino && milk < milkCappuccino && coffeeBeans >= beansCappuccino && cups > 0) {
                    System.out.println("Sorry, not enough milk!");
                } else if (water >= waterCappuccino && milk >= milkCappuccino && coffeeBeans < beansCappuccino && cups > 0) {
                    System.out.println("Sorry, not enough coffee beans!");
                } else if (water >= waterCappuccino && milk >= milkCappuccino && coffeeBeans >= beansCappuccino && cups == 0) {
                    System.out.println("Sorry, not enough disposable cups!");
                } else {
                    System.out.println("Sorry, not enough resources in coffee machine, for details check the remaining");
                }


            } else {
                System.out.println("Please select between 1 and 3.");
            }
        }

        public static void fill() {
            System.out.println("Write how many ml of water you want to add:");
            String fillWater = scanner.nextLine();
            water += Integer.parseInt(fillWater);

            System.out.println("Write how many ml of milk you want to add:");
            String fillMilk = scanner.nextLine();
            milk += Integer.parseInt(fillMilk);

            System.out.println("Write how many grams of coffee beans you want to add:");
            String fillBeans = scanner.nextLine();
            coffeeBeans += Integer.parseInt(fillBeans);

            System.out.println("Write how many disposable cups you want to add:");
            String fillCups = scanner.nextLine();
            cups += Integer.parseInt(fillCups);
        }

        public static void take() {
            System.out.printf("I gave you $%d", money);
            money = 0;
        }

        public static void remaining() {
            System.out.println("The coffee machine has:");
            System.out.printf("%d ml of water\n", water);
            System.out.printf("%d ml of milk\n", milk);
            System.out.printf("%d g of coffee beans\n", coffeeBeans);
            System.out.printf("%d disposable cups\n", cups);
            System.out.printf("$%d of money", money);
        }

    }

}

