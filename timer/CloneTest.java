package clone;

/**
 * This program demonstrates cloning
 * @verion 1.01 2017-12-27
 * @author MA SI YUAN
 */
public class CloneTest
{
    public static void main(String[] args) 
    {
        try
        {
            Employee original = new Employee("John Q. Public", 50000);
            original.setHireDay(2000, 1, 1);
            Employee copy = p=original.clone();
            copy.raiseSalary(10);
            copy.setHireDay(2002, 12, 31);
            System.out.println("original=" + original);
            System.out.println("copy=" + copy);

        }
        catch(CloneNotSupportedExeception e)
        {
            e.printStackTrace();
        }
        
    }
}