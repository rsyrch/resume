package www.rsyrch.com.resume.utils.code;

public enum UserCode {

    ADD_UER_ERROR(2001, "注册失败"),
    USER_PASSWORD_ERROR(2002, "用户名或密码错误"),
    PARAM_EXCEPTION(2003, "参数异常"),
    ACCOUNT_EXIST(2004, "账号已被注册"),
    OLD_PASSWORD_ERROR(2005, "原密码错误"),
    OLD_PASSWORD_NULL(2009, "新密码为空"),
    NEW_PASSWORD_NULL(2006,"新密码为空"),
    USER_NOTLOGIN_OR_TIMEOUT(2007, "用户未登录或登录超时"),
    CHANGE_PASSWORD_ERROR(2008, "密码修改失败");

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
