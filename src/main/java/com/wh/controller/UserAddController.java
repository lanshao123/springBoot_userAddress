package com.wh.controller;

import com.wh.pojo.UserAdd;
import com.wh.service.UserAddService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @program: springBoot_userAddress
 * @description: UserAddController
 * @author: wangheng
 * @create: 2022-07-27 16:53
 **/
@RestController
@RequestMapping("user")
@CrossOrigin
public class UserAddController {
    @Autowired
    private UserAddService userAddService;
    @PostMapping("saveUser")
    public String saveUser(@RequestBody UserAdd userAdd){
        try {
            userAddService.saveUser(userAdd);
            return "0";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "1";
    }
    @GetMapping("/getUserAddressList")
    public List<UserAdd> getUserAddressList(){
        return userAddService.getUserAddressList();
    }
}
