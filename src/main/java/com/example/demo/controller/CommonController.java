package com.example.demo.controller;

import com.example.demo.common.BaseResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Robin
 * @create 2017-12-25 18:44
 * @desc 通用接口
 **/
@Controller("/")
public class CommonController {

    @GetMapping("")
    public String index() {
        return "index";
    }

    @GetMapping("aaaa")
    @ResponseBody
    public BaseResponse aaaa(){
        return new BaseResponse();
    }
}
