package com.example.demo.Controllers;

import com.example.demo.Models.Artists;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {

   /* @RequestMapping(value = "welcome")
    public String loadIndexPage(){return "index.html";
    }
    */
   @RequestMapping(value = "")
   public String search(Model model){
       Artists artist1 = new Artists("Pablo Picasso","Málaga","10/25/1881", "Lorem Ipsum", "Cubism");
   return "index";
   }
}