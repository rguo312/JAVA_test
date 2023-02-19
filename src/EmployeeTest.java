import java.io.*;
public class EmployeeTest {
    public static  void main(String[] args)
    {
        Employee empOne = new Employee("Runoob1");
        Employee empTwo = new Employee("Runoob2");

        empOne.empAge(26);
        empOne.empSalary(2000);
        empOne.empDesignation("高级程序员");
        empOne.printEmployee();

        empTwo.empAge(30);
        empTwo.empSalary(5000);
        empTwo.empDesignation("高级程序员");
        empTwo.printEmployee();
    }

}
