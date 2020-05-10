package com.loinx.spring.data.repository;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.loinx.spring.data.model.UserModel;

@Repository
@Transactional
public interface UserRepository extends CrudRepository<UserModel, String> {

}
