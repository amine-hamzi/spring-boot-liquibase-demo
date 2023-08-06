package com.example.springbootliquibase.repositories;

import com.example.springbootliquibase.model.Employer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface EmployerRepository extends JpaRepository<Employer, Long> {
}
