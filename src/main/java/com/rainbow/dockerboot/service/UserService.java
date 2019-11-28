package com.rainbow.dockerboot.service;

import com.rainbow.dockerboot.entity.User;

import java.util.List;

/**
 * <p>功能描述</br></p>
 *
 * @author rain
 * @version v1.0
 * @projectName docker-boot
 * @date 2019/11/25 19:10
 */
public interface UserService {
    /**
     * <pre>創建用戶</pre>
     * @return
     */
    List<User> createUser();

    /**
     * 查询用户
     * @return
     */
    List<User> queryUsers();
}
