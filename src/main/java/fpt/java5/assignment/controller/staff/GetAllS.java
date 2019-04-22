package fpt.java5.assignment.controller.staff;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import fpt.java5.assignment.service.staff.StaffService;

@Controller
public class GetAllS {
	
	@Autowired
	StaffService staffService;
	
	@GetMapping({"/allStaff"})
	public String showPage(Model model) {
		model.addAttribute("listStaffs", staffService.getAllStaffs());
		return "allStaff";
	}
}
