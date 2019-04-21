package com.yunxi.apollodemo.test.dao;

import com.yunxi.apollodemo.test.entity.App;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;


/**
 * @Author: 无双老师【云析学院】
 * @Date: 2019-04-21
 * @Description:
 */
@Mapper
public interface AppDao {
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "appId", column = "appId"),
            @Result(property = "ownerEmail", column = "OwnerEmail"),
    })
    @Select("SELECT * FROM App WHERE id = #{id}")
    App selectById(int id);

}
