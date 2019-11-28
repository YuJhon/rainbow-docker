package com.rainbow.dockerboot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <p>功能描述</br></p>
 *
 * @author rain
 * @version v1.0
 * @projectName docker-boot
 * @date 2019/11/25 19:10
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {

    private Integer id;

    private String username;
}
