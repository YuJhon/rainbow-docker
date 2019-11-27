package com.rainbow.dockerboot.controller;

import com.rainbow.dockerboot.dto.Response;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>功能描述</br></p>
 *
 * @author rain
 * @version v1.0
 * @projectName docker-boot
 * @date 2019/11/25 19:10
 */
@RestController
@RequestMapping("/docker")
public class DockerController {

    @GetMapping("/info")
    public Response info() {
        return Response.build("Hello Springboot Docker!");
    }
}