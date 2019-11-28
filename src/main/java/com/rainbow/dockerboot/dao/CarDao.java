package com.rainbow.dockerboot.dao;

import com.rainbow.dockerboot.entity.Car;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CarDao extends MongoRepository<Car, Integer> {
}
