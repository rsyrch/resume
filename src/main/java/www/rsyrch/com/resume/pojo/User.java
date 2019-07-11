package www.rsyrch.com.resume.pojo;

import java.util.Date;

public class User {
    private Integer id;

    private String name;

    private String accoumtnumber;

    private String password;

    private String phone;

    private String email;

    private String birthplace;

    private String idcard;

    private String birthday;

    private Date createtime;

    private Integer status;

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

    public String getAccoumtnumber() {
        return accoumtnumber;
    }

    public void setAccoumtnumber(String accoumtnumber) {
        this.accoumtnumber = accoumtnumber == null ? null : accoumtnumber.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getBirthplace() {
        return birthplace;
    }

    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace == null ? null : birthplace.trim();
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard == null ? null : idcard.trim();
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday == null ? null : birthday.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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