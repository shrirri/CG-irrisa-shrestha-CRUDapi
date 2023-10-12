package mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mvc.dataAccessLayer.EmpRepository;
import mvc.entity.EmpEntity;
@Service
public class GetAllService {

	
	@Autowired
	EmpRepository er;
	public List<EmpEntity> getAllEmployees() {
		System.out.println("in service to get all employees");
		return er.findAll();
	}
}
