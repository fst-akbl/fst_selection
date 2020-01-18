package com.course_selection.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
  
@Controller
public class CategoryController {
    @RequestMapping("/lostfound")
    public String lostfound(){
    	return "lostfound";
    }
    @RequestMapping("/mailbox")
    public String mailbox(){
        return "mailbox";
    }
    @RequestMapping("/message")
    public String message(){
        return "message";
    }
}
