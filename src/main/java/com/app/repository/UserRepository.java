package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.app.pojos.User;

@Repository
//User is a pojo class and Integer is ID's data type.
public interface UserRepository extends JpaRepository<User, Integer> {

	public User findByEmail(String email);
	
	
}

