package com.ze1sure99;

import com.ze1sure99.mapper.UserMapper;
import com.ze1sure99.pojo.User;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
class ApplicationTests {
    @Autowired
    private UserMapper userMapper;
    @Test
   void testSelect(){
        List<User> users = userMapper.selectList(null);
        for (User user : users) {
            System.out.println(user);
        }

    }
}
