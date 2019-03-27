package com.capgemini.file.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.junit.Test;

import com.capgemini.file.model.Employee;
import com.capgemini.file.model.EmployeeDeserialization;
import com.capgemini.file.model.EmployeeSerialization;

public class EmployeeTest {

	private Employee employee;
	private EmployeeSerialization employeeSerialization;
	private EmployeeDeserialization employeeDeserialization;

	@Test
	public void testEmployeeSerialization() throws IOException {
		employee = new Employee(101, "John Doe", 45000);
		employeeSerialization = new EmployeeSerialization();
		assertTrue(employeeSerialization.writeObjectInFile("employee.ser", employee));
	}

	@Test
	public void testEmployeeDeSerialization() throws IOException, ClassNotFoundException {
		employee = new Employee(101, "John Doe", 45000);
		employeeDeserialization = new EmployeeDeserialization();
		assertEquals(employee, employeeDeserialization.deSerialize("employee.ser"));
	}

}
