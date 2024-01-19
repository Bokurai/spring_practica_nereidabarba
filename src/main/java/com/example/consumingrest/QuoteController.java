package com.example.consumingrest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(QuoteController.QUOTE)
public class QuoteController {
    public static final String QUOTE = "/quote";

    @Autowired
    QuoteService quoteService;

    @GetMapping
    public String getQuote(Model model){
       model.addAttribute("quote");
       return "quote";
    }

}
