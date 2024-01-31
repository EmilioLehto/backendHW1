package com.example.demo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@ResponseBody




public class HelloController {
    @RequestMapping("/hello")
    
 public String hello(
    @RequestParam(name="location", defaultValue = "the island") String location,
    @RequestParam(name="name", defaultValue = "Guests") String firstName) 
    {
 return "Welcome to the " + location + " " + firstName + "!";
 }
}