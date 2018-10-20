package com.cg.employee.test;

import junit.framework.Assert;

import org.junit.Test;

import com.cg.employee.exception.EmployeeException;
import com.cg.employee.service.EmployeeService;
import com.cg.employee.service.EmployeeServiceImpl;


public class TestClass {

	EmployeeService service=new EmployeeServiceImpl();
	// Name validation
	
	@Test(expected=EmployeeException.class)
	public void test_ValidateName_null() throws EmployeeException{
		service.validateName(null);
	}
	
	@Test
	public void test_validateName_v1() throws EmployeeException{
	
		String name="Aete121";
		boolean result= service.validateName(name);
		Assert.assertEquals(false,result);
	}
	@Test
	public void test_validateName_v2() throws EmployeeException{
	
		String name="Amita";
		boolean result= service.validateName(name);
		Assert.assertEquals(true,result);
	}
	@Test
	public void test_validateName_v3() throws EmployeeException{
	
		String name="amita";
		boolean result= service.validateName(name);
		Assert.assertEquals(false,result);
	}
	
	//Phone number validation
		
	@Test(expected=EmployeeException.class)
	public void test_ValidatePhoneNo_null() throws EmployeeException{
		service.validateName(null);
	}
	
	@Test
	public void test_validatePhoneNo_v1() throws EmployeeException{
	
		String name="96857432s10";
		boolean result= service.validatePhoneNo(name);
		Assert.assertEquals(false,result);
	}
	@Test
	public void test_validatePhoneNo_v2() throws EmployeeException{
	
		String name="78965412301";
		boolean result= service.validatePhoneNo(name);
		Assert.assertEquals(false,result);
	}
	@Test
	public void test_validatePhoneNo_v3() throws EmployeeException{
	
		String name="0968541237";
		boolean result= service.validatePhoneNo(name);
		Assert.assertEquals(false,result);
	}
	@Test
	public void test_validatePhoneNo_v4() throws EmployeeException{
	
		String name="6668541237";
		boolean result= service.validatePhoneNo(name);
		Assert.assertEquals(true,result);
	}
	
	// Salary validation
	
	@Test(expected=EmployeeException.class)
	public void test_ValidateSalary_null() throws EmployeeException{
		service.validateName(null);
	}
	
	@Test
	public void test_validateSalary_v1() throws EmployeeException{
	
		double sal=9685743;
		boolean result= service.validateSalary(sal);
		Assert.assertEquals(true,result);
	}
	@Test
	public void test_validateSalary_v2() throws EmployeeException{
	
		double sal =232;
		boolean result= service.validateSalary(sal);
		Assert.assertEquals(false,result);
	}
	@Test
	public void test_validateSalary_v3() throws EmployeeException{
	
		double sal=96;
		EmployeeService service=new EmployeeServiceImpl();
		boolean result= service.validateSalary(sal);
		Assert.assertEquals(false,result);
	}
	@Test
	public void test_validateSalary_v4() throws EmployeeException{
	
		double sal=9655.07;
		boolean result= service.validateSalary(sal);
		Assert.assertEquals(true,result);
	}	
	
}
