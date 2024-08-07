package nestedclasses.staticclasses;

import nestedclasses.staticclasses.domain.Employee;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Integer int12 = 12;
        String string12 = "Hello World";

        List<Employee> employees = new ArrayList<>(List.of(
                new Employee(10001, "Ralph", 2015),
                new Employee(10005, "Carole", 2021),
                new Employee(10022, "Jane", 2013),
                new Employee(13151, "Laura", 2020),
                new Employee(10050, "Jim", 2018) ));

//        var comparator = new EmployeeComparator<>();
//        employees.sort(comparator);

        employees.sort(new Employee.EmployeeComparator("yearStarted"));
        Employee employee = employees.get(0);

        for (Employee e : employees) {
            System.out.println(e);
        }

    }
}
