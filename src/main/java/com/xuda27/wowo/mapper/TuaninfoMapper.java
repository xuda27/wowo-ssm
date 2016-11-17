package com.xuda27.wowo.mapper;

import com.xuda27.wowo.pojo.Tuaninfo;
import com.xuda27.wowo.pojo.TuaninfoExample;
import com.xuda27.wowo.pojo.TuaninfoWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TuaninfoMapper {
    int countByExample(TuaninfoExample example);

    int deleteByExample(TuaninfoExample example);

    int deleteByPrimaryKey(Integer tid);

    int insert(TuaninfoWithBLOBs record);

    int insertSelective(TuaninfoWithBLOBs record);

    List<TuaninfoWithBLOBs> selectByExampleWithBLOBs(TuaninfoExample example);

    List<Tuaninfo> selectByExample(TuaninfoExample example);

    TuaninfoWithBLOBs selectByPrimaryKey(Integer tid);

    int updateByExampleSelective(@Param("record") TuaninfoWithBLOBs record, @Param("example") TuaninfoExample example);

    int updateByExampleWithBLOBs(@Param("record") TuaninfoWithBLOBs record, @Param("example") TuaninfoExample example);

    int updateByExample(@Param("record") Tuaninfo record, @Param("example") TuaninfoExample example);

    int updateByPrimaryKeySelective(TuaninfoWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(TuaninfoWithBLOBs record);

    int updateByPrimaryKey(Tuaninfo record);
}