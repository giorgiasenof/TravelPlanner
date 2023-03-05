package com.example.travelplanner.dao;

import com.example.travelplanner.model.Manager;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;


@Repository
@Transactional

public interface ManagerRepository extends CrudRepository<Manager, Long> {

    Manager findByUsernameAndPassword(String username, String password);
}
