/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java8streams;

import java.util.stream.Stream;

/**
 *
 * @author tommib
 */
public class EmployeeRepository {

    Employee[] employees;

    public EmployeeRepository() {
        this.employees = new Employee[]{
            new Employee("Tommi", "Bjorklund", 1),
            new Employee("Linda", "Sillman", 2),
            new Employee("Noel", "Björklund", 3),
            new Employee("Leon", "Björklund", 4),
            new Employee("Harri", "Björklund", 5),
            new Employee("Anne", "Björklund", 6),
            new Employee("Vesa", "Sillman", 7),
            new Employee("Sari-anne", "Björklundd", 8),
            new Employee("Susanna", "Björklund", 9)
        };
    }

    public Employee findByID(int id) {
        return Stream.of(this.employees).filter(s -> s.getId() == id).findAny().orElse(null);
    }
    public int amountOfEmployees(){
        return this.employees.length;
    }

}
