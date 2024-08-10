package in.springboot.springrestapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.springboot.springrestapi.model.Employees;
import in.springboot.springrestapi.service.EmployeeService;

@RestController()
public class EmployeeController {

	@Autowired
	private EmployeeService eService;
	
	@GetMapping("/employees")
	public List<Employees> getEmployee() {
		return eService.getEmployee();
	}
	
	@PostMapping("/employees")
	public String setEmployee(@RequestBody Employees employees) {
	 return "new employee record created: " +  employees;

	}
}
