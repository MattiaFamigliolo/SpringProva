package com.new_challenge_network.SpringProva.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/api/v1")
public class GreetingController {

    @GetMapping("/saluta")
    public String greeting(@RequestParam(name = "yourName",required = false ,defaultValue = "Mondo") String name,
                           @RequestParam(name = "surname",required = false ,defaultValue = "bello") String surname,
                           Model model){

        ArrayList<String> List = new ArrayList<>();
        List.add("pippo");
        List.add("peppoo");
        List.add("pippa");

        ArrayList<Integer> number = new ArrayList<>();
        number.add(2);
        number.add(22);
        number.add(222);

        model.addAttribute("yourName",name);
        model.addAttribute("surname",surname);
        model.addAttribute("userList",List);
        model.addAttribute("numberList",number);
        return "saluto";
    }



}
