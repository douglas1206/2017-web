package com.ftguang.controller;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**4
 * Created by Administrator on 2017/5/22.
 */
public class LoginAction extends ActionSupport {

    private String username;
    private String password;

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

    //定义处理用户请求的execute方法
    public String execute() throws Exception {
        //当username为wbb，password为wbb时即登录成功
        if (getUsername().equals("zhangsan") && getPassword().equals("123456")) {
            ActionContext.getContext().getSession().put("user", getUsername());
            return "success";
        } else {
            return "error";
        }
    }

}
