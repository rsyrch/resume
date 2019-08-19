/*
 * @ClassName: EducationCode
 * @Description:
 * @Date: 2019/8/15 15:40
 **/

package www.rsyrch.com.resume.utils.code;

public enum EducationCode {

    EDUCATION_TRAINING_IS_NULL(3001, "学历名为空"),
    EDUCATION_TRAINING_ID_IS_NULL(3002, "学历id为空");

    private int code;
    private String desc;

    EducationCode(int code, String desc) {
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
