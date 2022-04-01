package com.handyhandouts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.handyhandouts.model.HandyhandoutMessage;
import com.handyhandouts.Repository.HandhandoutMessageRepo;

@Service
public class HandyhandoutMessageService {
	
	@Autowired
	private HandhandoutMessageRepo handoutRepo;
	
	public List<HandyhandoutMessage> getMessages() {
		return handoutRepo.findAll();
	}
	
    public HandyhandoutMessage createMessage(HandyhandoutMessage message) {
    	HandyhandoutMessage mess = new HandyhandoutMessage();
    	mess.setMessage(message.getMessage());
    	mess.setName(message.getName());
    	return handoutRepo.save(mess);
    }
	

}
