package com.treehouse.gifhub.controller;

import com.treehouse.gifhub.model.Gif;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;

@Controller
public class GifController {

    @RequestMapping("/")
    public String listGifs() {
        return "home";
    }

    @RequestMapping("gif")
    public String gifDetails(ModelMap modelMap) {
        Gif gif = new Gif("compiler-bot", LocalDate.of(2020, 7, 01),
                            "Bruno Gonzaga", true);
        modelMap.put("gif", gif);
        return "gif-details";
    }
}
