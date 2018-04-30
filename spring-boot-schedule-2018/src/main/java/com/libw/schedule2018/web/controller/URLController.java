package com.libw.schedule2018.web.controller;
/**
 * Created by:wentuanxu
 * date: 2018/4/30.
 */

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class URLController {
    @RequestMapping("/urltest")
    @ResponseBody
    public String test(HttpServletRequest request, ModelMap modelMap) {
        return "aaa";
    }
}
