package com.racing.model.mapper;

import com.racing.model.po.UserAppointStake;
import com.racing.model.po.UserAppointStakeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserAppointStakeMapper {
    int countByExample(UserAppointStakeExample example);

    int deleteByExample(UserAppointStakeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserAppointStake record);

    int insertSelective(UserAppointStake record);

    List<UserAppointStake> selectByExample(UserAppointStakeExample example);

    UserAppointStake selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserAppointStake record, @Param("example") UserAppointStakeExample example);

    int updateByExample(@Param("record") UserAppointStake record, @Param("example") UserAppointStakeExample example);

    int updateByPrimaryKeySelective(UserAppointStake record);

    int updateByPrimaryKey(UserAppointStake record);
}