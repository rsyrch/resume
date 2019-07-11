package www.rsyrch.com.resume.pojo;

public class Resume {
    private Integer id;

    private Integer userid;

    private Integer educationid;

    private Integer trainingid;

    private Integer positionid;

    private Integer workexperienceid;

    private String applyposition;

    private String personaladvantage;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getEducationid() {
        return educationid;
    }

    public void setEducationid(Integer educationid) {
        this.educationid = educationid;
    }

    public Integer getTrainingid() {
        return trainingid;
    }

    public void setTrainingid(Integer trainingid) {
        this.trainingid = trainingid;
    }

    public Integer getPositionid() {
        return positionid;
    }

    public void setPositionid(Integer positionid) {
        this.positionid = positionid;
    }

    public Integer getWorkexperienceid() {
        return workexperienceid;
    }

    public void setWorkexperienceid(Integer workexperienceid) {
        this.workexperienceid = workexperienceid;
    }

    public String getApplyposition() {
        return applyposition;
    }

    public void setApplyposition(String applyposition) {
        this.applyposition = applyposition == null ? null : applyposition.trim();
    }

    public String getPersonaladvantage() {
        return personaladvantage;
    }

    public void setPersonaladvantage(String personaladvantage) {
        this.personaladvantage = personaladvantage == null ? null : personaladvantage.trim();
    }
}