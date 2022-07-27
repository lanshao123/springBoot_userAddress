package com.wh.service.impl;

import com.wh.mapper.UserAddMapper;
import com.wh.pojo.UserAdd;
import com.wh.service.UserAddService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: springBoot_userAddress
 * @description: UserAddServiceImpl
 * @author: wangheng
 * @create: 2022-07-27 16:51
 **/
@Service
@SuppressWarnings("ALL")
public class UserAddServiceImpl implements UserAddService {
    @Autowired
    private UserAddMapper userAddMapper;
    @Override
    public void saveUser(UserAdd userAdd) {
        //添加地址 首先判断是否选择了默认地址
        if (userAdd.getIsdefault()) {
            //选择了的 把原本的默认地址修改
            userAddMapper.updateIsdefault();
        }
        //在添加地址
        userAddMapper.insert(userAdd);
    }

    @Override
    public List<UserAdd> getUserAddressList() {
        return userAddMapper.getUserAddressList();
    }
}
