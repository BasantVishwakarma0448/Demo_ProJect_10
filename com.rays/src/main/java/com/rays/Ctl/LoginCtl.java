package com.rays.Ctl;

import javax.validation.Valid;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.ORSResponse;
import com.rays.dto.UserDTO;
import com.rays.forms.UserRegistrationForm;
import com.rays.services.UserServiceInt;

@RestController
@RequestMapping(value = "Auth")
public class LoginCtl extends BaseCtl<UserRegistrationForm, UserDTO, UserServiceInt> {

	@PostMapping("/signup")
	public ORSResponse signUp(@RequestBody @Valid UserRegistrationForm form, BindingResult bindingResult) {
		System.out.println("in log in ctl " + form.getFirstName());
		System.out.println("in login ctl  " + form.getLoginId());
		ORSResponse res = validate(bindingResult);

		if (!res.isSuccess()) {
			res.addMessage("Please Fill Following Field");
			return res;
		}

		UserDTO dto = new UserDTO();
		
		System.out.println("after userdto object");

		dto.setFirstName(form.getFirstName());
		dto.setLastName(form.getLastName());
		dto.setDob(form.getDob());
		dto.setGender(form.getGender());
		dto.setLoginId(form.getLoginId());
		dto.setPassword(form.getPassword());
		dto.setPhone(form.getPhone());
		System.out.println("after setting all information in the userdto");

		baseSevice.register(dto);
		System.out.println("after registering");

		res.setSuccess(true);
		res.addMessage("User Registered Successfully");
		return res;

	}
}
