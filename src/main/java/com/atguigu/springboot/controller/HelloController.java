package com.atguigu.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shkstart 1
 * @creat 2020-12-21 15:22
 */

/*这个类的所有方法返回的数据直接写给浏览器，（如果是对象转为json数据）,@RestController等于
@ResponseBody+
@Controller*/

@RestController
public class HelloController {


    @RequestMapping("/hello")
    public String hello(){
        return  "hello world quick!";

    }

    //RESTAPI的方式
}
