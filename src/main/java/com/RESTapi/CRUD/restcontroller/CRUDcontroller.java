package com.RESTapi.CRUD.restcontroller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import mvc.dataAccessLayer.EmpRepository;
import mvc.entity.EmpEntity;
import mvc.service.AddService;
import mvc.service.DeleteService;
import mvc.service.GetAllService;
import mvc.service.GetByEmpidService;
import mvc.service.UpdateService;



@RestController

public class CRUDcontroller {
	
	
	
	@RequestMapping("/welcome")
	public String welcomeEmployee(int empid) {
		return "Welcome Employee";
		}
	 
	@Autowired
	GetAllService ga;
	@RequestMapping("/employees") 
	public List<EmpEntity> getAllEmployees() {
		System.out.println("in controller to get all employees");
		return ga.getAllEmployees();
		} 
	
	
	@Autowired
	GetByEmpidService ge;
	@RequestMapping("/employees/{empid}")
	public EmpEntity getEmployeeByID(@PathVariable int empid) {
		System.out.println("in controller to get details by id");
		System.out.println("ff"+empid);
		return ge.getEmployeebyID(empid);
		} 
	
	@Autowired
	AddService as;
	@RequestMapping(value = "/employees", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void addEmployee(@RequestBody EmpEntity employee) {
		System.out.println("in controller to add");
		as.addEmployee(employee);
	}
	
	
	@Autowired
	UpdateService us;
	@RequestMapping(value = "/employees/{empid}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void updateEmployee(@RequestBody EmpEntity employee,@PathVariable int empid) {
		System.out.println("in controller to update");
		System.out.println("EmpEntity="+employee);
		System.out.println("empid="+empid);
		us.updateEmployeebyID(employee,empid);
	}
	
	@Autowired
	DeleteService ds;
	@RequestMapping(value = "/employees/{empid}", method = RequestMethod.DELETE)
	public void deleteEmployee(@PathVariable int empid) {
		System.out.println("in controller to delete empid="+empid);
		ds.deletebyEmpid(empid);
	}
}
