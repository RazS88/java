package com.jb.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jb.entity.User;

/*Helps spring to know that is a repository for the Entity(REST) Works with DB*/
@Repository
/*
 * By Implements the interface JpaRepo we get all C . R . U . D Function By give
 * to Jpa Class And ID (type)
 */
public interface UserRepository extends JpaRepository<User, Long> {

//	D . M . L
//	D- data M- manipulation L- language
//	 
//	                                                  C . R . U . D 
//	                                 C- create
//	                                       R- read
//	                                           U- update
//	                                                D- delete

	/* Query for find in Entity (Table) by Two Fields */
	User findByEmailAndPassword(String email, String password);

}
