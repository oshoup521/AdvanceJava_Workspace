package com.app.repository;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.app.pojos.Employee;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
class TestingEmployeeRepository {
	@Autowired
	private EmployeeRepository empRepo;
	
	@Test
	void test() {
		assertNotNull(empRepo);
	}
	
	@Test
	void testAddEmployees() {
		List<Employee> emps = List.of(
				new Employee("osho", "date", "ram@gmail.com", "54321", "kolhapur", LocalDate.of(2022, 10, 20), 12378));
		List<Employee> savedEmps = empRepo.saveAll(emps);
		assertEquals(1, savedEmps.size());
	}

}
