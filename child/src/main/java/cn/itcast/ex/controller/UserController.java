package cn.itcast.ex.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {
//    @Autowired
//    UserService userService;
//    @GetMapping("checkName")//@GetMapping是Spring4.3提供的新注解,它是一个组合注解,等价于@RequestMapping(method = RequestMethod.Get )
//    public ResultInfo login(String name){
//        ResultInfo result=userService.exitUserName(name);
//        return result;
//    }
}
