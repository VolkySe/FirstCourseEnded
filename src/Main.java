import java.util.Random;

public class Main {

    private final static Random RANDOM = new Random();
    private final static String[] NAMES = {"Аарон", "Абдулла", "Абрам", "Аваз", "Августин", "Авраам", "Агап", "Агапит", "Агат", "Агафон", "Адам", "Адриан"};
    private final static String[] SURNAMES = {"Смирнов", "Иванов", "Кузнецов", "Соколов", "Попов", "Лебедев", "Козлов", "Новиков", "Морозов", "Петров"};
    private final static String[] PATRONYMIC = {"Абакумович", "Абрамович", "Абросимович", "Аввакумович", "Августович", "Авдеевич", "Авдиевич", "Авенирович", "Авериевич", "Аверкиевич"};

    private static void initEmployers() {
        for (int i = 0; i < EMPLOYEER.length; i++) {
            EMPLOYEER[i] = new Employeer(
                    SURNAMES[RANDOM.nextInt(0, SURNAMES.length)],
                    NAMES[RANDOM.nextInt(0, NAMES.length)],
                    PATRONYMIC[RANDOM.nextInt(0, PATRONYMIC.length)],
                    RANDOM.nextInt(1, 6),
                    RANDOM.nextInt(100_000, 500_000));
        }
    }

    private final static Employeer[] EMPLOYEER = new Employeer[10];

    public static void main(String[] args) {
        initEmployers();
        outputEmployersInfo();
        System.out.println("Сумма затрат на зарплату в месяц = " + calculateSumOfSalaries());
        System.out.println("Сотрудник с минимальной зарплатой = " + findEmployeerWithMinSalary());
        System.out.println("Сотрудник с максимальной зарплатой = " + findEmployeerWithMaxSalary());
        System.out.println("Средняя зарплата сотрудника = " + calculateAverageSalary());
        System.out.println("Список сотрудников: ");
        outputEmployersFullNames();

    }

    private static void outputEmployersInfo() {
        for (Employeer employeer : EMPLOYEER) {
            System.out.println(employeer);
        }
    }
    private static void outputEmployersFullNames() {
        for (Employeer employeer : EMPLOYEER) {
            System.out.println(employeer.getFULLNAME());
        }
    }

    private static int calculateSumOfSalaries() {
        int sum = 0;
        for (Employeer employeer : EMPLOYEER)
            sum += employeer.getSalary();
        return sum;
    }

    private static double calculateAverageSalary() {
        return (double) calculateSumOfSalaries() / EMPLOYEER.length;
    }

    private static Employeer findEmployeerWithMinSalary() {
        Employeer employeerWithMinSalary = null;
        for (Employeer employeer : EMPLOYEER)
            if (employeerWithMinSalary == null || employeer.getSalary() < employeerWithMinSalary.getSalary()) {
                employeerWithMinSalary = employeer;
            }
        return employeerWithMinSalary;
    }

    private static Employeer findEmployeerWithMaxSalary() {
        Employeer employeerWithMaxSalary = null;
        for (Employeer employeer : EMPLOYEER)
            if (employeerWithMaxSalary == null || employeer.getSalary() > employeerWithMaxSalary.getSalary()) {
                employeerWithMaxSalary = employeer;
            }
        return employeerWithMaxSalary;
    }


}