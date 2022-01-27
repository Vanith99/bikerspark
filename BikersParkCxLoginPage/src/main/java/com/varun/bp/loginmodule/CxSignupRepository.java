package com.varun.bp.loginmodule;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CxSignupRepository extends JpaRepository<CxSignup, Integer> {

	@Query (value="select * from bikerspark.cxsignup where user_name = ?",nativeQuery = true)
	CxSignup getusername(String user_name);

//	@Query (value = "update bikerspark.cxsignup set user_name = ?,user_password = ?,shop_address = ?,mob_no = ? where id = ? ",nativeQuery = true)
//	CxSignup updatecx(String user_name,String user_password ,String Shop_address,long mob_no,int id);

}
