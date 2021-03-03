package pers.it;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pers.it.pojo.User;
import pers.it.service.UserService;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MyTest {
    @Autowired
    private UserService userService;

    @Test
    public void testInsertUser(){
        User user = new User();
        user.setMobile("17788999988");
        user.setPassword("123456");
        user.setSex("男");
        user.setBirthdate(new Date());
        user.setAddress("成都");
        user.setEmail("WWW@qq.com");
        user.setCreate_time(new Date());
        user.setUpdate_time(new Date());
        userService.insertUser(user);
    }

    @Test
    public void testQueryUserById(){
        User user = userService.queryUserById(1L);
        System.out.println(user);
    }
    //根据id修改User(sex,address,email)
    @Test
    public void testUpdateUser(){
        User user = new User();
        user.setId(1L);
        user.setSex("男");
        user.setAddress("贵州");
        user.setEmail("qwe@qq.com");
        userService.updateUser(user);
    }

    @Test
    public void testDeleteUserById(){
        userService.deleteUserById(1L);
    }

}
