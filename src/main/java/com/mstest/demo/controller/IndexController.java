package com.mstest.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * @author:WANGLIANG(XIAO)
 * @Date: 2020/3/26 09:04
 * @Description :index test change controller
 */
 @Controller
public class IndexController {


    @RequestMapping("/index")
    public void index(){
        System.out.println("index");
    }

    @RequestMapping("/indexd")
    public void indexd(){
        System.out.println("indexd");
    }

}
