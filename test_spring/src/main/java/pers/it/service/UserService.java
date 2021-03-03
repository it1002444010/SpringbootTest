package pers.it.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import pers.it.enums.ExceptionEnum;
import pers.it.exception.MyException;
import pers.it.mapper.UserMapper;
import pers.it.pojo.User;


@Service
public class UserService {

    @Autowired(required = false)
    private UserMapper userMapper;

    public User queryUserById(Long id) {
        User user = userMapper.queryUserById(id);
        if (user == null){
            //查询失败
            throw new MyException(ExceptionEnum.USER_NOT_FIND);
        }
        return userMapper.queryUserById(id);
    }

    public void updateUser(User user) {
        int count = userMapper.updateUser(user);
        if (count == 0){
            //更新失败
            throw new MyException(ExceptionEnum.USER_SAVE_ERROR);
        }
    }

    public void deleteUserById(Long id) {
        int count = userMapper.deleteUserById(id);
        if (count == 0){
            //删除失败
            throw new MyException(ExceptionEnum.USER_DELETE_ERROR);
        }
    }

    public void insertUser(User user) {
        user.setState("1");
        int count = userMapper.insertUser(user);
        if (count == 0){
            //新增失败
            throw new MyException(ExceptionEnum.USER_INSERT_ERROR);
        }
    }
}
