package com.app.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.modal.User;


@Repository
public interface UserRepo extends CrudRepository<User, String> {
	
	User findByUserNameAndPassword(String username, String password);

}
