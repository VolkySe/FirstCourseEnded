public class Employeer {
    private static int idGen = 1;

    private final int ID;
    private final String FULLNAME;
    private int department;
    private int salary;


    public Employeer(String surname, String name, String patronymic, int department, int salary) {
        ID = idGen++;
        this.FULLNAME = surname + " " + name + " " + patronymic;
        this.department = department;
        this.salary = salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public String getFULLNAME() {
        return FULLNAME;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public int getID() {
        return ID;
    }

    @Override
    public String toString() {
        return "ID=" + ID +
                ", FULLNAME='" + FULLNAME + '\'' +
                ", department=" + department +
                ", salary=" + salary;
    }

    public String toString(int inDepartment) {
        return "ID=" + ID +
                ", FULLNAME='" + FULLNAME + '\'' +
                ", salary=" + salary;
    }
}


