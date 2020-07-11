package cn.edu.sdut.springbootstore.entity;

import java.util.Date;

public class User {
    private int userid;
    private String username, password, userroles;
    private Date regtime;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserroles() {
        return userroles;
    }

    public void setUserroles(String userroles) {
        this.userroles = userroles;
    }

    public Date getRegtime() {
        return regtime;
    }

    public void setRegtime(Date regtime) {
        this.regtime = regtime;
    }

    @Override
    public String toString() {
        return "User{" +
                "userid=" + userid +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", userroles='" + userroles + '\'' +
                ", regtime=" + regtime +
                '}';
    }

    public User(int userid, String username, String password, String userroles, Date regtime) {
        this.userid = userid;
        this.username = username;
        this.password = password;
        this.userroles = userroles;
        this.regtime = regtime;
    }

    public User() {
    }
}
