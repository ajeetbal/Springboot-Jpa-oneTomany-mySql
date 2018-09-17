package com.mvc.mysql.repo;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.mvc.mysql.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
	
	@Query(value="SELECT * FROM employees WHERE id=?1 AND password=?2",nativeQuery=true)
	List<Employee> findByidpassword(long id,String password);
//	
//	
//	List<Customer> findByprice(int price);
//	
//	List<Customer> findByName(String name);
//	@Query(value="SELECT * FROM customer WHERE date >CURDATE()",nativeQuery=true)
//	List<Customer> findByNotExpired();
//	
//	
//	
//	@Query(value="SELECT * FROM customer WHERE date < CURDATE()",nativeQuery=true)
//	List<Customer> findByExpired();
//	
//	@Query(value="SELECT * FROM customer WHERE EXTRACT(MONTH FROM date) =EXTRACT(MONTH FROM CURDATE()) AND year(date)=year(CURDATE()) ",nativeQuery=true)
//	List<Customer> findByMonth();
}
