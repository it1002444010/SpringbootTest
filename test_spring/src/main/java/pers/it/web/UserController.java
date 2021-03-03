package pers.it.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pers.it.pojo.User;
import pers.it.service.UserService;

import java.util.Date;


@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 根据id查询User
     * @param id
     * @return
     */
    @GetMapping("/id/{id}")
    public ResponseEntity<User> queryUserById(@PathVariable("id")Long id){
        return ResponseEntity.ok(userService.queryUserById(id));
    }

    /**
     * 根据id修改User(sex,address,email)
     * 只修改固定部分，如果要进行（传入）部分修改，引入tk中的通用Mapper
     * @param user
     */
    @PutMapping
    public ResponseEntity<Void> updateUser(User user){
        System.out.println(user);
        user.setUpdate_time(new Date());
        userService.updateUser(user);
        return ResponseEntity.status(HttpStatus.ACCEPTED).build();
    }

    /**
     * 根据id（逻辑）删除用户
     * @param id
     * @return
     */
    @DeleteMapping("/id/{id}")
    public ResponseEntity<Void> deleteUserById(@PathVariable("id")Long id){
        userService.deleteUserById(id);
        return ResponseEntity.status(HttpStatus.ACCEPTED).build();
    }


    /**
     * 新增数据
     * @param user
     */
    @PostMapping
    public ResponseEntity<Void> insertUser(User user) {
        userService.insertUser(user);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
