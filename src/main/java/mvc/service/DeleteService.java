package mvc.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import mvc.dataAccessLayer.EmpRepository;
import mvc.entity.EmpEntity;

@Service
public class DeleteService {
	@Autowired
	EmpRepository er;
	public void deletebyEmpid(int empid) {
		System.out.println("in service delete");
		int result=er.checkEmpidInDB(empid);
		if (result==0) {
			System.out.println("empid  "+empid+"  does not exist");
			return ;
		}	
		else {
			er.delByEId(empid);
			System.out.println("empid---"+empid+"---is deleted");
			return ;
		}	
	}			

}
