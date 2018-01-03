package inheritance;

/**
 * This program demonstrate inheritance.
 * @version 1.01 2017-12-18
 * @author MA SI YUAN
 */
public class ManagerTest
{
    public static void main(String[] args) 
    {
        // construct a Manager object
        Manager boss = new Manager("Carl Cracker", 80000, 1987, 12, 15);
        boss.setBonus(5000);

        Employee[] staff = new Employee[3];

        // fill the staff array with Manager and Employee objects

        Staff[0] = boss;
        Staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        Staff[2] = new Employee("Tommy Tester", 40000, 1990, 3, 15);

        // print out information about all Employee objects
        for(Employee e : staff)
        {
            System.out.println("name=" + e.getName() + ",salary=" + e.getSalary());
        }

        
    }
}