package com.varun.bp.loginmodule;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CxSignupService {
	@Autowired
	CxSignupDao cxdao;
	@Autowired
	CxSignupRepository cxsignuprepo;

	public String insertcx(CxSignup cxs) {

		CxSignup cc = cxsignuprepo.getusername(cxs.getUser_name());

		if (cc == null) {
			cxdao.insertcx(cxs);
			return "USER SAVED";
		}
		return "USER NAME ALREADY EXIST";
	}

	public String getcx(String user_name, String user_password) {

		CxSignup c = cxsignuprepo.getusername(user_name);

		if (c != null) {

			if (c.getUser_Password().equals(user_password)) {

				return "LOGIN SUCCESS";
			}
		}
		return "INVALID USERNAME OR PASSWORD";
	}

	public CxSignup getcxdet(String user_name) {

		return cxsignuprepo.getusername(user_name);
	}

	public void updatecx(CxSignup cxs) {

		cxdao.updatecx(cxs);
	}

}
