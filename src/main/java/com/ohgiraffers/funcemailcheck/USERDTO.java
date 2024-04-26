package com.ohgiraffers.funcemailcheck;

public class USERDTO {
    private String userId;
    private String userPwd;
    private String userCheck;
    private String userAuth;

    public USERDTO() {
    }

    public USERDTO(String userId, String userPwd, String userCheck, String userAuth) {
        this.userId = userId;
        this.userPwd = userPwd;
        this.userCheck = userCheck;
        this.userAuth = userAuth;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public String getUserCheck() {
        return userCheck;
    }

    public void setUserCheck(String userCheck) {
        this.userCheck = userCheck;
    }

    public String getUserAuth() {
        return userAuth;
    }

    public void setUserAuth(String userAuth) {
        this.userAuth = userAuth;
    }

    @Override
    public String toString() {
        return "USERDTO{" +
                "userId='" + userId + '\'' +
                ", userPwd='" + userPwd + '\'' +
                ", userCheck='" + userCheck + '\'' +
                ", userAuth='" + userAuth + '\'' +
                '}';
    }
}
