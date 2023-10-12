package mvc.dataAccessLayer;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import mvc.entity.EmpEntity;
@Repository
@Scope("prototype")
public interface EmpRepository extends JpaRepository<EmpEntity, Integer> {

	
	
	@Query(value="SELECT count(1) FROM Employee WHERE Empid= ?1",nativeQuery = true)
	public int checkEmpidInDB(int empid);

	
	@Transactional
	@Modifying
	@Query("DELETE EmpEntity e WHERE e.Empid= ?1")
	public void delByEId(int empid);


	@Transactional
	@Modifying
	@Query("UPDATE EmpEntity u SET u.DoB= ?2 , u.Ssn= ?3 WHERE u.Empid= ?1")
	public int updateProfile(int empid,String doB,int ssn);



	


}
