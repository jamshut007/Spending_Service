import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ExpenseManager session = new ExpenseManager();
        PrintManager printManager = new PrintManager();
        while (true) {
            printManager.printMenu();
            int point = scanner.nextInt();
            switch (point) {
                case 1:
                    System.out.println("Введите имя:");
                    String name = scanner.next();
                    Person person = new Person(name);
                    session.createPerson(person);
                    break;
                case 2:
                    System.out.println("Введите трату");
                    double amount = scanner.nextDouble();
                    System.out.println("От кого:");
                    String from = scanner.next();
                    printManager.printMenuExpense();
                    int position = scanner.nextInt();
                    switch (position) {
                        case 1:
                            for (Person manFrom : session.getPersons()) {
                                if (manFrom.getName().equals(from)) {
                                    System.out.println("Кому:");
                                    String to = scanner.next();
                                    for (Person manTo : session.getPersons()) {
                                        if (manTo.getName().equals(to)) {
                                            Expense expense = new Expense(amount, manFrom, manTo);
                                            session.createExpense(expense);
                                        }
                                    }
                                }
                            }
                            break;
                        case 2:
                            System.out.println("За сколько человек");
                            int pointsMan = scanner.nextInt();
                            for (int i = 0; i < pointsMan; i++) {
                                System.out.println("Введите имя");
                                for (Person manFrom : session.getPersons()) {
                                    if (manFrom.getName().equals(from)) {
                                        System.out.println("Кому:");
                                        String to = scanner.next();
                                        for (Person manTo : session.getPersons()) {
                                            if (manTo.getName().equals(to)) {
                                                double money = amount / pointsMan;
                                                Expense expense = new Expense(money, manFrom, manTo);
                                                session.createExpense(expense);
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        case 3:
                            for (Person manFrom : session.getPersons()) {
                                if (manFrom.getName().equals(from)) {
                                    for (Person manTo : session.getPersons()) {
                                        if (!(manTo.getName().equals(from))) {
                                            double money = amount / session.getPersons().size();
                                            Expense expense = new Expense(money, manFrom, manTo);
                                            session.createExpense(expense);
                                        }
                                    }
                                }
                            }

                            break;
                        default:
                            System.out.println("Такого действия нет!");
                            break;
                    }
                case 3:
                    printManager.printListExpenses(session.getExpenses());
                    break;
                case 0:
                    System.out.println("Выход!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Такого действия нет!");
            }
        }
    }
}
