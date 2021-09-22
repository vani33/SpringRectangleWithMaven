package com.hcl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hcl.model.Rectangle;

@Controller
public class RectangleController {

	@RequestMapping("/getInfo")
	public String rect(Model model) {
		Rectangle rectangle = new Rectangle();
		model.addAttribute("rectangle", rectangle);
		return "form";
		
	}
	@RequestMapping("/submit")
	public String rect(@ModelAttribute Rectangle rectangle, Model model) {
		double area = rectangle.calculateArea();
		double perimeter = rectangle.calculatePerimeter();
		model.addAttribute("area", area);
		model.addAttribute("perimeter", perimeter);
		return "result";
	}
	
}
