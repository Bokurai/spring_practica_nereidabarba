package com.example.consumingrest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class QuoteService {
    @Autowired
    RestTemplate restTemplate;

    protected QuoteGet[] quoteGets(){
        QuoteGet data[] = restTemplate.getForObject(

        );
        return data;
    }
}
