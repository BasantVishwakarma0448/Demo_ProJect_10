package com.rays.Ctl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.common.BaseServiceInt;
import com.rays.common.ORSResponse;

public class BaseCtl<F extends BaseForm, T extends BaseDTO, S extends BaseServiceInt<T>> {
	@Autowired
	protected S baseSevice;

	public ORSResponse validate(BindingResult bindingResult) {

		ORSResponse res = new ORSResponse(true);
		System.out.println("inside the validate method of baseCtl");
		if (bindingResult.hasErrors()) {

			res.setSuccess(false);

			Map<String, String> errors = new HashMap<String, String>();

			List<FieldError> list = bindingResult.getFieldErrors();
			list.forEach(e -> {
				errors.put(e.getField(), e.getDefaultMessage());
				System.out.println("Field :: " + e.getField() + "  Message :: " + e.getDefaultMessage());
			});
			res.addInputErrors(errors);
		}
		return res;

	}
}
