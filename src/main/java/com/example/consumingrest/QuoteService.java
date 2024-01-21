package com.example.consumingrest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class QuoteService {
    @Autowired
    RestTemplate restTemplate;

    public Root getRandomQuote(){
        return restTemplate.getForObject("https://quotes15.p.rapidapi.com/quotes/random/", Root.class);
    }
}
