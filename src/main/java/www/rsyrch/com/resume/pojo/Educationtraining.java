package www.rsyrch.com.resume.pojo;

import java.util.Date;

public class Educationtraining {
    private Integer id;

    private String educationtrainingname;

    private Date createtime;

    private Date updatetime;

    private Integer status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEducationtrainingname() {
        return educationtrainingname;
    }

    public void setEducationtrainingname(String educationtrainingname) {
        this.educationtrainingname = educationtrainingname == null ? null : educationtrainingname.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}