package mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import mvc.dataAccessLayer.EmpRepository;
import mvc.entity.EmpEntity;
@Service
public class AddService {
	@Autowired
	EmpRepository er;
	
	public void addEmployee(EmpEntity employee) {
	System.out.println("in service to add");
	EmpEntity e=employee;
	er.save(e);
			return;
		}
}		
			
				
