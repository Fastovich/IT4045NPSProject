package com.npsproject.it4045npsproject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Decides what to render when a user hits a URL/Endpoint defined in the NPS controller
 */
@Controller
public class NPSController {

    /**
     * Handle the root (/) endpoint and return a generic start page.
     * @return start.html, or the main web page of the application
     */
    @RequestMapping("/")
    public String index(){
        return "start";
    }

}
