package com.controller;



import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Users;

@RestController
public class UserController {
	
	List<Users> list = new ArrayList<Users>();
	
	@GetMapping("/getdetails")
	public List<Users> createuser() {
		
		System.out.println("User Details.");
		
		return list;
	}
	
	@PostMapping("/createuser")
	public String createUser(@RequestBody Users user) {
		
		System.out.println(user);
		list.add(user);
		
		return "User Created";
			
	}
	
	@GetMapping("/getproduct")
    public String getProductInfo() {
        return "Product: Laptop, Price: ₹85,000";
    }
	
	
	@GetMapping("/getorderstatus")
    public String getOrderStatus() {
        return "Order on the way.";
    }
	
	
	 @GetMapping("/getemployee")
	    public String getEmployeeName() {
	        return "Employee: Dnyaneshwari";
	    }
	 
	 
	 @GetMapping("/getweather")
	    public String getWeather() {
	        return "Weather: Sunny, 28°C";
	    }

	 @GetMapping("/getstudent")
	    public String getstudent() {
	        return "Shaurya";
	    }




}
