package com.myyrakle.springboot_test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController
{
    @RequestMapping(value = "/")
    public String home()
    {
        return "index";
    }

    @RequestMapping(value = "/failed")
    public String failed()
    {
        return "failed";
    }

    @RequestMapping(value = "/admin_page")
    public String admin_page()
    {
        return "admin_page";
    }
}