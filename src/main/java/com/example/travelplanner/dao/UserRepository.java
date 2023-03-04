package com.example.travelplanner.dao;

import com.example.travelplanner.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface UserRepository extends CrudRepository<User, Long> {


    User findByEmailAndPassword(String email, String password);
}
