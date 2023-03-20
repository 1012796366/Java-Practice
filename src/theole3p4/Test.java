package theole3p4;
public class Test {
    public static void main(String[] args) {
        Employee[] employees = new Employee[30];
        for (int i = 0; i < 30; ++i) {
            if(i % 3 == 1) {
                // Week
                employees[i] = new WeekWorker(1500);
            }
            else if (i % 3 == 2) {
                // Month
                employees[i] = new MonthWorker(7000);
            }
            else {
                // Year
                employees[i] = new YearWorker(100000);
            }
        }

        Company c = new Company(employees);
        System.out.printf("总支出：%.2f\n", c.totalSalary());
    }
}

abstract class Employee {
    abstract public double earnings();
}

class YearWorker extends Employee {
    double salary;
    public YearWorker(double salary) {
        this.salary = salary;
    }
    public double earnings() {
        // 1 payday per year
        return salary;
    }
}

class MonthWorker extends Employee {
    double salary;
    public MonthWorker(double salary) {
        this.salary = salary;
    }
    public double earnings() {
        // 12 payday per year
        return 12 * salary;
    }
}

class WeekWorker extends Employee {
    double salary;
    public WeekWorker(double salary) {
        this.salary = salary;
    }
    public double earnings() {
        return 52 * salary;
    }
}

class Company {
    Employee[] employees;
    public Company(Employee[] employees) {
        this.employees = employees;
    }
    public double totalSalary() {
        double salary = 0.0;
        for (Employee employee : employees) {
            salary += employee.earnings();
        }
        return salary;
    }
}