package day14.collections;

import java.util.LinkedList;

public class DemoLinkedListA {
	public static void main(String[] args) {

		LinkedList<String> list = new LinkedList<>();

		// addFirst()
		System.out.println(list);
		list.addFirst("A");
		list.addFirst("B");
		System.out.println("after addFirst() : " + list);

		// addlast
		System.out.println(list);
		list.addLast("C");
		list.addLast("D");
		System.out.println("after addLast() : " + list);

		// getFirst()
		System.out.println(list);
		System.out.println("getFirst() : " + list.getFirst());

		// getLast()
		System.out.println(list);
		System.out.println("getLast() : " + list.getLast());

		// removeFirst()
		System.out.println(list);
		System.out.println("removeFirst() : " + list.removeFirst());
		System.out.println(list);

		/*
		 * // SecurePayrollSystem.java import java.util.*;
		 * 
		 * // -------------------- Custom Exceptions --------------------
		 * 
		 * // Unchecked Exception for unauthorized access class
		 * UnauthorizedAccessException extends RuntimeException { public
		 * UnauthorizedAccessException(String message) { super(message); } }
		 * 
		 * // Checked Exception for invalid salary values class InvalidSalaryException
		 * extends Exception { public InvalidSalaryException(String message) {
		 * super(message); } }
		 * 
		 * // -------------------- Abstraction -------------------- interface Payroll {
		 * double calculatePay(); // abstract method for polymorphism }
		 * 
		 * // -------------------- Employee Base Class -------------------- abstract
		 * class Employee implements Payroll { private String employeeId; private String
		 * name; private String role; private double salary; // encapsulated
		 * 
		 * public Employee(String employeeId, String name, String role, double salary)
		 * throws InvalidSalaryException { this.employeeId = employeeId; this.name =
		 * name; this.role = role; setSalary(role, salary); // controlled setter }
		 * 
		 * public String getEmployeeId() { return employeeId; } public String getName()
		 * { return name; } public String getRole() { return role; }
		 * 
		 * // Encapsulation: controlled salary setter public void setSalary(String
		 * requesterRole, double salary) throws InvalidSalaryException { if
		 * (!"HR".equalsIgnoreCase(requesterRole)) { throw new
		 * UnauthorizedAccessException("Only HR can modify salary!"); } if (salary <= 0)
		 * { throw new InvalidSalaryException("Salary must be positive!"); } this.salary
		 * = salary; }
		 * 
		 * // Encapsulation: controlled salary getter public double getSalary(String
		 * requesterRole) { if (!"HR".equalsIgnoreCase(requesterRole) &&
		 * !"Manager".equalsIgnoreCase(requesterRole)) { throw new
		 * UnauthorizedAccessException("Access denied to salary details!"); } return
		 * salary; }
		 * 
		 * // Overloading: different ways to display employee info public void
		 * displayInfo() { System.out.println("ID: " + employeeId + ", Name: " + name +
		 * ", Role: " + role); }
		 * 
		 * public void displayInfo(boolean showSalary, String requesterRole) {
		 * displayInfo(); if (showSalary) { try { System.out.println("Salary: " +
		 * getSalary(requesterRole)); } catch (UnauthorizedAccessException e) {
		 * System.out.println("Salary access denied: " + e.getMessage()); } } } }
		 * 
		 * // -------------------- Full-Time Employee -------------------- class
		 * FullTimeEmployee extends Employee { public FullTimeEmployee(String
		 * employeeId, String name, String role, double salary) throws
		 * InvalidSalaryException { super(employeeId, name, role, salary); }
		 * 
		 * // Polymorphism: overriding payroll calculation
		 * 
		 * @Override public double calculatePay() { return getSalary("HR"); // HR role
		 * used internally for calculation } }
		 * 
		 * // -------------------- Contract Employee -------------------- class
		 * ContractEmployee extends Employee { private int hoursWorked; private double
		 * hourlyRate;
		 * 
		 * public ContractEmployee(String employeeId, String name, String role, double
		 * hourlyRate, int hoursWorked) throws InvalidSalaryException {
		 * super(employeeId, name, role, hourlyRate * hoursWorked); this.hourlyRate =
		 * hourlyRate; this.hoursWorked = hoursWorked; }
		 * 
		 * // Polymorphism: overriding payroll calculation
		 * 
		 * @Override public double calculatePay() { return hourlyRate * hoursWorked; } }
		 * 
		 * // -------------------- Main Class -------------------- public class
		 * SecurePayrollSystem { public static void main(String[] args) { try { Employee
		 * e1 = new FullTimeEmployee("E101", "Alice", "HR", 5000); Employee e2 = new
		 * ContractEmployee("E102", "Bob", "Contractor", 50, 160);
		 * 
		 * // Display info with polymorphism e1.displayInfo(true, "HR");
		 * e2.displayInfo(true, "Manager");
		 * 
		 * // Salary modification by HR try { e1.setSalary("HR", 5500);
		 * System.out.println("Updated Salary for Alice: " + e1.getSalary("HR")); }
		 * catch (InvalidSalaryException | UnauthorizedAccessException ex) {
		 * System.out.println("Error updating salary: " + ex.getMessage()); }
		 * 
		 * // Unauthorized salary modification try { e2.setSalary("Employee", 6000); }
		 * catch (InvalidSalaryException ex) { System.out.println("Invalid salary: " +
		 * ex.getMessage()); } catch (UnauthorizedAccessException ex) {
		 * System.out.println("Unauthorized access: " + ex.getMessage()); }
		 * 
		 * // Payroll calculation (polymorphism in action)
		 * System.out.println("Payroll for Alice: " + e1.calculatePay());
		 * System.out.println("Payroll for Bob: " + e2.calculatePay());
		 * 
		 * } catch (InvalidSalaryException ex) {
		 * System.out.println("Initialization error: " + ex.getMessage()); } } }
		 */
	}

}
