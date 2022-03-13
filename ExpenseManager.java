import java.util.ArrayList;
import java.util.List;

public class ExpenseManager {
    private List<Person> persons = new ArrayList<>();
    private List<Expense> expenses = new ArrayList<>();

    public List<Person> getPersons() {
        return persons;
    }

    public void createPerson(Person person) {
        persons.add(person);
    }

    public List<Expense> getExpenses() {
        return expenses;
    }

    public void createExpense(Expense expense) {
        expenses.add(expense);
    }
}
