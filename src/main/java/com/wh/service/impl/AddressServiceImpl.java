package com.wh.service.impl;

import com.wh.mapper.AddressMapper;
import com.wh.pojo.Address;
import com.wh.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: springBoot_userAddress
 * @description: AddressServiceImpl
 * @author: wangheng
 * @create: 2022-07-27 16:27
 **/
@Service
public class AddressServiceImpl implements AddressService {
    @Autowired
    private AddressMapper addressMapper;
    @Override
    public List<Address> findAddressListByParentId(Integer parentId) {
        return addressMapper.findAddressListByParentId(parentId);
    }
}
