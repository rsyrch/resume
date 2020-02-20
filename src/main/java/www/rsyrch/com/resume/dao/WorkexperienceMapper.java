package www.rsyrch.com.resume.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import www.rsyrch.com.resume.pojo.Workexperience;
import www.rsyrch.com.resume.pojo.WorkexperienceExample;

@Mapper
public interface WorkexperienceMapper {
    int countByExample(WorkexperienceExample example);

    int deleteByExample(WorkexperienceExample example);

    int deleteByPrimaryKey(String id);

    int insert(Workexperience record);

    int insertSelective(Workexperience record);

    List<Workexperience> selectByExample(WorkexperienceExample example);

    Workexperience selectByPrimaryKey(int id);

    int updateByExampleSelective(@Param("record") Workexperience record, @Param("example") WorkexperienceExample example);

    int updateByExample(@Param("record") Workexperience record, @Param("example") WorkexperienceExample example);

    int updateByPrimaryKeySelective(Workexperience record);

    int updateByPrimaryKey(Workexperience record);

    // 更改删除状态
    int updateWorkexperienceDeleteStatusById(@Param("id") int id);
}