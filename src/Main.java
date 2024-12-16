public class Main {

    public static void main(String[] args) {

        EmployeeBook employeeBook = new EmployeeBook();//ляяяяяяяяяя

        employeeBook.initEmployers();
        employeeBook.outputEmployersInfo();
        System.out.println("Сумма затрат на зарплату в месяц = " + employeeBook.calculateSumOfSalaries());
        System.out.println("Сотрудник с минимальной зарплатой = " + employeeBook.findEmployeerWithMinSalary());
        System.out.println("Сотрудник с максимальной зарплатой = " + employeeBook.findEmployeerWithMaxSalary());
        System.out.println("Средняя зарплата сотрудника = " + employeeBook.calculateAverageSalary());
        System.out.println("Список сотрудников: ");
        employeeBook.outputEmployersFullNames();

        float indexingPercent = 10.f;
        employeeBook.indexingSalary(indexingPercent);
        int inDepartment = 2;
        employeeBook.outputEmployersInfo();

        System.out.println("В отделе " + inDepartment + " сотрудник с минимальной зарплатой = " + employeeBook.findEmployeerWithMinSalary(inDepartment));
        System.out.println("В отделе " + inDepartment + " сотрудник с максимальной зарплатой = " + employeeBook.findEmployeerWithMaxSalary(inDepartment));
        System.out.println("В отделе " + inDepartment + " сумма затрат на зарплату в месяц = " + employeeBook.calculateSumOfSalaries(inDepartment));
        System.out.println("В отделе " + inDepartment + " средняя зарплата сотрудника = " + employeeBook.calculateAverageSalary(inDepartment));
        employeeBook.indexingSalary(employeeBook.indexingPercent, inDepartment);
        employeeBook.outputEmployersInfo(inDepartment);

        int checkSalary = 207_000;
        employeeBook.outputEmployeerLessCheckSalary(checkSalary);
        employeeBook.outputEmployeerMoreCheckSalary(checkSalary);

        System.out.println("Добавление сотрудника = " + employeeBook.isVacant());
        employeeBook.fireEmployee(2);
        System.out.println("Добавление сотрудника = " + employeeBook.isVacant());
        System.out.println("Найденный сотрудник = " + employeeBook.findEmployee(3));

    }
}