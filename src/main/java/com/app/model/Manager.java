/**
 * 
 */
package com.app.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import lombok.Data;

/**
 * @author Dhanamjaya
 *
 */
@Data
@Component
public class Manager implements CommandLineRunner{

	@Value("${manager.devid}")
	private Integer managerdevId;
	
	@Value("${manager.devname}")
	private String managerdevName;
	
	@Value("${manager.qaid}")
	private Integer managerqaId;
	
	@Value("${manager.qaname}")
	private String managerqaName;
	
	@Value("${manager.prodid}")
	private Integer managerprodId;
	
	@Value("${manager.prodname}")
	private String managerprodName;

	
	
	@Override
	public void run(String... args) throws Exception {

		System.out.println(this);
	}



	
	
}
