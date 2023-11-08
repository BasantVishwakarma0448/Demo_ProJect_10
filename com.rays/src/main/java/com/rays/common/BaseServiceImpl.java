package com.rays.common;

import org.springframework.beans.factory.annotation.Autowired;

public abstract class BaseServiceImpl <T extends BaseDTO, D extends BaseDAOInt<T>>{

	@Autowired
	protected D baseDao;
	
	public long add(T dto, UserContext userContext) {
		
		System.out.println("inside baseserviceimpl add");
		long pk = baseDao.add(dto, userContext);
		return pk;
	}

}
