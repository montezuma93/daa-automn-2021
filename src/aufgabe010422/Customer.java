package aufgabe010422;

public class Customer {
    private String firstName;
    private String lastName;
    private int accountNumber;
    private double money;
    private double limit;



    public Customer(String firstName, String lastName, int accountNumber, double limit) {
        this.firstName=firstName;
        this.lastName=lastName;
        this.accountNumber=accountNumber;
        this.limit=limit;
        this.money=0;
    }

    public void deposit(double moneyToAdd){
        money=moneyToAdd;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
