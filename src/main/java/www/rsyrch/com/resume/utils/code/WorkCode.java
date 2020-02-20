package www.rsyrch.com.resume.utils.code;

public enum WorkCode {

    WORK_ID_IS_NULL(3001, "工作经历id为空"),
    WORK_IS_NULL(3002, "工作经历不存在"),
    UPDATE_ERROR(3003, "更新工作经历失败"),
    DELETE_WORK_SUCCESS(3004,"工作经历删除成功"),
    DELETE_WORK_ERROR(3005, "工作经历删除失败");

    private int code;
    private String desc;

    WorkCode(int code, String desc) {
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
