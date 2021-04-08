package cn.itcast.ex.service.impl;

import cn.itcast.ex.bean.ResultInfo;
import cn.itcast.ex.dao.UserMapper;
import cn.itcast.ex.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    public ResultInfo exitUserName(String username) {
//                1.校验名字长度
        if(username.length()<2)
        {
            return ResultInfo.fail("名称太短");
        }
        else
        {
//            2.校验名字字符
            String regex="[\\w|-|\\u4e00-\\u9fa5]{2,}";
            Pattern compile = Pattern.compile(regex);
            Matcher matcher = compile.matcher(username);
            boolean matches = matcher.matches();
            if(matches)
            {
//                3.查看数据库
                int find=userMapper.exitUserName(username);
                if(find==0)
                    return ResultInfo.sucess();
                else
                {
                    return ResultInfo.fail("用户名已存在");
                }
            }
            else
            {
                return ResultInfo.fail("不可以包含除-与_之外的特殊字符");
            }


        }

    }

}
