package cn.itcast.ex.dao;

import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    /**
     * 查看用户名是否存在
     * @param username
     * @return
     */
    int exitUserName(String username);
}
