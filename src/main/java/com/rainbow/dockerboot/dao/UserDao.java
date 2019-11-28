package com.rainbow.dockerboot.dao;

import com.rainbow.dockerboot.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * <p>功能描述</br></p>
 *
 * @author rain
 * @version v1.0
 * @projectName docker-boot
 * @date 2019/11/25 19:10
 */
@Repository
public class UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    /**
     * <pre>插入用户</pre>
     */
    public void insert() {
        String time = String.valueOf(System.currentTimeMillis());
        String sql = "insert into t_user (username) values ('docker-" + time + "')";
        jdbcTemplate.update(sql);
        System.out.println("==========执行插入语句==========");
    }

    /**
     * <pre>查询用户列表</pre>
     *
     * @return
     */
    public List<User> queryUserList() {
        return jdbcTemplate.query("select id,username from t_user", new UserMapper());
    }

    /**
     * <pre>結果转换</pre>
     */
    class UserMapper implements RowMapper<User> {

        @Override
        public User mapRow(ResultSet resultSet, int i) throws SQLException {
            User unitPO = new User();
            unitPO.setId(resultSet.getInt("id"));
            unitPO.setUsername(resultSet.getString("username"));
            return unitPO;
        }
    }
}
