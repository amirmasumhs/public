package com.codercommune.controller;

import com.codercommune.domain.Country;
import com.codercommune.service.ParsingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MainController {

    private static final String MAIN_PAGE = "main";
    private static final String JSON_URL = "https://newsapi.org/v2/top-headlines?category=business&country=id&apiKey=860b825986c2418989c2f0621880623b";
    @Autowired
    private ParsingService parsingService;
    @GetMapping
    public String mains(final Model model) {
        List<Country> countries = (List<Country>) parsingService.parse(JSON_URL);
        model.addAttribute("country", countries.get(0));
        return MAIN_PAGE;
    }
}
