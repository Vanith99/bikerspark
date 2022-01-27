package com.varun.bp.loginmodule;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cx")
public class CxSignupController {
	private static final Logger logger =  LoggerFactory.getLogger(CxSignupController.class);
	@GetMapping("/")
	public String getval() {
		logger.info("log entered controller");
		return"log4j";
	}
	@Autowired
	CxSignupRepository cxrepo;
	@Autowired
	CxSignupService cxsignup;
	

	@PostMapping("/signup")
	public String insertcx(@RequestBody CxSignup cxs) {
		logger.info("Entered into a signup method");
		return cxsignup.insertcx(cxs);
		
	}	

	@GetMapping("/get")
	public String getcx(@RequestParam String user_name,  String user_password) {
		return cxsignup.getcx(user_name, user_password);
	}

	@GetMapping("/getcxdetails/{user_name}")
	public CxSignup getcxdet(@PathVariable String user_name) {
		return cxrepo.getusername(user_name);
	}

	@PutMapping("/update")
	public void updatecx(@RequestBody CxSignup cxs) {
		cxsignup.updatecx(cxs);
	}

}
