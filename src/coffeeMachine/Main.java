package machine;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CoffeeMachine {
    int water = 400, milk = 540, coffeeBeans = 120, disposableCups = 9, money = 550;
    public static void main(String[] args) throws IOException {
        CoffeeMachine machine = new CoffeeMachine();
        while (true) {
            System.out.println("Write action (buy, fill, take, remaining, exit): ");
            BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
            String action =  scanner.readLine();
            switch (action) {
                case "buy":
                    machine.buy();
                    break;
                case "fill":
                   machine.fill();
                    break;
                case "take":
                    machine.take();
                    break;
                case "remaining":
                  machine.remaining();
                    break;
                case "exit":
                    return ;
                default:
                    System.out.println("Error");
            }

        }

    public void remaining(){
        System.out.println("The coffee machine has:");
        System.out.println(water + " of water ");
        System.out.println(milk + " of milk ");
        System.out.println(coffeeBeans + " of coffee beans ");
        System.out.println(disposableCups + " of disposable cups ");
        System.out.println(money + " of money ");
    }
    public void buy() throws IOException {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
        String action =  scanner.readLine();
        switch (action){
            case "1":
                if (water >= 250 && coffeeBeans >= 16 && disposableCups >= 1){
                    System.out.println("I have enough resources, making you a coffee!");
                    water -=  250;
                    coffeeBeans -= 16;
                    disposableCups -= 1;
                    money += 4;

                }else{
                    System.out.println("Sorry, not enough water!");
                }
                break;
            case "2":
                if (water >= 350 && coffeeBeans >= 20 && disposableCups >= 1 && milk >= 75){
                    System.out.println("I have enough resources, making you a coffee!");
                    water -= 350;
                    milk -= 75;
                    coffeeBeans -= 20;
                    disposableCups -= 1;
                    money += 7;

                }else{
                    System.out.println("Sorry, not enough water!");
                }
                break;
            case "3":
                if (water >= 200 && coffeeBeans >= 12 && disposableCups >= 1 && milk >= 100){
                    System.out.println("I have enough resources, making you a coffee!");
                    water -= 200 ;
                    milk -= 100;
                    coffeeBeans -= 12;
                    disposableCups -= 1;
                    money += 6;

                }else{
                    System.out.println("Sorry, not enough water!");
                }
                break;
            case "back":
                break;
            default:
                System.out.println("Error");
        }
    }

    public  void fill() throws IOException {
        System.out.println("Write how many ml of water do you want to add: ");
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
        int fwater = Integer.parseInt(scanner.readLine());
        water += fwater;
        System.out.println("Write how many ml of milk do you want to add: ");
        int fmilk = Integer.parseInt(scanner.readLine());
        milk += fmilk;
        System.out.println("Write how many grams of coffee beans do you want to add: ");
        int fcoffeebeans = Integer.parseInt(scanner.readLine());
        coffeeBeans += fcoffeebeans;
        System.out.println("Write how many disposable cups of coffee do you want to add: ");
        int fdisposablecups = Integer.parseInt(scanner.readLine());
        disposableCups += fdisposablecups;

    }
   public void take(){
        System.out.println("I gave you $" + money);
        money = 0;
    }
}
