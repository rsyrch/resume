package www.rsyrch.com.resume.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import www.rsyrch.com.resume.pojo.Training;
import www.rsyrch.com.resume.pojo.TrainingExample;

@Mapper
public interface TrainingMapper {
    int countByExample(TrainingExample example);

    int deleteByExample(TrainingExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Training record);

    int insertSelective(Training record);

    List<Training> selectByExample(TrainingExample example);

    Training selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Training record, @Param("example") TrainingExample example);

    int updateByExample(@Param("record") Training record, @Param("example") TrainingExample example);

    int updateByPrimaryKeySelective(Training record);

    int updateByPrimaryKey(Training record);
}