package com.rays.services;

import com.rays.common.BaseServiceInt;
import com.rays.common.UserContext;
import com.rays.dto.UserDTO;

public interface UserServiceInt extends BaseServiceInt<UserDTO> {

	public UserDTO findByLoginId(String name, UserContext userContext);

	public UserDTO findByEmail(String email, UserContext userContext);

	public UserDTO authenticate(String loginId, String password);

	public UserDTO changePassword(String loginId, String oldPassword, String newPassword, UserContext userContext);

	public UserDTO forgotPassword(String loginId);

	public UserDTO register(UserDTO dto);

}
