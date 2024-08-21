package com.cydeo.deploymentapp.repository;

import com.cydeo.deploymentapp.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeploymentAppRepository extends JpaRepository<Person, Long> {
}
