public class Expense {
    private double amount;
    private Person from;
    private Person to;

    public Expense(double amount, Person from, Person to) {
        this.amount = amount;
        this.from = from;
        this.to = to;
    }

    public double getSum() {
        return amount;
    }

    public Person getFrom() {
        return from;
    }

    public Person getTo() {
        return to;
    }
}
