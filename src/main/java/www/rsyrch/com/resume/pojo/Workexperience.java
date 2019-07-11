package www.rsyrch.com.resume.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Workexperience {
    private String id;

    private String name;

    private Date starttime;

    private Date endtime;

    private String department;

    private String position;

    private BigDecimal salary;

    private String workcontent;

    private Date createtime;

    private Date updatetime;

    private Integer status;

    private String sparefield1;

    private String sparefield2;

    private String sparefield3;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public String getWorkcontent() {
        return workcontent;
    }

    public void setWorkcontent(String workcontent) {
        this.workcontent = workcontent == null ? null : workcontent.trim();
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