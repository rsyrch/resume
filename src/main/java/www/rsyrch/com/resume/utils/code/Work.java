package www.rsyrch.com.resume.utils.code;

public enum Work {

    WORK_ID_IS_NULL(3001, "工作经历id为空");

    private int code;
    private String desc;

    Work(int code, String desc) {
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
