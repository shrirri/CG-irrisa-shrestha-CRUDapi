package mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import mvc.dataAccessLayer.EmpRepository;
import mvc.entity.EmpEntity;
@Service
@Scope("prototype")
public class UpdateService {
	@Autowired
	EmpRepository er;
	
	public void updateEmployeebyID(EmpEntity employee, int empid) {
		System.out.println("in service updating");	
		int result=er.checkEmpidInDB(empid);
		if (result==1) {
			//er.save(employee);
			String doB= employee.getDoB();
			int ssn=employee.getSsn();
			
			er.updateProfile(empid, doB, ssn);
			System.out.println("profile updated");
			return;
		}
		else {
			System.out.println("Empid----"+empid+"--does not exist");
			return;
		}
		}

}
