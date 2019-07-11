package www.rsyrch.com.resume.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import www.rsyrch.com.resume.pojo.Resume;
import www.rsyrch.com.resume.pojo.ResumeExample;

@Mapper
public interface ResumeMapper {
    int countByExample(ResumeExample example);

    int deleteByExample(ResumeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Resume record);

    int insertSelective(Resume record);

    List<Resume> selectByExample(ResumeExample example);

    Resume selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Resume record, @Param("example") ResumeExample example);

    int updateByExample(@Param("record") Resume record, @Param("example") ResumeExample example);

    int updateByPrimaryKeySelective(Resume record);

    int updateByPrimaryKey(Resume record);
}