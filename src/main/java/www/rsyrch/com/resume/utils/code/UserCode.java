package www.rsyrch.com.resume.utils.code;

public enum UserCode {

    ADD_UER_ERROR(2001, "注册失败"),
    USER_PASSWORD_ERROR(2002, "用户名或密码失败"),
    PARAM_EXCEPTION(2003, "参数异常"),
    ACCOUNT_EXIST(2004, "账号已存在")
    ;

    private int code;
    private String desc;

    UserCode(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
