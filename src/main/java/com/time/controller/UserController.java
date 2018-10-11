package com.time.controller;

import com.time.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")
public class UserController {

     @Autowired
    private UserService userService;


     @RequestMapping(value = "/adduser" , method= RequestMethod.POST )
     @ResponseBody
     public void add(@RequestParam("name") String name, @RequestParam("password") String password , Model model){

     }



}
