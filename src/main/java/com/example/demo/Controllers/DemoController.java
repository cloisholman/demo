package com.example.demo.Controllers;

import com.example.demo.Models.Artists;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
@RequestMapping(value = "art")
public class DemoController {
    static ArrayList<Artists> artists = new ArrayList<Artists>();


    @RequestMapping(value = "")
   public String index(Model model){

     //model passes data to the view

       //Artists artist1 = new Artists("Pablo Picasso","Málaga","10/25/1881", "Lorem Ipsum", "Cubism");

       //model.addAttribute("artist",artist1);
       //artists.add(artist1);
       model.addAttribute("artists", artists);
       //return template name
   return "art/index";
   }
   @RequestMapping(value= "add", method= RequestMethod.GET)
    public String displayAddArtistForm(Model model){
       model.addAttribute("artists","add your favorite artist");
       return "art/add";
}
    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String processAddArtistform (@RequestParam String artistName){
        artists.add(new Artists(artistName));
        //redirect to /art
        return "redirect:";
    }

}