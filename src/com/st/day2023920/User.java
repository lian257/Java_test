package com.st.day2023920;

/**
 * @project JavaProjectWorkSpace
 * @description 用户类
 * @author HuShuangFu
 * @date 2023/9/24 20:01:57
 * @version 1.0
 */
public class User {
    private String username;
    private String password;
    private String email;
    private String age;

    //空参
    public User(){}

    //带参
    public User(String username, String password, String email, String age){
        this.username = username;
        this.password = password;
        this.email = email;
        this.age = age;
    }

    /**
     * 获取
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取
     * @return age
     */
    public String getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(String age) {
        this.age = age;
    }

    public String toString() {
        return "User{username = " + username + ", password = " + password + ", email = " + email + ", age = " + age + "}";
    }
}
