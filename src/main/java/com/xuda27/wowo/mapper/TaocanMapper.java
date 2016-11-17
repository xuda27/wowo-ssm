package com.xuda27.wowo.mapper;

import com.xuda27.wowo.pojo.Taocan;
import com.xuda27.wowo.pojo.TaocanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TaocanMapper {
    int countByExample(TaocanExample example);

    int deleteByExample(TaocanExample example);

    int deleteByPrimaryKey(Integer cid);

    int insert(Taocan record);

    int insertSelective(Taocan record);

    List<Taocan> selectByExample(TaocanExample example);

    Taocan selectByPrimaryKey(Integer cid);

    int updateByExampleSelective(@Param("record") Taocan record, @Param("example") TaocanExample example);

    int updateByExample(@Param("record") Taocan record, @Param("example") TaocanExample example);

    int updateByPrimaryKeySelective(Taocan record);

    int updateByPrimaryKey(Taocan record);
}