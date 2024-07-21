package com.arrays;
import java.util.*;
import java.util.stream.Collectors;

public class Employee {
    private String eid;
    private String name;
    private double salary;
    private String city;
    private String emailId;
    private String companyName;
    private Date dob;

    public static void main(String[] args) {
        Employee emp1 = new Employee("1", "Alice", 5000, "New York", "alice@example.com", "ABC Inc.", new Date());
        Employee emp2 = new Employee("2", "Bob", 6000, "Los Angeles", "bob@example.com", "XYZ Corp.", new Date());
        
        List<Employee> empList = new ArrayList<>();
        empList.add(emp1);
        empList.add(emp2);

        // a. Get the list of employee details on location wise: Map<Cityname, List<Employee>>
        Map<String, List<Employee>> empByCity = empList.stream().collect(Collectors.groupingBy(Employee::getCity));

        // b. Get the Hyderabad location list of employee details
        List<Employee> hyderabadEmployees = empByCity.get("Hyderabad");

        // c. Get the max salary emp details or nth salary employee details
        Employee secondHighestSalaryEmp = empList.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .skip(1)
                .findFirst()
                .orElse(null);

        Employee fourthHighestSalaryEmp = empList.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .skip(3)
                .findFirst()
                .orElse(null);

        // d. Emp details in sorting order using either empid or dob or name
        List<Employee> sortedById = empList.stream().sorted(Comparator.comparing(Employee::getEid)).collect(Collectors.toList());
        List<Employee> sortedByDob = empList.stream().sorted(Comparator.comparing(Employee::getDob)).collect(Collectors.toList());
        List<Employee> sortedByName = empList.stream().sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());
    }

    // Getters and Setters
    public String getEid() {
        return eid;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getCity() {
        return city;
    }

    public String getEmailId() {
        return emailId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public Date getDob() {
        return dob;
    }

    public Employee(String eid, String name, double salary, String city, String emailId, String companyName, Date dob) {
        this.eid = eid;
        this.name = name;
        this.salary = salary;
        this.city = city;
        this.emailId = emailId;
        this.companyName = companyName;
        this.dob = dob;
    }
}
