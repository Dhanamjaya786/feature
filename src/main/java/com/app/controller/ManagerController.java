/**
 * 
 */
package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Manager;

/**
 * @author Dhanamjaya
 *
 */
@RestController
public class ManagerController {

	@Autowired
	private Manager manager;
	
	@GetMapping("/one")
	@ResponseBody
	public String getData()
	{
		return manager.toString();
	}
	@PostMapping("/two")
	public String getRespo()
	{
		return "hello Post method";
		
	}
	
	
	
	
}
