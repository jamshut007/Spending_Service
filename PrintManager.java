import java.util.List;

public class PrintManager {
    public void printMenu() {
        System.out.println("Выберете действие:");
        System.out.println("1 - Добавить участника.");
        System.out.println("2 - Добавить трату.");
        System.out.println("3 - Получить список всех участников сессии с их долгами.");
        System.out.println("0 - Выйти из программы");
    }

    public void printMenuExpense() {
        System.out.println("1 - За одного человека.");
        System.out.println("2 - За несколько человек.");
        System.out.println("3 - За всех");
    }

    public void printListExpenses(List<Expense> expenses) {
        for (Expense expense : expenses) {
            System.out.println(expense.getFrom().getName() + " должен " + expense.getTo().getName() + " " + expense.getSum());
        }
    }
}
