package pers.it.pojo;


import java.util.Date;

public class User {
    private Long id; //主键
    private String mobile; //登录名，使用电话号码作为登录名
    private String password; //登录密码
    private String sex; //性别
    private Date birthdate; //出生日期
    private String address; //详细地址
    private String email; //邮箱
    private String state; //-1:表示删除 ，1：正常状态
    private Date create_time; //创建时间
    private Date update_time; //修改时间

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Date getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", mobile='" + mobile + '\'' +
                ", password='" + password + '\'' +
                ", sex='" + sex + '\'' +
                ", birthdate=" + birthdate +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", state='" + state + '\'' +
                ", create_time=" + create_time +
                ", update_time=" + update_time +
                '}';
    }
}
