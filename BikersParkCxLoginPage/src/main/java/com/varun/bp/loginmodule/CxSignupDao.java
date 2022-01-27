package com.varun.bp.loginmodule;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CxSignupDao {
	@Autowired
	CxSignupRepository cxrepo;

	public void insertcx(CxSignup cxs) {
		cxrepo.save(cxs);
	}

//	public void getcx(CxSignup c) {
//		cxrepo.save(c);
//	}

	public CxSignup getcxdet(String user_name) {
		return cxrepo.getusername(user_name);
	}

	public void updatecx(CxSignup cxs) {
		cxrepo.save(cxs);
	}

}
