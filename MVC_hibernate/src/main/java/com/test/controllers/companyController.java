package com.test.controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.dao.companydao;
import com.test.model.company;

@Controller
public class companyController {
	
	@Autowired
	companydao cd;
	
	@RequestMapping("/savedata")
	public String one(@ModelAttribute("cc") company cc)
	{
		
		cd.register(cc);
		return "redirect:/display";
		
	}
	
	@RequestMapping("/display")
	public String two(Model m)
	{
		List<company> cp=cd.getinfo();
		m.addAttribute("temp",cp);
		return "display";
	}
	
	
	@RequestMapping("/deldata/{id}")
	public String three(@PathVariable int id)
	{
		cd.deletedata(id);
		return "redirect:/display";
	}
	
	@RequestMapping("editdata/{id}")
	public String four(@PathVariable int id,Model m)
	{
		List<company> l1=cd.editdata(id);
		m.addAttribute("kk",l1);
		return "edit";
	}
	
	@RequestMapping("/updatedata")
	public String five(@ModelAttribute("cc") company cc)
	{
	
		cd.updatadata(cc);
		return "redirect:/display";
	}
}
