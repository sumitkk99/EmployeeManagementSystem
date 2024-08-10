package in.springboot.springrestapi.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import in.springboot.springrestapi.model.Employees;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private static List<Employees>list = new ArrayList<>();
	
	static {
		Employees e = new Employees();
		e.setName("Sumit");
		e.setAge("26");
		e.setLocation("Patna");
		e.setEmail("Sumit@gmail.com");
		e.setDept("Manager");
		list.add(e);
		
		e = new Employees();
		e.setName("Siroj");
		e.setAge("36");
		e.setLocation("Delhi");
		e.setEmail("Siroj@gmail.com");
		e.setDept("MR");
		list.add(e);
	}
	
	
	
	@Override
	public List<Employees> getEmployee() {
		
		return list;
	}

	
}
