package com.simpla.iot.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.simpla.iot.core.dto.OrganizationUserDTO;
import com.simpla.iot.core.model.LoginDetails;
import com.simpla.iot.core.model.Organization;
import com.simpla.iot.core.model.Role;
import com.simpla.iot.core.model.UserDetails;
import com.simpla.iot.core.repository.LoginDetailsRepository;
import com.simpla.iot.core.repository.OrganizationRepository;
import com.simpla.iot.core.repository.RoleRepository;
import com.simpla.iot.core.repository.UserDetailsRepository;

@Service("organizationService")
public class OrganizationServiceImpl implements IOrganizationService {

	@Autowired
	OrganizationRepository organizationRepository;
	
	@Autowired
	RoleRepository roleRepository;
	
	@Autowired
	UserDetailsRepository userDetailsRepository;
	
	@Autowired
	LoginDetailsRepository loginDetailsRepository;
	
	@Override
	@Transactional
	public void createOrganizationAndUser(
			OrganizationUserDTO organizationUserDTO) {
		Organization organization  = new Organization();
		organization.setOrganizationName(organizationUserDTO.getOrganizationName());
		organization.setOrganizationAddress(organizationUserDTO.getOrganizationAddress());
		organizationRepository.save(organization);
		
		Role role = new Role(/*organizationUserDTO.getRoleName()*/);
		role.setRoleName(organizationUserDTO.getRoleName());
		roleRepository.save(role);
		
		UserDetails userDetails = new UserDetails(/*role, organization, organizationUserDTO.getFirstName(), organizationUserDTO.getLastName(),organizationUserDTO.getEmail()*/);
		userDetails.setEmailAddress(organizationUserDTO.getEmail());
		userDetails.setFirstName(organizationUserDTO.getFirstName());
		userDetails.setLastName(organizationUserDTO.getLastName());
		userDetails.setOrganization(organization);
		userDetails.setRole(role);
		userDetailsRepository.save(userDetails);
		
		LoginDetails login = new LoginDetails();
		login.setUserName(organizationUserDTO.getUsername());
		login.setPassword(organizationUserDTO.getPassword());
		login.setUserDetails(userDetails);
		loginDetailsRepository.save(login);
	}
	
}
