/**
 * 
 */
package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.app.model.Manager;

/**
 * @author Dhanamjaya
 *
 */
@Controller
public class ManagerController {

	@Autowired
	private Manager manager;
	
	@GetMapping("/one")
	@ResponseBody
	public String getData()
	{
		return manager.toString();
	}
}
