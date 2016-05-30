package com.simpla.iot.ui.controller;

import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.simpla.iot.core.dto.OrganizationUserDTO;
import com.simpla.iot.core.model.Organization;
import com.simpla.iot.services.IOrganizationService;

@Controller
public class OrganizationController {
	
	private static final Logger logger = Logger.getLogger(OrganizationController.class);
	
	@Autowired
	IOrganizationService organizationService;
	
	@Autowired
	Validator validator;
	
	@RequestMapping(value = "/createOrg", method = {RequestMethod.GET})
	public String viewOrganization(@ModelAttribute("organizationUserForm") OrganizationUserDTO form, Model model){
		
		if(form != null) {
			model.addAttribute("organizationUserForm", form);
		} else {
			model.addAttribute("organizationUserForm", new OrganizationUserDTO());
		}
		
		return "OrganizationUserAddForm";
	}
	
	@RequestMapping(value = "/createOrg", method = {RequestMethod.POST})
	public String createOrganization(@Valid @ModelAttribute("organizationUserForm") OrganizationUserDTO form, BindingResult result,
									RedirectAttributes ra, Model model) throws Exception{
		
		/*validator.validate(form, result);*/
		
		if (result.hasErrors()) {
            logger.info("Returning create-role.jsp page");
            return "OrganizationUserAddForm";
        }
		
		organizationService.createOrganizationAndUser(form);
		
		return "redirect:OrganizationAndUserCreated";
	}
}
