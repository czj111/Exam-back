package cn.itcast.ex.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountService {
    @RequestMapping("hello")
    public String hello(){
        return "hello sdfdf";
    }
}
