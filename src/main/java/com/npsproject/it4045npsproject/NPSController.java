package com.npsproject.it4045npsproject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NPSController {

    /**
     *
     * Hnadle the root (/) endpoint and return a generic start page.
     * @return
     */
    @RequestMapping("/")
    public String index(){
        return "start";
    }

}
