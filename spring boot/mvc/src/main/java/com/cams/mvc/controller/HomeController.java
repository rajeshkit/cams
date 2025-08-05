package com.cams.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    @RequestMapping(value = "/home") //web request path
    @ResponseBody
    public String home(Model model){  // web request method
        model.addAttribute("name","rajesh");
        model.addAttribute("place","Chennai");
        return "index"; // logical view name
                        //template/index.html
    }
    @RequestMapping(value = "/services") //web request path
    public String serve(Model model){  // web request method
        model.addAttribute("product1","development");
        model.addAttribute("product2","deployement");
        model.addAttribute("product3","Testing");
        return "services";//logicalviewname
                        //template/services.html
    }

}
