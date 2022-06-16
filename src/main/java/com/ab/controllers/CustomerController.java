package com.ab.controllers;
import java.time.LocalDate;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ab.entities.Customer;
import com.ab.services.CustomerService;

@Controller
public class CustomerController {
	
	
	@Autowired
	private CustomerService customerService;
	
	// Http Request Mapping methods
	@GetMapping("/")
	public String loginForm() {
		return "login";
	}
	
	@PostMapping("/login")
	public String loginProcess(@RequestParam("customerEmail") String customerEmail, @RequestParam("password") String password) {
		
		Customer loginCustomer = this.customerService.findCustomerByCustomerEmailAndCustomerPassword(customerEmail, password);
		
		if(loginCustomer != null) {
			return "Trading_System";
		}
		else {
			return "log_failure";
		}
	}
	
	
	@GetMapping("/reg_form")
	public String registerForm() {
		return "register";
	}
	
	
	@PostMapping("/register")
	public String registerProcess(@ModelAttribute Customer customer) {
		
		System.out.println("************ "+customer);
		
		Customer registeredCustomer = this.customerService.saveCustomer(customer);
		
		if(registeredCustomer != null) {
			return "reg_success";
		}
		else {
			return "reg_failure";
		}
	}
	
	
	
	@GetMapping("/customers")
	public ModelAndView getAllStudents() {
		
		List<Customer> customers = customerService.loadCustomers();
		
		ModelAndView mv = new ModelAndView();
		
		// This is similar to setAttribute() in session object
		mv.addObject("customerList", customers);
		
		mv.setViewName("customer_list");
		
		return mv;
		
	}
	
	@GetMapping("/buy_sell")
	public ModelAndView account(HttpSession session) {
		 ModelAndView buysell = new ModelAndView("buy_sell");
		return buysell;
	}
}
	
	