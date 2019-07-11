package www.rsyrch.com.resume.pojo;

import java.util.Date;

public class Training {
    private Integer id;

    private String name;

    private Date starttime;

    private Date endtime;

    private String content;

    private Date createtime;

    private Date updatetime;

    private Integer status;

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

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
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