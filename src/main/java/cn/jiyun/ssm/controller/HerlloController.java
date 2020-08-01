package cn.jiyun.ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

@RestController
@RequestMapping("hello")
public class HerlloController {
    @Autowired
    private DataSource dataSource;

    @GetMapping("show")
    public String index(){
        return "hello world";
    }

}
