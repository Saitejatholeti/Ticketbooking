package com.Ticketbooking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.Ticketbooking.Service.CategoryService;
import com.Ticketbooking.entity.UserRequest;


@RestController
@RequestMapping(value = "/v1/categories")
public class CategoryRestController {

    private static final int MAX_DISTANCE = 2000;

    @Autowired
    private  CategoryService categoryService;


    

   @PostMapping
    public boolean testSave(@RequestBody UserRequest userInfo) {
        
    	categoryService.saveUser(userInfo);
        return true;
    }

}
