package com.example.demo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Category;
import com.example.demo.service.CategoryService;

@RestController
@RequestMapping("/rest/category")
public class REST_CategoryController {
	
	@Autowired
	CategoryService cateService;
	
	/**
	 * getAll program
	 * @param id
	 * @return
	 */
	@GetMapping()
	public List<Category> getAll(){
		return cateService.findAll();
	}

	/**
	 * getOne program
	 * @param id
	 * @return
	 */
	@GetMapping("id")
	public Category getOne(@PathVariable("id") Integer id) {
		return cateService.findById(id);
	}
	
	/**
	 * create program
	 * @param Category
	 * @return
	 */
	@PostMapping("id")
	public Category create(@RequestBody Category Category) {
		return cateService.create(Category);
	}
	
	/**
	 * update program
	 * @param Category
	 * @return
	 */
	@PutMapping("id")
	public Category update(@RequestBody Category Category) {
		return cateService.update(Category);
	}
	
	/**
	 * delete program
	 * @param id
	 */
	@DeleteMapping("id")
	public void delete(@PathVariable("id") Integer id) {
		cateService.delete(id);
	}
}
