package com.example.demo.service;

import com.example.demo.model.User;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

public interface UserService {

	User selectUser(String userId);
	
	
	
//    int insert( String name,String userId);
//
//    User selectUser ( String userId,String name);
//
//    void deleteUser ( String userId,String name);
}

