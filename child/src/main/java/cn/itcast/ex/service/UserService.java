package cn.itcast.ex.service;

import cn.itcast.ex.bean.ResultInfo;

public interface UserService {
    /**
     * 验证用户名
     * @param username
     * @return
     */
    ResultInfo exitUserName(String username);
}
