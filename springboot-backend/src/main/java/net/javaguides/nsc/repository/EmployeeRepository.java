package net.javaguides.nsc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.javaguides.nsc.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
