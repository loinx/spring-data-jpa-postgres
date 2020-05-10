package com.loinx.spring.data.converter;

import org.mapstruct.Mapper;

import com.loinx.spring.data.dto.User;
import com.loinx.spring.data.model.UserModel;

@Mapper(componentModel = "spring")
public interface UserMapper {
	public UserModel userToUserModel(User user);

	public User userModelToUser(UserModel userModel);
}
