package com.handyhandouts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.handyhandouts.model.HandyhandoutMessage;
import com.handyhandouts.service.HandyhandoutMessageService;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/test")
public class TestApplicationController {
	
	@Autowired
	private HandyhandoutMessageService messageService;
   
	@GetMapping("/message")
	public List<HandyhandoutMessage> getMessage() {
		return messageService.getMessages();
	}
	
	
	@PostMapping("/create")
	public HandyhandoutMessage saveMessage(@RequestBody HandyhandoutMessage message) {
		return messageService.createMessage(message);
	}
}
