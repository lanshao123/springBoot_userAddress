package com.wh.service;

import com.wh.pojo.UserAdd;
import org.apache.catalina.User;

import java.util.List;

public interface UserAddService {
    void saveUser(UserAdd userAdd);

    List<UserAdd> getUserAddressList();
}
