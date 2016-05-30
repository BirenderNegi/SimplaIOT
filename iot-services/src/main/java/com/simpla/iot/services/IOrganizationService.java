package com.simpla.iot.services;

import com.simpla.iot.core.dto.OrganizationUserDTO;

public interface IOrganizationService {
	
	void createOrganizationAndUser(OrganizationUserDTO organizationUserDTO);
}
