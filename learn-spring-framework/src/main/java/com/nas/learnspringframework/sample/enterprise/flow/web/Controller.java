package com.nas.learnspringframework.sample.enterprise.flow.web;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nas.learnspringframework.sample.enterprise.flow.business.BusinessService;

import java.util.List;

//sending response in the right format
@RestController
public class Controller {
	@Autowired
	BusinessService businessService;
	
  // /sum =100
	@GetMapping("/sum")
	public long displaySum()
	{
		return businessService.calculateSum();
	}
}



