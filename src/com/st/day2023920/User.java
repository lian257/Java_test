package com.st.day2023920;

/**
 * @project JavaProjectWorkSpace
 * @description �û���
 * @author HuShuangFu
 * @date 2023/9/24 20:01:57
 * @version 1.0
 */
public class User {
    private String username;
    private String password;
    private String email;
    private String age;

    //�ղ�
    public User(){}

    //����
    public User(String username, String password, String email, String age){
        this.username = username;
        this.password = password;
        this.email = email;
        this.age = age;
    }

    /**
     * ��ȡ
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * ����
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * ��ȡ
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * ����
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * ��ȡ
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * ����
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * ��ȡ
     * @return age
     */
    public String getAge() {
        return age;
    }

    /**
     * ����
     * @param age
     */
    public void setAge(String age) {
        this.age = age;
    }

    public String toString() {
        return "User{username = " + username + ", password = " + password + ", email = " + email + ", age = " + age + "}";
    }
}
