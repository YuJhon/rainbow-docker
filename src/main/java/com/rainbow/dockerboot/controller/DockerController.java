package com.rainbow.dockerboot.controller;

import com.rainbow.dockerboot.dto.Response;
import com.rainbow.dockerboot.entity.User;
import com.rainbow.dockerboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>功能描述</br>基本控制器</p>
 *
 * @author rain
 * @version v1.0
 * @projectName docker-boot
 * @date 2019/11/25 19:10
 */
@RestController
@RequestMapping("/docker")
public class DockerController {

    @Autowired
    private UserService userService;

    @GetMapping("/info")
    public Response info() {
        return Response.build("Hello Springboot Docker!");
    }


    @GetMapping("/createUser")
    public Response createUser() {
        List<User> userList = userService.createUser();
        return Response.build(userList);
    }

    @GetMapping("/queryUserList")
    public Response queryUserList(){
        List<User> userList = userService.queryUsers();
        return Response.build(userList);
    }
}
