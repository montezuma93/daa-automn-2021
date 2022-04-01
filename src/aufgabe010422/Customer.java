package aufgabe010422;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String firstName;
    private String lastName;
    private int accountNumber;
    private double money;
    private double limit;
    private List<String> accountHistory;

    public Customer(String firstName, String lastName, int accountNumber, double limit) {
        this.accountHistory = new ArrayList<>();
        this.firstName=firstName;
        this.lastName=lastName;
        this.accountNumber=accountNumber;
        this.limit=limit;
        this.money=0;
    }
    public void withdraw(double moneyToTake) {
        if (moneyToTake >= money + limit) {
            System.out.println("Not enough Money");
        }else {
            money = money - moneyToTake;
            accountHistory.add("withdraw "+ moneyToTake +"/ Account Balance: " + money);
        }
    }

    public void printAccountStatement(){

        for(String entry:accountHistory){
            System.out.println(entry);
        }
    }


    public void deposit(double moneyToAdd){
        money=money+moneyToAdd;
        accountHistory.add("deposit "+ moneyToAdd +"/ Account Balance: " + money);
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
