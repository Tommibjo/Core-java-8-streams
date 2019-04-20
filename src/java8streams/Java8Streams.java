/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java8streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author tommib
 */
public class Java8Streams {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer[] reqIds = {2, 5, 8, 9, 1};
        // Not real repository, but just plain class holding employees in array
        EmployeeRepository employeeRepository = new EmployeeRepository();
        // Streams Integers from array to ArrayList & prints the integers from ArrayList via stream.
        List<Integer> chosenOnes = Stream.of(reqIds).collect(Collectors.toList());
        chosenOnes.stream().forEach(s -> System.out.println(s));

        // Gathers list of emmployees with req(uired)Ids & prints them out via stream
        List<Employee> requiredEmployees = Stream.of(reqIds).map(employeeRepository::findByID).collect(Collectors.toCollection(ArrayList::new));
        requiredEmployees.stream().forEach(s -> System.out.println(s.toString()));
        
    }

}
