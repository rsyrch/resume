package www.rsyrch.com.resume.dao;

import org.apache.ibatis.annotations.Param;
import www.rsyrch.com.resume.pojo.Educationtraining;
import www.rsyrch.com.resume.pojo.EducationtrainingExample;
import java.util.List;

public interface EducationtrainingMapper {
    int countByExample(EducationtrainingExample example);

    int deleteByExample(EducationtrainingExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Educationtraining record);

    int insertSelective(Educationtraining record);

    List<Educationtraining> selectByExample(EducationtrainingExample example);

    Educationtraining selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Educationtraining record, @Param("example") EducationtrainingExample example);

    int updateByExample(@Param("record") Educationtraining record, @Param("example") EducationtrainingExample example);

    int updateByPrimaryKeySelective(Educationtraining record);

    int updateByPrimaryKey(Educationtraining record);

    Educationtraining getAllEducationtraining();

    int modifyEducationtrainingById(@Param("id") int id);

    int deleteEuucationtrainingById(@Param("id") int id);
}