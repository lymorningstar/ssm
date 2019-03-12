package com.how2java.tmall.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import com.how2java.tmall.pojo.Category;
import com.how2java.tmall.service.CategoryService;

@Controller
@RequestMapping("")
public class CategoryController {
	@Autowired
	CategoryService categoryService;
	
	@RequestMapping("admin_category_list")
	public String list(Model model){
		List<Category> cs=categoryService.list();
		model.addAttribute("cs",cs);
		return "admin/listCategory";
	}
}
