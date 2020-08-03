import java.util.Scanner;

public class CoffeeMachine {
    static int water = 400;
    static int milk = 540;
    static int coffeeBeans = 120;
    static int cups = 9;
    static int money = 550;


    public static void fill(){
        System.out.println("Write how many ml of water do you want to add:");
        Scanner scanner = new Scanner(System.in);
        water += scanner.nextInt();
        System.out.println("Write how many ml of milk do you want to add:");
        milk += scanner.nextInt();
        System.out.println("Write how many grams of coffee beans do you want to add:");
        coffeeBeans += scanner.nextInt();
        System.out.println("Write how many disposable cups of coffee do you want to add:");
        cups += scanner.nextInt();
        options();


    }
    public static void currentValues(){
        System.out.println("The coffee machine has:");
        System.out.println(water + " of water");
        System.out.println(milk + " of milk");
        System.out.println(coffeeBeans + " of coffee beans");
        System.out.println(cups + " of disposable cups");
        System.out.println("$" + money + " of money");
        options();
        return;
    }
    public static void take(){
        System.out.println("I give you " + money);
        money = 0;
        options();
        return;
    }
    public static void buy(){
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        Scanner scanner = new Scanner(System.in);
        switch (scanner.next()){
            case "1":
                espresso();
                options();
                break;
            case "2":
                latte();
                options();

                break;
            case "3":
                cappuccino();
                options();

                break;
            case "back":
                options();
        }
    }


    private static void cappuccino() {
        if (water < 200){
            System.out.println("Sorry, not enough water!");
            return;
        }else if (milk < 100){
            System.out.println("Sorry, not enough milk!");
            return;
        }
        else if (coffeeBeans < 12){
            System.out.println("Sorry, not enough coffee beans!");
            return;
        }else if (cups == 0){
            System.out.println("Sorry, not enough disposable cups!");
            return;
        }else{
            water -=200;
            milk -= 100;
            coffeeBeans -=12;
            cups--;
            money +=6;
            System.out.println("I have enough resources, making you a coffee!");
            return;
        }

    }


    public static void espresso() {
        if (water < 250) {
            System.out.println("Sorry, not enough water!");
            return;
        } else if (coffeeBeans < 16) {
            System.out.println("Sorry, not enough coffee beans!");
            return;
        } else if (cups == 0) {
            System.out.println("Sorry, not enough disposable cups!");
            return;
        } else {
            water -= 250;
            coffeeBeans -= 16;
            cups--;
            money += 4;
            System.out.println("I have enough resources, making you a coffee!");
            return;
        }
    }
    public static void latte(){
        if (water < 350){
            System.out.println("Sorry, not enough water!");
            return;
        }else if (milk < 75){
            System.out.println("Sorry, not enough milk!");
            return;
        }
        else if (coffeeBeans < 20){
            System.out.println("Sorry, not enough coffee beans!");
            return;
        }else if (cups == 0){
            System.out.println("Sorry, not enough disposable cups!");
            return;
        }else{
            water -=350;
            milk -= 75;
            coffeeBeans -=20;
            cups--;
            money +=7;
            System.out.println("I have enough resources, making you a coffee!");
            return;
    }}


    public static void options(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nWrite action (buy, fill, take, remaining, exit):");
        switch (scanner.next()){
            case "fill":
                fill();
                break;
            case "take":
                take();
                break;
            case "buy":
                buy();
                break;
            case "exit":
                System.exit(0);
            case "remaining":
                currentValues();
        }
    }

    public static void main(String[] args) {
        options();




    }
}
