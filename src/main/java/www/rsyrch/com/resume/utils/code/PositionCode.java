package www.rsyrch.com.resume.utils.code;

public enum PositionCode {
    ADD_FAILURE(5002, "职业添加失败"),
    NAME_ISNULL(5001, "职业名为空");
    int code;
    String desc;

    PositionCode(int code, String desc) {
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
