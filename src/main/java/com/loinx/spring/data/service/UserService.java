package com.loinx.spring.data.service;

import java.util.Optional;

import com.loinx.spring.data.dto.User;

public interface UserService {

	User create(User user);

	Optional<User> getUser(String id);
}
