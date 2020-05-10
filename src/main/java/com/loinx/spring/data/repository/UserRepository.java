package com.loinx.spring.data.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.loinx.spring.data.model.UserModel;

@Repository
public interface UserRepository extends CrudRepository<UserModel, String> {

}
