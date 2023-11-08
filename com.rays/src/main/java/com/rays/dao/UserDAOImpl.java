package com.rays.dao;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.common.UserContext;
import com.rays.dto.UserDTO;

@Repository
public class UserDAOImpl extends BaseDAOImpl<UserDTO> implements UserDAOInt {

	@Override
	public void update(UserDTO dto, UserContext userContext) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(UserDTO dto, UserContext userContext) {
		// TODO Auto-generated method stub

	}

	@Override
	public UserDTO findByPK(long pk, UserContext userContext) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDTO findByUniqueKey(String attribute, Object val, UserContext userContext) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDTO findByEmail(String attribute, String val, UserContext userContext) {
		// TODO Auto-generated method stub
		return null;
	}

}
