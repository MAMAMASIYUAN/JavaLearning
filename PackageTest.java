import com.horstmann.corejava.*;
// the Employee class isdefined in that package

import static java.lang.System.*;

/**
 * This program demonstrates the use of packages
 * @version 1.01 2017-12-17
 * @author MA SI YUAN
 */
public class PackageTest
{
    public static void main(String[] args) 
    {
        // because of the import statement,. we don't have to use
        // com.horstamnn.corejava.Employee here
        Employee harry = new Employee("Harry Hacker", 50000.0, 1989, 10, 1);

        harry.raiseSalary(5);

        // because of the static import statement, we don't have to use System.out here
        out.println("name=" + harry.getName() + ",salary=" + harry.getSalary());
        
    }
}