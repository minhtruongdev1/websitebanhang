package poly.edu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import poly.edu.entity.Product;
import poly.edu.service.ProductService;

@Controller
public class ProductController {
	@Autowired
	ProductService productService;
	@RequestMapping("/product/list")
	public String list(Model model) {
		List<Product> list = productService.findAll();
		model.addAttribute("items",list);
		return "product/list";
	}
	@RequestMapping("/product/detail/{id}")
	public String detail(Model model,@PathVariable("id") Integer id) {
		Product item = productService.findById(id);
		model.addAttribute("item",item);
		return "product/detail";
	}
}
