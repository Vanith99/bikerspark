package com.varun.bp;


import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;


import com.varun.bp.loginmodule.CxSignup;
import com.varun.bp.loginmodule.CxSignupRepository;
import com.varun.bp.loginmodule.CxSignupService;

@SpringBootTest
@TestMethodOrder(OrderAnnotation.class)

class BikersParkApplicationTests {
	@Autowired
	CxSignupService cxservice;
	CxSignupRepository cxrepo;
	TestRestTemplate resttemp;
//	@BeforeClass
//	public String get() {
//		return "varun";
//	}
//	

//	@Test
//	void contextLoads() {
//	 assertEquals("varun", "varun");
//	 assertEquals(4, 4);		 
//	}
//	@After
//	public String val() {
//		return null;
//	}
//	public boolean getval(int num) {
//		boolean iseven = false;
//		if(num%2==0) {
//			iseven=true;
//		}
//		return iseven;
//	}
//	@Test
//	void geteven() {
//		BikersParkApplicationTests b = new BikersParkApplicationTests();
//		assertTrue(b.getval(4));		
//	}
	
//   @Test
//   @Order(1)
//   public void getbyname() {
//	 CxSignup cx  = new CxSignup();
//	 cx.setUser_name("arjun");
//	 cx.getUser_name();
//	 assertEquals("arjun", cx.getUser_name());	   	   	  
//   }
   @Test
   @Order(2)
   public void getlogin(String user_name,String user_password) {
	 CxSignup cx = cxrepo.getusername(user_name);
	 cx.setUser_password("123@vjj");
	 assertEquals(cx.getUser_Password(), "123@vjj");	 
	 
   }
//  @Test
//  @Order(3)
//  public void updatevals() {
//	  
//  }
  
	
	

}
