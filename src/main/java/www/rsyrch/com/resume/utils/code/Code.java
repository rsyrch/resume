package www.rsyrch.com.resume.utils.code;

public enum Code {

    GET_MSG_ERROR(1001, "获取消息异常"),
    ADD_USER_ERROR(1002, "cds");

    private int code;
    private String desc;

    private Code(int code, String desc) {
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

    @Override
    public String toString() {
        return "Code{" +
                "code=" + code +
                ", desc='" + desc + '\'' +
                '}';
    }
}
