package com.a99zan.mvplogin.bean;

/**
 * Created by 99zan on 2018/4/2.
 */

public class LoginBean {

    /**
     * code : 1
     * msg : {"info":"success!","name":"hu","pwd":"123456"}
     */

    private String code;
    private MsgBean msg;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public MsgBean getMsg() {
        return msg;
    }

    public void setMsg(MsgBean msg) {
        this.msg = msg;
    }

    public static class MsgBean {
        /**
         * info : success!
         * name : hu
         * pwd : 123456
         */

        private String info;
        private String name;
        private String pwd;

        public String getInfo() {
            return info;
        }

        public void setInfo(String info) {
            this.info = info;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPwd() {
            return pwd;
        }

        public void setPwd(String pwd) {
            this.pwd = pwd;
        }
    }
}
