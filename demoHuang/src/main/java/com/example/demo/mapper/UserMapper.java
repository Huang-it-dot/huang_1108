package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.model.User;
@Mapper
public interface UserMapper {
	
	User selectUser(String userId);
	
	
//	   void createCard(Card card);
//
//	    void updateCard(Card card);
//
//	    void deleteCard(String id);
//
//	    int getNumOfCards();
//	
	
	
	
	

}
