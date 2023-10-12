package mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mvc.dataAccessLayer.EmpRepository;
import mvc.entity.EmpEntity;
@Service
public class GetByEmpidService {
	@Autowired
	EmpRepository er;
	
	@SuppressWarnings("deprecation")
	public EmpEntity getEmployeebyID(int empid) {
		System.out.println("in service to get by id");
		return er.getOne(empid);
	}

}
