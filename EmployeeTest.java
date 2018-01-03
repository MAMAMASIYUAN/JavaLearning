import java.time.*;

/**
 * This program tests the Employee class.
 * @version 1.01 2017-12-14
 * @author MA SI YUAN
 */
public class EmployeeTest
{
    public static void main(String[] args) 
    {
        // fill the staff array wioth theree Employee objects
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("tester1", 75000.0, 1987, 12, 15);
        staff[1] = new Employee("tester2", 50000.0, 1989, 10, 1);
        staff[2] = new Employee("tester3", 40000.0, 1990, 3, 15);

        // raise everyone's salary by 5%
        for (Employee e : staff)
        {
            e.raiseSalary(5);
        }

        // print out all information of the Employee
        for (Employee e : staff)
        {
            System.out.println("name=" + e.getName() + "salary=" + e.getSalary() + ",hireDay=" + e.getHireDay());
        }
        
    }

    static class Employee
    {
        private String name;
        private double salary;
        private LocalDate hireDay;

        public Employee(String n, double s, int year, int month, int day)
        {
            name = n;
            salary = s;
            hireDay = LocalDate.of(year, month, day);
        }

        public String getName()
        {
            return name;
        }

        public double getSalary()
        {
            return salary;
        }

        public LocalDate getHireDay()
        {
            return hireDay;
        }

        public void raiseSalary(double byPercent)
        {
            double raise = salary * byPercent / 100;
            salary += raise;
        }
    }
}