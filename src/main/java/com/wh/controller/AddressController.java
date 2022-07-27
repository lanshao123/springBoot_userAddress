package com.wh.controller;

import com.wh.pojo.Address;
import com.wh.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @program: springBoot_userAddress
 * @description: AddressController
 * @author: wangheng
 * @create: 2022-07-27 16:28
 **/
@RestController
@RequestMapping("address")
@CrossOrigin
public class AddressController {
    @Autowired
    private AddressService addressService;
    @GetMapping("findAddressListByParentId/{id}")
    public List<Address> findAddressListByParentId(@PathVariable Integer id){
        return addressService.findAddressListByParentId(id);
    }
}
