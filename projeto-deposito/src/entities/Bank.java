package entities;

public class Bank {
    private String name;
    private int number;
    private double deposit;

    public Bank(String name, int number, double deposit) {
        this.name = name;
        this.number = number;
        depositValue(deposit);
    }

    public Bank(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public double getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDeposit() {
        return deposit;
    }

    public void depositValue(double deposit){
        this.deposit += deposit;
    }

    public void withdrawValue(double deposit){
        this.deposit -= deposit + 5;
    }

    public String toString(){
        return "Account " +
                String.format("%.0f", getNumber()) +
                ", Holder: " +
                getName() +
                ", Balance: $ " +
                String.format("%.2f", getDeposit());
    }
}
