package www.rsyrch.com.resume.pojo;

import java.util.Date;

public class Position {
    private Integer id;

    private String name;

    private Integer fatherid;

    private Integer subordinateid;

    private Integer status;

    private Date createtime;

    private Date updatetime;

    private String sparefield1;

    private String sparefield2;

    private String sparefield3;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getFatherid() {
        return fatherid;
    }

    public void setFatherid(Integer fatherid) {
        this.fatherid = fatherid;
    }

    public Integer getSubordinateid() {
        return subordinateid;
    }

    public void setSubordinateid(Integer subordinateid) {
        this.subordinateid = subordinateid;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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

    public String getSparefield1() {
        return sparefield1;
    }

    public void setSparefield1(String sparefield1) {
        this.sparefield1 = sparefield1 == null ? null : sparefield1.trim();
    }

    public String getSparefield2() {
        return sparefield2;
    }

    public void setSparefield2(String sparefield2) {
        this.sparefield2 = sparefield2 == null ? null : sparefield2.trim();
    }

    public String getSparefield3() {
        return sparefield3;
    }

    public void setSparefield3(String sparefield3) {
        this.sparefield3 = sparefield3 == null ? null : sparefield3.trim();
    }
}