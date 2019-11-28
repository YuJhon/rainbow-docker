package com.rainbow.dockerboot.controller;

import com.rainbow.dockerboot.dao.CarDao;
import com.rainbow.dockerboot.dao.UserDao;
import com.rainbow.dockerboot.entity.Car;
import org.springframework.beans.factory.annotation.Autowired;
import com.rainbow.dockerboot.dto.Response;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

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
    
    @Autowired
    private UserDao userDao;
    @Autowired
    private CarDao carDao;

    @GetMapping(value = "/insert-mongodb")
    public String insertMongoDB() {
        Car car = new Car();
        car.setId(new Random().nextInt(15000000));
        String number = String.valueOf(System.currentTimeMillis());
        car.setNumber(number);
        carDao.save(car);
        return "this is insert-mongodb";
    }

    @GetMapping(value = "/insert-mysql")
    public String insertMySQL() {
        userDao.insert();
        return "this is insert-mysql";
    }
    
}
