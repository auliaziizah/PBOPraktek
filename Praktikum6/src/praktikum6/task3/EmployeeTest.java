/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6.task3;

/**
 *
 * @author Asus
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Antonio Rossi", 2000000, 1, 10, 1989);
        staff[1] = new Employee("Maria Bianchi", 2500000, 1, 12, 1991);
        staff[2] = new Employee("Isabel Vidal", 3000000, 1, 11, 1993);
        
//        Sortable.shell_sort(staff);

        int i;
        for (i = 0; i < 3; i++) staff[i].raiseSalary(5);
        for (i = 0; i < 3; i++) staff[i].print();

        // Memanggil metode compare untuk membandingkan dua objek Employee
        Employee employee1 = staff[0];
        Employee employee2 = staff[1];
        int comparisonResult = employee1.compare(employee2);

        if (comparisonResult == -1) {
            System.out.println("The salary of the first employee is lower than the second employee's salary.");
        } else if (comparisonResult == 1) {
            System.out.println("The salary of the second employee is higher than the second employee's salary.");
        } else {
            System.out.println("Both employees have the same salary.");
        }
    }
}
