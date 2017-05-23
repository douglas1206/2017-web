package com.ftguang.controller;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by Administrator on 2017/5/22.
 */
public class BizAction extends ActionSupport {

    private String id;

    private String arg = "arg";

    public String getArg() {
        return arg;
    }

    public void setArg(String arg) {
        this.arg = arg;
    }

    private String arg1 = "arg1";

    public String getArg1() {
        return arg1;
    }

    public void setArg1(String arg1) {
        this.arg1 = arg1;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String execute() throws Exception {
//        ActionContext.getContext().getSession().put("arg", getArg());
        return "success";
    }
}
