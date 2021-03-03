package pers.it.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import pers.it.pojo.User;

@Mapper
public interface UserMapper {

    /**
     * 根据id查询User
     * @param id
     * @return
     */
    @Select("select * from user where id = #{id} and state = 1")
    User queryUserById(Long id);

    /**
     * 根据id修改User(sex,address,email)
     * 只修改固定部分，如果要进行部分修改，引入tk中的通用Mapper
     * @param user
     */
    @Update("UPDATE user SET sex = #{sex},address=#{address},email=#{email},update_time=#{update_time} WHERE id = #{id} ")
    int updateUser(User user);

    /**
     * 根据id（逻辑）删除用户
     * @param id
     * @return
     */
    @Update("update user set state = -1 where id = #{id}")
    int deleteUserById(Long id);

    /**
     * 新增数据
     * @param user
     */
    @Insert("insert into user(mobile,password,sex,birthdate,address,email,state,create_time,update_time) values(#{mobile},#{password},#{sex},#{birthdate},#{address},#{email},#{state},#{create_time},#{update_time})")
    int insertUser(User user);
}
