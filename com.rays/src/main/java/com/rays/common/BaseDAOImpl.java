package com.rays.common;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public abstract class BaseDAOImpl<T extends BaseDTO> implements BaseDAOInt<T> {

	@PersistenceContext
	protected EntityManager entityManager;

	public long add(T dto, UserContext userContext) {
		System.out.println("inside the basedaoimpl");
		dto.setCreatedBy(userContext.getLoginId());
		dto.setModifiedBy(userContext.getLoginId());
		dto.setOrgId(userContext.getOrgId());
		dto.setOrgName(userContext.getOrgName());

		populate(dto, userContext);

		entityManager.persist(dto);

		return dto.getId();
	}

	protected void populate(T dto, UserContext userContext) {

	}
}
