import java.util.Random;

class EmployeeBook {

    final Random RANDOM = new Random();
    final String[] NAMES = {"Аарон", "Абдулла", "Абрам", "Аваз", "Августин", "Авраам", "Агап", "Агапит", "Агат", "Агафон", "Адам", "Адриан"};
    final String[] SURNAMES = {"Смирнов", "Иванов", "Кузнецов", "Соколов", "Попов", "Лебедев", "Козлов", "Новиков", "Морозов", "Петров"};
    final String[] PATRONYMIC = {"Абакумович", "Абрамович", "Абросимович", "Аввакумович", "Августович", "Авдеевич", "Авдиевич", "Авенирович", "Авериевич", "Аверкиевич"};
    float indexingPercent;

    void initEmployers() {
        for (int i = 0; i < EMPLOYEER.length; i++) {
            EMPLOYEER[i] = new Employeer(SURNAMES[RANDOM.nextInt(0, SURNAMES.length)],
                    NAMES[RANDOM.nextInt(0, NAMES.length)],
                    PATRONYMIC[RANDOM.nextInt(0, PATRONYMIC.length)],
                    RANDOM.nextInt(1, 6),
                    RANDOM.nextInt(100_000, 500_000));
        }
    }

    final Employeer[] EMPLOYEER = new Employeer[10];

    void outputEmployersInfo() {
        System.out.println("Список сотрудников: ");
        for (Employeer employeer : EMPLOYEER) {
            System.out.println(employeer);
        }
    }

    void outputEmployersInfo(int inDepartment) {
        System.out.println("Список сотрудников в отделе: " + inDepartment + " :");
        for (Employeer employeer : EMPLOYEER) {
            if (employeer.getDepartment() == inDepartment) {
                System.out.println(employeer.toString(inDepartment));
            }
        }
    }

    void outputEmployersFullNames() {
        for (Employeer employeer : EMPLOYEER) {
            System.out.println(employeer.getFULLNAME());
        }
    }

    int calculateSumOfSalaries() {
        int sum = 0;
        for (Employeer employeer : EMPLOYEER)
            sum += employeer.getSalary();
        return sum;
    }

    int calculateSumOfSalaries(int inDepartment) {
        int sum = 0;
        for (Employeer employeer : EMPLOYEER)
            if (employeer.getDepartment() == inDepartment) {
                sum += employeer.getSalary();
            }
        return sum;
    }

    double calculateAverageSalary() {
        return (double) calculateSumOfSalaries() / EMPLOYEER.length;
    }

    int countPersons(int inDepartmnet) {
        int count = 0;
        for (Employeer employeer : EMPLOYEER)
            if (employeer.getDepartment() == inDepartmnet) {
                count += 1;
            }
        return count;
    }

    double calculateAverageSalary(int inDepartment) {
        return (double) calculateSumOfSalaries(inDepartment) / countPersons(inDepartment);
    }

    Employeer findEmployeerWithMinSalary() {
        Employeer employeerWithMinSalary = null;
        for (Employeer employeer : EMPLOYEER)
            if (employeerWithMinSalary == null || employeer.getSalary() < employeerWithMinSalary.getSalary()) {
                employeerWithMinSalary = employeer;
            }
        return employeerWithMinSalary;
    }

    Employeer findEmployeerWithMinSalary(int inDepartment) {
        Employeer employeerWithMinSalary = null;
        for (Employeer employeer : EMPLOYEER)
            if ((employeerWithMinSalary == null || employeer.getSalary() < employeerWithMinSalary.getSalary()) && inDepartment == employeer.getDepartment()) {
                employeerWithMinSalary = employeer;
            }
        return employeerWithMinSalary;
    }

    Employeer findEmployeerWithMaxSalary() {
        Employeer employeerWithMaxSalary = null;
        for (Employeer employeer : EMPLOYEER)
            if (employeerWithMaxSalary == null || employeer.getSalary() > employeerWithMaxSalary.getSalary()) {
                employeerWithMaxSalary = employeer;
            }
        return employeerWithMaxSalary;
    }

    Employeer findEmployeerWithMaxSalary(int inDepartment) {
        Employeer employeerWithMinSalary = null;
        for (Employeer employeer : EMPLOYEER)
            if ((employeerWithMinSalary == null || employeer.getSalary() > employeerWithMinSalary.getSalary()) && inDepartment == employeer.getDepartment()) {
                employeerWithMinSalary = employeer;
            }
        return employeerWithMinSalary;
    }

    void outputEmployeerLessCheckSalary(int checkSalary) {
        System.out.println("Сотрудники с зарплатой меньше, чем " + checkSalary);
        for (Employeer employeer : EMPLOYEER) {
            employeer.toString(0);
            if (employeer.getSalary() < checkSalary) {
                System.out.println(employeer.toString(0));
            }
        }
    }

    void outputEmployeerMoreCheckSalary(int checkSalary) {
        System.out.println("Сотрудники с зарплатой больше, чем " + checkSalary + " или равной");
        for (Employeer employeer : EMPLOYEER)
            if (employeer.getSalary() >= checkSalary) {
                System.out.println(employeer.toString(0));
            }
    }

    void indexingSalary(float indexingPercent) {

        for (Employeer employeer : EMPLOYEER) {
            employeer.setSalary((int) (employeer.getSalary() * (indexingPercent / 100 + 1)));
        }
    }

    void indexingSalary(float indexingPercent, int inDepartment) {

        for (Employeer employeer : EMPLOYEER) {
            if (employeer.getDepartment() == inDepartment) {
                employeer.setSalary((int) (employeer.getSalary() * (indexingPercent / 100 + 1)));
            }
        }
        outputEmployersInfo();
    }

    boolean isVacant() {
        boolean vacant = false;
        for (Employeer employeer : EMPLOYEER)
            if (employeer == null) { //проверить обращение к части объекта
                vacant = true;
                break;
            }
        return vacant;
    }

    void fireEmployee(int employeeID) {
        //проверить на null id, как себя поведет int
        EMPLOYEER[employeeID - 1] = null;
        outputEmployersInfo();
    }

    Employeer findEmployee(int employeeID) {
        return EMPLOYEER[employeeID - 1];
    }
}
