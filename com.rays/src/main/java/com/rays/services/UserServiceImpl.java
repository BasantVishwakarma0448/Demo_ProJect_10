package com.rays.services;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.common.UserContext;
import com.rays.dao.UserDAOInt;
import com.rays.dto.UserDTO;

@Service
@Transactional
public class UserServiceImpl extends BaseServiceImpl<UserDTO, UserDAOInt> implements UserServiceInt {

	@Override
	public UserDTO register(UserDTO dto) {
		UserContext userContext = new UserContext();

		long id = add(dto, userContext);

		dto.setId(id);
		return dto;
	}

	@Override
	public void update(UserDTO dto, UserContext userContext) {
		// TODO Auto-generated method stub

	}

	@Override
	public long save(UserDTO dto, UserContext userContext) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public UserDTO delete(long id, UserContext userContext) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDTO findById(long id, UserContext userContext) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDTO findByUniqueKey(String att, String val, UserContext userContext) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDTO findByLoginId(String name, UserContext userContext) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDTO findByEmail(String email, UserContext userContext) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDTO authenticate(String loginId, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDTO changePassword(String loginId, String oldPassword, String newPassword, UserContext userContext) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDTO forgotPassword(String loginId) {
		// TODO Auto-generated method stub
		return null;
	}

}
