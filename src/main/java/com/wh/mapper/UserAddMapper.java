package com.wh.mapper;

import com.wh.pojo.UserAdd;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @program: springBoot_userAddress
 * @description: UserAddMapper
 * @author: wangheng
 * @create: 2022-07-27 16:51
 **/
@Mapper
public interface UserAddMapper extends tk.mybatis.mapper.common.Mapper<UserAdd> {
    @Select("SELECT u.*,a.name shengname,a1.name shiname,a2.name quname FROM useradd u left join address a\n" +
            "on u.shengId=a.id left join address a1 on a1.id=u.shiId left join address a2 on a2.id=u.quId")
    List<UserAdd> getUserAddressList();
    @Update("update useradd SET isdefault=0 where isdefault=1")
    void updateIsdefault();
}
