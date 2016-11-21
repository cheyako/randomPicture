package com.cheyako.randompicture.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PictureController {
    public static final String FULL_SCREEN_PICTURE_PAGE = "picture_page";
    public static final String URL_PARAM = "URL";
    public static final String FREQ_PARAM = "freq";
    public static final String PUG_URL = "/api/pug";
    public static final String MEOW_URL = "/api/meow";

    @RequestMapping({"/page/pug"})
    public ModelAndView getPugPage(@RequestParam(name="freq", defaultValue="1000") int freq)
    {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("picture_page");
        modelAndView.addObject("URL", "/api/pug");
        modelAndView.addObject("freq", Integer.valueOf(freq));

        return modelAndView;
    }

    @RequestMapping({"/page/meow"})
    public ModelAndView getMeowPage(@RequestParam(name="freq", defaultValue="1000") int freq)
    {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("picture_page");
        modelAndView.addObject("URL", "/api/meow");
        modelAndView.addObject("freq", Integer.valueOf(freq));

        return modelAndView;
    }

    @RequestMapping({"/page/gify"})
    public ModelAndView getGifyPage(@RequestParam(name="freq", defaultValue="1000") int freq,
                                    @RequestParam(name="search") String search)
    {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("picture_page");
        modelAndView.addObject("URL", "/api/gify?search="+search);
        modelAndView.addObject("freq", Integer.valueOf(freq));

        return modelAndView;
    }
}
