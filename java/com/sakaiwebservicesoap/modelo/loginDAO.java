package com.sakaiwebservicesoap.modelo;

import javax.jws.WebService;

@WebService
public class loginDAO implements validar_login{

	@Override
	public String Validacion(login log) {
		String sql="select *from webservicesakkai id=? and pw=?";
		return sql;
	}

	
}
